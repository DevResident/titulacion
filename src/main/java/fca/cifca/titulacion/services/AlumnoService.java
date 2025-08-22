package fca.cifca.titulacion.services;

import fca.cifca.titulacion.exceptions.CurpInvalidaException;
import fca.cifca.titulacion.models.dtos.AlumnoDTO;
import fca.cifca.titulacion.services.interfaces.IAlumnoService;
import org.springframework.stereotype.Service;
import fca.cifca.titulacion.utils.ValidadorCurp;
import fca.cifca.titulacion.utils.HashMapAlumno;

@Service
public class AlumnoService implements IAlumnoService {

    private HashMapAlumno alumnos = new HashMapAlumno();

    //Para validar formato de la CUPR.
    private ValidadorCurp validadorCurp = new ValidadorCurp();

    @Override
    public AlumnoDTO buscarAlumno(String numeroCuenta, String curp) {

        AlumnoDTO alumno = alumnos.getAlumnos().get(numeroCuenta);

        //Validación de patrón mediante parámetro curp.
        if(!validadorCurp.validar(curp)){

            throw new CurpInvalidaException("La CURP no tiene la longitud esperada.");

        }

        // 🔎 Validación de curp
        if (alumno != null && alumno.getCurp().equalsIgnoreCase(curp)) {

            return alumno;

        }

        // Si no coincide se regresa nulo
        return null;
    }

}
