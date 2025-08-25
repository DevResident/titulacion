package fca.cifca.titulacion.services;

import fca.cifca.titulacion.exceptions.AlumnoNoEncontradoException;
import fca.cifca.titulacion.exceptions.CurpInvalidaException;
import fca.cifca.titulacion.models.dtos.AlumnoDTO;
import fca.cifca.titulacion.services.interfaces.IAlumnoService;
import org.springframework.stereotype.Service;
import fca.cifca.titulacion.utils.HashMapAlumno;

@Service
public class AlumnoService implements IAlumnoService {

    private HashMapAlumno alumnos = new HashMapAlumno();

    private String error;

    //Pemrite que termine en dos números (05) o en caracter-número (A6).
    private static final String REGEX_CURP =
            "^[A-Z]{4}\\d{6}[HM][A-Z]{2}[A-Z]{3}(?:[A-Z]\\d|\\d\\d)$";

    @Override
    public AlumnoDTO buscarAlumno(String numeroCuenta, String curp) {

        AlumnoDTO alumno = alumnos.getAlumnos().get(numeroCuenta);


        //Validación de patrón mediante parámetro curp.
        if(!curp.matches(REGEX_CURP) && curp.length() < 18 ) {

            error = "La CURP es errónea.";
            throw new CurpInvalidaException(error);

        }

        // 🔎 Validación de curp
        if (alumno != null && alumno.getCurp().equalsIgnoreCase(curp)) {

            return alumno;

        }

        // Si no coincide tiramos una excepción.
        throw new AlumnoNoEncontradoException("El alumno no existe");
    }

}
