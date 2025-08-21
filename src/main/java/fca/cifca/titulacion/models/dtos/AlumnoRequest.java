package fca.cifca.titulacion.models.dtos;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class AlumnoRequest {

    @NotBlank
    private String numeroCuenta;
    @NotNull
    private String curp;
}
