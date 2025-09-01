package fca.cifca.titulacion.services;

import fca.cifca.titulacion.exceptions.AlumnoNoEncontradoException;
import fca.cifca.titulacion.exceptions.BaseDatosNoDisponibleException;
import fca.cifca.titulacion.exceptions.CurpInvalidaException;
import fca.cifca.titulacion.exceptions.NumeroCuentaInvalidoException;
import fca.cifca.titulacion.models.AlumnoModel;
import fca.cifca.titulacion.models.dtos.AlumnoDTO;
import fca.cifca.titulacion.models.dtos.AlumnoRequest;
import fca.cifca.titulacion.models.dtos.RegistroDTO;
import fca.cifca.titulacion.repositories.RegistroRepository;
import fca.cifca.titulacion.services.interfaces.IAlumnoService;
import fca.cifca.titulacion.utils.ERegex;
import fca.cifca.titulacion.repositories.AlumnoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataAccessException;

public class AlumnoServiceDB implements IAlumnoService {

    //Repositorio para acceder a los datos.
    private final AlumnoRepository alumnoRepository;
    private final RegistroRepository registroRepository;

    //DTO.
    private AlumnoDTO alumnoDTO;

    //Inyectar dependencia mediante constructor.
    public AlumnoServiceDB(AlumnoRepository alumnoRepository, RegistroRepository registroRepository ) {
        this.alumnoRepository = alumnoRepository;
        this.registroRepository = registroRepository;
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

            throw new BaseDatosNoDisponibleException("La base de datos se cagó encima y no se puede acceder a ella: "
            + daex.getMessage());
        }

    }

    @Override
    public RegistroDTO obtenerRegistro(AlumnoRequest alumnoRequest) {
        return registroRepository.findByNumeroAndCurp(alumnoRequest.getNumeroCuenta(), alumnoRequest.getCurp())
                .orElseThrow(() -> new AlumnoNoEncontradoException("No se encontraron registros asociados."));
    }
}
