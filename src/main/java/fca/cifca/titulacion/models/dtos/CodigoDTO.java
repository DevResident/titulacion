package fca.cifca.titulacion.models.dtos;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class CodigoDTO {

    private String correo;
    private String codigo;
    private LocalDateTime expiracion;

}
