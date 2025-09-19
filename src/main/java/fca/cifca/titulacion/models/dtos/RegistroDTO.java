package fca.cifca.titulacion.models.dtos;

import fca.cifca.titulacion.enums.Planteles;
import fca.cifca.titulacion.enums.Universidades;
import fca.cifca.titulacion.models.RegistroModel;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.beans.factory.annotation.Value;

import java.time.LocalDate;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class RegistroDTO {


    @Value("${storage.path}")
    private String rutaAlmacenamiento;

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
    public RegistroDTO(RegistroModel registro, String nombreFotografia) {

        this.numeroCuenta = registro.getAlumno().getNumeroCuenta();
        this.nombre = registro.getAlumno().getIdPersona().getPers_nombre();
        this.primerApellido = registro.getAlumno().getIdPersona().getPers_apaterno();
        this.segundoApellido = registro.getAlumno().getIdPersona().getPers_amaterno();
        this.universidadProcedencia = Universidades.UNAM.getNombre();
        this.plantelProcedencia = Planteles.FCA.getNombre();
        this.licenciatura = registro.getAlumno().getIdCarreraPlantel().getCarrera().getNombreCarrera();
        if(registro.getModalidadTitulacion() != null) {
            this.modalidad = registro.getModalidadTitulacion().getNombre();
            this.opcionTitulacion = registro.getModalidadTitulacion().getNombre();
        }
        this.fechaRegistro = registro.getFechaRegistro().toLocalDate();

        //Construir la URL
        if(nombreFotografia == null || nombreFotografia.isBlank()) {
            return;
        }

        this.urlFotografia = "/home/devresident/uploads/files/" + nombreFotografia;

    }

}