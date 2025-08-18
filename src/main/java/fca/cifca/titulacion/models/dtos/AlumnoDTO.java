package fca.cifca.titulacion.models.dtos;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor

public class AlumnoDTO {
    private String numeroCuenta;
    private String nombre;
    private String primerApellido;
    private String segundoApellido;
    private char sexo;
    private String nacionalidad;
    private String curp;
}
