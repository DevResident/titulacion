package fca.cifca.titulacion.models.dtos;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import lombok.AllArgsConstructor;
import lombok.Data;

import java.time.LocalDate;

@Data
@AllArgsConstructor
public class ComprobanteRequest {

    @NotBlank
    private String numeroCuenta;

    @NotNull
    private String nombre;

    @NotNull
    private String primerApellido;

    private String segundoApellido;

    @NotNull
    private String universidadProcedencia;

    @NotNull
    private String plantelProcedencia;

    @NotNull
    private String licenciatura;

    @NotNull
    private String opcionTitulacion;

    @NotNull
    private String modalidad;

    @NotNull
    private LocalDate fechaRegistro;

    @NotNull
    private LocalDate fechaAplicacion;

}