package fca.cifca.titulacion.models;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;
import java.time.LocalDateTime;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity(name = "inscripcion_alumno_ot")
public class RegistroModel {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "iaot_id_inscripcion_alumno_ot")
    private Integer idRegistroAlumno;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "iaot_id_modalidad_titulacion", nullable = false)
    private ModalidadTitulacionModel modalidadTitulacion;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "iaot_id_opcion_titulacion")
    private OpcionTitulacionModel opcionTitulacion;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "iaot_id_alumno")
    private AlumnoModel alumno;

    @Column(name = "iaot_fecha_registro")
    private LocalDateTime fechaRegistro;

    @Column(name = "iaot_comentario")
    private String comentario;

    @Column(name = "iaot_estatus")
    private String estatus;

    @Column(name = "iaot_id_asesor")
    private Integer idAsesor = null;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "iaot_id_convocatoria_titulacion")
    private ConvocatoriaTitulacionModel convocatoriaTitulacion;

    @Column(name = "iaot_fecha_tesis")
    private LocalDate fechaTesis;

    @Column(name = "iaot_fecha_inicio")
    private LocalDate fechaInicio;

    @Column(name = "iaot_fecha_fin")
    private LocalDate fechaFin;

    //Según la consulta, esto es nulo, no hay registros con ese campo diferente a nulo
    @Column(name = "iaot_nombre")
    private String nombre;

    @Column(name = "iaot_semestre_inicio", length = 7)
    private String semestreInicio;

    @Column(name = "iaot_semestre_fin", length = 7)
    private String semestreFin;

    @Column(name = "iaot_es_opcion_titulacion")
    private Boolean esOpcionTitulacion;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "iaot_id_orientacion")
    private OrientacionModel orientacion;

    @Column(name = "iaot_calificacion")
    private String calificacion;

    @Column(name = "iaot_fec_aprobacion")
    private LocalDate fecAprobacion;

    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "iaot_id_area_conocimiento")
    private AreaConocimientoModel areaConocimiento;

    @Column(name = "iaot_folio")
    private int folio;

}