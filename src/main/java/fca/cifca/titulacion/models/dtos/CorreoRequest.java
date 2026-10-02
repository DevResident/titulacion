package fca.cifca.titulacion.models.dtos;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class CorreoRequest {

    private String destinatario;
    private String asunto;
    private String mensaje;

}
