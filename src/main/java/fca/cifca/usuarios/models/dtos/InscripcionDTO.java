package fca.cifca.usuarios.models.dtos;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class InscripcionDTO {

    private Integer idInscripcion;
    private Integer idUsuario;
    private Integer idEstatus;
    private String periodo;

}
