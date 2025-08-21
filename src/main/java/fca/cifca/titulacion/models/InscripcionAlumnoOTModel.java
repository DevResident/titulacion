package fca.cifca.titulacion.models;

import jakarta.persistence.*;

import java.sql.Date;

@Entity
@Table (name = "inscripcion_alumno_ot")

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

    @Column (name = "iaot_fecha_registro", nullable = false)
    private Date fechaRegistro;

    @Column (name = "iaot_comentario", nullable = true)
    private String comentario;

    @Column (name = "iaot_estatus", nullable = false)
    private String estatus;

    @ManyToOne (fetch = FetchType.EAGER)
    @JoinColumn (name = "iaot_id_convocatoria_titulacion")
    private ConvocatoriaTitulacionModel convocatoriaTitulacion;

}
