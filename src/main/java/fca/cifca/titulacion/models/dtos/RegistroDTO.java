package fca.cifca.titulacion.models.dtos;

import lombok.AllArgsConstructor;
import lombok.Data;

import java.util.Date;

@Data
@AllArgsConstructor
public class RegistroDTO {

    private String numeroCuenta;
    private String nombre;
    private String primerApellido;
    private String segundoApellido;
    private String universidad; //Ver si se queda como string o si se hace tabla.
    private String carrera; //Ibid.
    private String opcionTitulacion; //Ibid.
    private Date fechaAplicacion;
    private Date fechaRegistro;


}
