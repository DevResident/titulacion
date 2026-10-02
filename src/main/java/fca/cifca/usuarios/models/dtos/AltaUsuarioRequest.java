package fca.cifca.usuarios.models.dtos;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class AltaUsuarioRequest {

    private String numeroCuenta;
    private String correo;
    private String codigo;

}
