package fca.cifca.titulacion.services;

import fca.cifca.titulacion.exceptions.AlumnoNoEncontradoException;
import fca.cifca.titulacion.exceptions.CurpInvalidaException;
import fca.cifca.titulacion.exceptions.NumeroCuentaInvalidoException;
import fca.cifca.titulacion.models.RegistroModel;
import fca.cifca.titulacion.models.dtos.AlumnoDTO;
import fca.cifca.titulacion.models.dtos.AlumnoRequest;
import fca.cifca.titulacion.models.dtos.RegistroDTO;
import fca.cifca.titulacion.services.interfaces.IAlumnoService;
import fca.cifca.titulacion.utils.HashMapRegistro;
import org.springframework.stereotype.Service;
import fca.cifca.titulacion.utils.HashMapAlumno;
import fca.cifca.titulacion.utils.ERegex;

@Service
public class AlumnoService implements IAlumnoService {

    private HashMapAlumno alumnos = new HashMapAlumno();
    private HashMapRegistro registros = new HashMapRegistro();

    @Override
    public AlumnoDTO buscarAlumno(String numeroCuenta, String curp) {

        //Verificar que el número de cuenta introducido sí coindica con la regex
        if (!numeroCuenta.matches(ERegex.NUMERO_CUENTA.getPatron())) {

            throw new NumeroCuentaInvalidoException("El número de cuenta no cumple el formato esperado");

        }

        //Validar formato de CURP.
        if(!curp.matches(ERegex.CURP.getPatron()) || curp.length() != 18){

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

    @Override
    public RegistroDTO obtenerRegistro(AlumnoRequest alumnoRequest) {

        return registros.getRegistros().getOrDefault(alumnoRequest.getNumeroCuenta(), null);

    }

    @Override
    public RegistroModel registrarAlumno(RegistroDTO registro){

        return null;

    }

}