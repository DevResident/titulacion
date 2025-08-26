package fca.cifca.titulacion.models;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.sql.Date;

@Entity
@Table (name = "inscripcion_alumno_ot")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class InscripcionAlumnoOTModel {

    @Id
    @GeneratedValue (strategy = GenerationType.IDENTITY)
    @Column (name = "iaot_id_inscripcion_alumno_ot")
    private int idInscripcionAlumnoOT;

    @ManyToOne (fetch = FetchType.EAGER)
    @JoinColumn (name = "iaot_id_modalidad_titulacion", nullable = false)
    private ModalidadTitulacionModel modalidadTitulacion;

    @ManyToOne (fetch = FetchType.EAGER)
    @JoinColumn (name = "iaot_id_opcion_titulacion", nullable = true)
    private OpcionTitulacionModel opcionTitulacion;

    @OneToOne (cascade = CascadeType.ALL)
    @JoinColumn (name = "iaot_id_alumno", nullable = false)
    private AlumnoModel alumno;

    @Column (name = "iaot_fecha_registro", nullable = true)
    private Date fechaRegistro;

    @Column (name = "iaot_comentario", nullable = true)
    private String comentario;

    @Column (name = "iaot_estatus", nullable = true)
    private String estatus;

    @Column (name = "iaot_fecha_tesis", nullable = true)
    private Date fechaTesis;

    @Column (name = "iaot_fecha_inicio", nullable = true)
    private Date fechaInicio;

    @Column (name = "iaot_fecha_fin", nullable = true)
    private Date fechaFin;

    @Column (name = "iaot_nombre", nullable = true)
    private String nombre;

    @Column (name = "iaot_semestre_inicio", nullable = true, length = 7)
    private String semestreInicio;

    @Column (name = "iaot_recursamiento", nullable = true)
    private String recursamiento;

    @Column (name = "iaot_es_opcion_titulacion", nullable = true)
    private boolean esOpcionTitulacion;

    @ManyToOne
    @JoinColumn (name = "iaot_id_orientacion", nullable = true)
    private OrientacionModel orientacion;

    @Column (name = "iaot_calificacion", nullable = true, length = 4)
    private String calificacion;

    @Column (name = "iaot_fec_aprobacion", nullable = true)
    private Date fechaAprobacion;

    @ManyToOne
    @JoinColumn (name = "iaot_id_area_conocimiento", nullable = true)
    private AreaConocimientoModel areaConocimiento;

    @Column (name = "iaot_folio", nullable = true)
    private int folio;


}