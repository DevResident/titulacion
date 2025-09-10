package fca.cifca.titulacion.services;

import fca.cifca.titulacion.exceptions.AlumnoNoEncontradoException;
import fca.cifca.titulacion.exceptions.BaseDatosNoDisponibleException;
import fca.cifca.titulacion.exceptions.CurpInvalidaException;
import fca.cifca.titulacion.exceptions.NumeroCuentaInvalidoException;
import fca.cifca.titulacion.models.*;
import fca.cifca.titulacion.models.dtos.*;
import fca.cifca.titulacion.repositories.*;
import fca.cifca.titulacion.services.clients.ClientePDF;
import fca.cifca.titulacion.services.interfaces.IAlumnoService;
import fca.cifca.titulacion.utils.ERegex;
import org.springframework.dao.DataAccessException;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;

@Service
public class AlumnoServiceDB implements IAlumnoService {

    //Repositorios para acceder a los datos.
    private final AlumnoRepository alumnoRepository;
    private final RegistroRepository registroRepository;
    private final ModalidadRepository modalidadRepository;
    private final OpcionRepository opcionRepository;
    private final ConvocatoriaRepository convocatoriaRepository;
    private final OrientacionRepository orientacionRepository;
    private final AreaConocimientoRepository areaConocimientoRepository;

    //Cliente PDF.
    public final ClientePDF cliente;

    //DTO.
    private AlumnoDTO alumnoDTO;

    //Inyectar dependencia mediante constructor.
    public AlumnoServiceDB(AlumnoRepository alumnoRepository, RegistroRepository registroRepository,
                           ModalidadRepository modalidadRepository, OpcionRepository opcionRepository,
                           ConvocatoriaRepository convocatoriaRepository, OrientacionRepository orientacionRepository,
                           AreaConocimientoRepository areaConocimientoRepository, ClientePDF cliente) {
        this.alumnoRepository = alumnoRepository;
        this.registroRepository = registroRepository;
        this.modalidadRepository = modalidadRepository;
        this.opcionRepository = opcionRepository;
        this.convocatoriaRepository = convocatoriaRepository;
        this.orientacionRepository = orientacionRepository;
        this.areaConocimientoRepository = areaConocimientoRepository;
        this.cliente = cliente;
    }

    @Override
    public AlumnoDTO buscarAlumno(String numeroCuenta, String curp) {

        try{

            //Verificar que el número de cuenta introducido sí coindica con la regex
            if (!numeroCuenta.matches(ERegex.NUMERO_CUENTA.getPatron())) {

                throw new NumeroCuentaInvalidoException("El número de cuenta no cumple el formato esperado");

            }

            //Validar formato de CURP.
            if(!curp.matches(ERegex.CURP.getPatron()) || curp.length() != 18){

                throw new CurpInvalidaException("La CURP no cumple con el formato esperado");

            }

            return alumnoRepository.findByNumeroCuentaAndCurp(numeroCuenta, curp)
                    .map(AlumnoDTO::new)
                    .orElseThrow(() -> new AlumnoNoEncontradoException
                            ("No se encontró al alumno con los datos proporcionados"));

        } catch(DataAccessException daex){
            throw new BaseDatosNoDisponibleException(daex.getMessage());
        }

    }

    @Override
    public RegistroDTO obtenerRegistro(AlumnoRequest alumnoRequest) {
        return registroRepository.findByNumeroAndCurp(alumnoRequest.getNumeroCuenta(), alumnoRequest.getCurp())
                .map(RegistroDTO::new)
                .orElseThrow(() -> new AlumnoNoEncontradoException("No se encontraron registros asociados."));
    }

    //Aquí ya se crea el PDF.
    public ArchivoDTO generarComprobantePdf(AlumnoRequest alumnoRequest) {

        RegistroDTO dto = obtenerRegistro(alumnoRequest);
        byte[] pdf = cliente.generarComprobante(dto);

        // Aquí decides el nombre dinámico
        String nombreArchivo = dto.getNumeroCuenta() + "-comprobante-titulacion.pdf";

        return new ArchivoDTO(nombreArchivo, pdf);

    }

    @Override
    public RegistroModel registrarAlumno(RegistroRequest request) {

        RegistroModel registro = new RegistroModel();

        //Aquí se hace el enlace entre las entidades.
        AlumnoModel alumno = alumnoRepository.findById(request.getIdAlumno())
                .orElseThrow(() -> new AlumnoNoEncontradoException("Alumno no encontrado"));

        ModalidadTitulacionModel modalidad = modalidadRepository.findById(request.getIdModalidadTitulacion())
                .orElseThrow(() -> new RuntimeException("Modalidad no encontrada"));

        OpcionTitulacionModel opcion = opcionRepository.findById(request.getIdOpcionTitulacion())
                .orElseThrow(() -> new RuntimeException("Opción no encontrada"));

        ConvocatoriaTitulacionModel convocatoria = convocatoriaRepository.findById(request.getIdConvocatoria())
                .orElse(null); // puede ser opcional

        OrientacionModel orientacion = orientacionRepository.findById(request.getIdOrientacion())
                .orElse(null);

        AreaConocimientoModel area = areaConocimientoRepository.findById(request.getIdAreaConocimiento())
                .orElse(null);

        //Posiblemente mover esto a un mapper.
        registro.setAlumno(alumno);
        registro.setModalidadTitulacion(modalidad);
        registro.setOpcionTitulacion(opcion);
        registro.setConvocatoriaTitulacion(convocatoria);
        registro.setOrientacion(orientacion);
        registro.setAreaConocimiento(area);

        registro.setFechaRegistro(LocalDateTime.now());
        registro.setComentario(request.getComentario());
        registro.setEstatus("I");
        registro.setFechaInicio(request.getFechaInicio());
        registro.setFechaFin(request.getFechaFin());
        registro.setNombre(request.getNombre());
        registro.setSemestreInicio(request.getSemestreInicio());
        registro.setSemestreFin(request.getSemestreFin());
        registro.setEsOpcionTitulacion(request.isEsOpcionTitulacion());
        registro.setCalificacion(request.getCalificacion());
        registro.setFecAprobacion(request.getFecAprobacion());
        registro.setFolio(request.getFolio());

         registroRepository.save(registro);

        return null;
    }

}