package fca.cifca.titulacion.exceptions;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import java.net.ConnectException;


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

    @ExceptionHandler(NumeroCuentaInvalidoException.class)
    public ResponseEntity<RespuestaError> handleNumeroCuentaInvalido(NumeroCuentaInvalidoException ex) {

        return ResponseEntity.badRequest().body( new RespuestaError(ex.getMessage()) );

    }

    @ExceptionHandler(ConnectException.class)
    public ResponseEntity<String> handleConnectException(ConnectException ex) {

        return ResponseEntity
                .status(HttpStatus.INTERNAL_SERVER_ERROR)
                .body("No se pudo conectar con el microservicio: " + ex.getMessage());

    }

    @ExceptionHandler(RegistroExistenteException.class)
    public ResponseEntity<String> handleRegistroExistente(RegistroExistenteException ex) {
        return ResponseEntity
                .status(HttpStatus.CONFLICT)
                .body(ex.getMessage());
    }

}
