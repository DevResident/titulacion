package fca.cifca.titulacion.exceptions;

import lombok.AllArgsConstructor;
import lombok.Data;

//DTO para las respuestas de error en las excepciones.

@Data
@AllArgsConstructor
public class RespuestaError {

    private String error;

}
