package fca.cifca.titulacion.exceptions;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;


@ControllerAdvice

public class ManejadorGlobalExcepciones {

    @ExceptionHandler(CurpInvalidaException.class)
    public ResponseEntity<RespuestaError> handleInvalidCurp(CurpInvalidaException ex) {

        return ResponseEntity.badRequest().body( new RespuestaError(ex.getMessage()) );

    }

    @ExceptionHandler(AlumnoNoEncontradoException.class)
    public ResponseEntity<RespuestaError> handleAlumnoNoEncontrado(AlumnoNoEncontradoException ex) {

        return ResponseEntity.notFound().build();

    }

}
