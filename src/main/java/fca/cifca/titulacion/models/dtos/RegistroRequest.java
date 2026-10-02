package fca.cifca.titulacion.models.dtos;

import lombok.Data;

import java.time.LocalDate;

//Request que se recibe desde postman u otro lado que mande los datos.
@Data
public class RegistroRequest {

    //Llaves primero para facilitar el envío.
    private Integer idAlumno;
    private Integer idModalidadTitulacion;
    private Integer idOpcionTitulacion;
    private Integer idConvocatoria;
    private Integer idOrientacion;
    private Integer idAreaConocimiento;

    //El resto de atributos del registro.
    private String comentario;
    private String nombre;
    private String semestreInicio;
    private String semestreFin;
    private boolean esOpcionTitulacion;
    private String calificacion;
    private LocalDate fechaInicio;
    private LocalDate fechaFin;
    private LocalDate fechaTesis;
    private LocalDate fecAprobacion;
    private int folio;

}
