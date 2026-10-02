package fca.cifca.titulacion.models.dtos;

import lombok.Data;

import java.time.LocalDate;
import java.time.LocalDateTime;

@Data
public class RegistroResponse {

    private Integer idRegistro;
    private Integer idRegistrobdfca; //temporal

    private Integer idAlumno;
    private Integer idModalidadTitulacion;
    private Integer idOpcionTitulacion;
    private Integer idConvocatoria;
    private Integer idOrientacion;
    private Integer idAreaConocimiento;

    private String comentario;
    private String nombre;

    private String semestreInicio;
    private String semestreFin;

    private boolean esOpcionTitulacion;

    private String calificacion;
    private LocalDate fechaInicio;
    private LocalDate fechaFin;
    private LocalDate fecAprobacion;
    private LocalDate fechaTesis;

    private Integer folio;

    private LocalDateTime fechaRegistro;

}
