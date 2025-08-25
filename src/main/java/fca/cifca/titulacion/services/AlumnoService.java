package fca.cifca.titulacion.services;

import fca.cifca.titulacion.exceptions.AlumnoNoEncontradoException;
import fca.cifca.titulacion.exceptions.CurpInvalidaException;
import fca.cifca.titulacion.exceptions.NumeroCuentaInvalidoException;
import fca.cifca.titulacion.models.dtos.AlumnoDTO;
import fca.cifca.titulacion.services.interfaces.IAlumnoService;
import org.springframework.stereotype.Service;
import fca.cifca.titulacion.utils.HashMapAlumno;

@Service
public class AlumnoService implements IAlumnoService {

    private HashMapAlumno alumnos = new HashMapAlumno();

    //Pemrite que termine en dos números (05) o en caracter-número (A6).
    private static final String REGEX_CURP =
            "^[A-Z]{4}\\d{6}[HM][A-Z]{2}[A-Z]{3}(?:[A-Z]\\d|\\d\\d)$";

    private static final String REGEX_NUMEROCUENTA = "^\\d{9}$";

    @Override
    public AlumnoDTO buscarAlumno(String numeroCuenta, String curp) {

        //Verificar que el número de cuenta introducido sí coindica con la regex
        if (!numeroCuenta.matches(REGEX_NUMEROCUENTA)) {

            throw new NumeroCuentaInvalidoException("El número de cuenta no cumple el formato esperado");

        }

        //Validar formato de CURP.
        if(!curp.matches(REGEX_CURP) || curp.length() != 18){

            throw new CurpInvalidaException("La CURP no cumple con el formato esperado");

        }

        //Instanciar al buen alumno
        AlumnoDTO alumno = alumnos.getAlumnos().get(numeroCuenta);

        //Ver que el alumno no sea nulo (pasan cosas feas si lo es)
        if(alumno != null){

            //Después del show anterior, al fin se valida la CURP contra la del alumno
            if(!alumno.getCurp().equalsIgnoreCase(curp)){

                throw new AlumnoNoEncontradoException("El alumno no existe");

            }

            return alumno;

        }

        //Si el alumno no se creó lanzamos excepción pq pues salió mal
        throw new AlumnoNoEncontradoException("El alumno no existe");

    }

}