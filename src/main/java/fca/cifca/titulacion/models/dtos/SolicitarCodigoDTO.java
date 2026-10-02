package fca.cifca.titulacion.models.dtos;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

//Este DTO es necesario porque aparentemente el correo como String no se parsea bien.
@Data
@NoArgsConstructor
@AllArgsConstructor
public class SolicitarCodigoDTO {
    private String correo;
}
