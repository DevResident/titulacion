package fca.cifca.titulacion.models.dtos;

import fca.cifca.titulacion.models.RegistroModel;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import lombok.AllArgsConstructor;
import lombok.Data;

import java.time.LocalDate;
import java.util.Date;

@Data
@AllArgsConstructor
public class RegistroDTO {

    @NotBlank
    private String numeroCuenta;

    @NotNull
    private String nombre;

    @NotNull
    private String primerApellido;

    @NotNull
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

    //Constructor a base del modelo.
    public RegistroDTO(RegistroModel registro) {

        this.numeroCuenta = registro.getAlumno().getNumeroCuenta();
        this.nombre = registro.getAlumno().getIdPersona().getPers_nombre();
        this.primerApellido = registro.getAlumno().getIdPersona().getPers_apaterno();
        this.segundoApellido = registro.getAlumno().getIdPersona().getPers_amaterno();
        //this.universidadProcedencia = registro.
        //this.plantelProcedencia = registro.get
        //this.licenciatura = registro.getAlumno().getIdCarreraPlantel().getCarrera().getNombreCarrera();
        if(registro.getOpcionTitulacion() != null) {
            this.modalidad = registro.getOpcionTitulacion().getNombre();
        }
        if(registro.getOpcionTitulacion() != null) {
            this.fechaRegistro = registro.getFechaRegistro().toLocalDate();
            this.fechaAplicacion = registro.getFechaRegistro().toLocalDate();
        }

    }

}