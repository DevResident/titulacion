package fca.cifca.titulacion.models.dtos;

import fca.cifca.titulacion.models.RegistroModel;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import java.time.LocalDate;

@Data
@AllArgsConstructor
@NoArgsConstructor
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

    @NotNull
    private String urlFotografia;

    //Constructor a base del modelo.
    public RegistroDTO(RegistroModel registro) {

        this.numeroCuenta = registro.getAlumno().getNumeroCuenta();
        this.nombre = registro.getAlumno().getIdPersona().getPers_nombre();
        this.primerApellido = registro.getAlumno().getIdPersona().getPers_apaterno();
        this.segundoApellido = registro.getAlumno().getIdPersona().getPers_amaterno();
        this.universidadProcedencia = "Universidad Nacional Autónoma de México";
        this.plantelProcedencia = "FCA";
        this.licenciatura = registro.getAlumno().getIdCarreraPlantel().getCarrera().getNombreCarrera();
        if(registro.getModalidadTitulacion() != null) {
            this.modalidad = registro.getModalidadTitulacion().getNombre();
            this.opcionTitulacion = registro.getModalidadTitulacion().getNombre();
        }
        this.fechaRegistro = registro.getFechaRegistro().toLocalDate();
        //Ver qué hacer con la bendita fotografía luego
        this.urlFotografia = "https://wiki.teamfortress.com/w/images/e/e6/Engineerava.jpg";
    }

}