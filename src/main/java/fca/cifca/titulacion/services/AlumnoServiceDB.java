package fca.cifca.titulacion.services;

import fca.cifca.titulacion.exceptions.AlumnoNoEncontradoException;
import fca.cifca.titulacion.exceptions.BaseDatosNoDisponibleException;
import fca.cifca.titulacion.exceptions.NumeroCuentaInvalidoException;
import fca.cifca.titulacion.models.*;
import fca.cifca.titulacion.models.dtos.*;
import fca.cifca.titulacion.repositories.*;
import fca.cifca.titulacion.services.clients.ClientePDF;
import fca.cifca.titulacion.services.interfaces.IAlumnoService;
import fca.cifca.titulacion.enums.ERegex;
import fca.cifca.titulacion.utils.CreadorPeriodo;
import fca.cifca.usuarios.models.EstatusModel;
import fca.cifca.usuarios.models.InscripcionModel;
import fca.cifca.usuarios.models.UsuarioModel;
import fca.cifca.usuarios.models.dtos.InscripcionDTO;
import fca.cifca.usuarios.repositories.EstatusRepository;
import fca.cifca.usuarios.repositories.InscripcionRepository;
import fca.cifca.usuarios.repositories.UsuarioRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.dao.DataAccessException;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.time.LocalDateTime;
import java.util.Optional;

@Service
@RequiredArgsConstructor
public class AlumnoServiceDB implements IAlumnoService {

    //Repositorios para acceder a los datos.
    private final AlumnoRepository alumnoRepository;
    private final RegistroRepository registroRepository;
    private final ModalidadRepository modalidadRepository;
    private final OpcionRepository opcionRepository;
    private final ConvocatoriaRepository convocatoriaRepository;
    private final OrientacionRepository orientacionRepository;
    private final AreaConocimientoRepository areaConocimientoRepository;
    //Repositorio para los alumnos en la bd complementaria.
    private final UsuarioRepository usuarioRepository;
    //Repositorio donde se llena la inscripción en la BD.
    private final InscripcionRepository inscripcionRepository;
    private final EstatusRepository estatusRepository;

    //5ta vez que intento arreglar la ruta.
    @Value("${storage.path}")
    private String rutaBase;

    //Cliente PDF.
    public final ClientePDF cliente;

    @Override
    public AlumnoDTO buscarAlumno(String numeroCuenta) {

        try {

            //Verificar que el número de cuenta introducido sí coindica con la regex
            if (!numeroCuenta.matches(ERegex.NUMERO_CUENTA.getPatron())) {

                throw new NumeroCuentaInvalidoException("El número de cuenta no cumple el formato esperado");

            }

            return alumnoRepository.findByNumeroCuenta(numeroCuenta)
                    .map(AlumnoDTO::new)
                    .orElseThrow(() -> new AlumnoNoEncontradoException
                            ("No se encontró al alumno con los datos proporcionados"));

        } catch (DataAccessException daex) {
            throw new BaseDatosNoDisponibleException(daex.getMessage());
        }

    }

    @Override
    public RegistroDTO obtenerRegistro(String numeroCuenta, String curp) {

        //Dejar foto en min�sculas, si no no lo encuentra
        String pathRelativo = "/" + numeroCuenta + "_" + curp + "/" + numeroCuenta + "_foto";

        return registroRepository
                .findByNumeroCuenta(numeroCuenta)
                .map(registro ->
                        new RegistroDTO(registro, rutaBase, pathRelativo))
                .orElseThrow(() -> new AlumnoNoEncontradoException("No se encontraron registros asociados."));
    }

    @Override
    public ArchivoDTO generarComprobantePdf(String numeroCuenta) {

        AlumnoDTO alumnoDTO = buscarAlumno(numeroCuenta);
        RegistroDTO registroDto = obtenerRegistro(numeroCuenta, alumnoDTO.getCurp());
        byte[] pdf = cliente.generarComprobante(registroDto);

        // Aquí se crea el nombre dinámico del pdf
        String nombreArchivo = registroDto.getNumeroCuenta() + "_" + alumnoDTO.getCurp() + "-comprobante-titulacion.pdf";

        return new ArchivoDTO(nombreArchivo, pdf);

    }

    @Override
    @Transactional //Para evitar que se hagan transacciones mal formadas.
    public RegistroModel registrarAlumno(RegistroRequest request) {

        CreadorPeriodo creadorPeriodo = new CreadorPeriodo();

        RegistroModel registro = new RegistroModel();

        //Esto se usa casi al final.
        InscripcionModel inscripcion = new InscripcionModel();

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

        //Esto es una mala idea, pero es la forma más sencilla del manejo de inscripción.
        //Este meollo esto para extraer el ID del usuario y ponerlo en las inscripciones.
        UsuarioModel usuario = usuarioRepository.findByUsuario(alumno.getNumeroCuenta())
                .orElseThrow(() -> new RuntimeException("Usuario no encontrado"));
        EstatusModel estatus = estatusRepository.findByEstatus("PENDIENTE")
                .orElseThrow(() -> new RuntimeException("Estatus no encontrado"));
        inscripcion.setUsuario(usuario);
        inscripcion.setEstatus(estatus);
        inscripcion.setPeriodo(creadorPeriodo.crearPeriodo());
        inscripcionRepository.save(inscripcion);

        return registro;

    }

}