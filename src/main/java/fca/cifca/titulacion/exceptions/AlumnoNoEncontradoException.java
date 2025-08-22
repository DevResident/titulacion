package fca.cifca.titulacion.exceptions;

public class AlumnoNoEncontradoException extends RuntimeException {

    public AlumnoNoEncontradoException() {
        super("No existe el alumno especificado");
    }

}
