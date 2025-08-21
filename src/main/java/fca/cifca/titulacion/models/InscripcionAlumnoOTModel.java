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

    public int getIdInscripcionAlumnoOT() {
        return idInscripcionAlumnoOT;
    }

    public void setIdInscripcionAlumnoOT(int idInscripcionAlumnoOT) {
        this.idInscripcionAlumnoOT = idInscripcionAlumnoOT;
    }

    public ModalidadTitulacionModel getModalidadTitulacion() {
        return modalidadTitulacion;
    }

    public void setModalidadTitulacion(ModalidadTitulacionModel modalidadTitulacion) {
        this.modalidadTitulacion = modalidadTitulacion;
    }

    public OpcionTitulacionModel getOpcionTitulacion() {
        return opcionTitulacion;
    }

    public void setOpcionTitulacion(OpcionTitulacionModel opcionTitulacion) {
        this.opcionTitulacion = opcionTitulacion;
    }

    public AlumnoModel getAlumno() {
        return alumno;
    }

    public void setAlumno(AlumnoModel alumno) {
        this.alumno = alumno;
    }

    public Date getFechaRegistro() {
        return fechaRegistro;
    }

    public void setFechaRegistro(Date fechaRegistro) {
        this.fechaRegistro = fechaRegistro;
    }

    public String getComentario() {
        return comentario;
    }

    public void setComentario(String comentario) {
        this.comentario = comentario;
    }

    public String getEstatus() {
        return estatus;
    }

    public void setEstatus(String estatus) {
        this.estatus = estatus;
    }

    public Date getFechaTesis() {
        return fechaTesis;
    }

    public void setFechaTesis(Date fechaTesis) {
        this.fechaTesis = fechaTesis;
    }

    public Date getFechaInicio() {
        return fechaInicio;
    }

    public void setFechaInicio(Date fechaInicio) {
        this.fechaInicio = fechaInicio;
    }

    public Date getFechaFin() {
        return fechaFin;
    }

    public void setFechaFin(Date fechaFin) {
        this.fechaFin = fechaFin;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getSemestreInicio() {
        return semestreInicio;
    }

    public void setSemestreInicio(String semestreInicio) {
        this.semestreInicio = semestreInicio;
    }

    public String getRecursamiento() {
        return recursamiento;
    }

    public void setRecursamiento(String recursamiento) {
        this.recursamiento = recursamiento;
    }

    public boolean isEsOpcionTitulacion() {
        return esOpcionTitulacion;
    }

    public void setEsOpcionTitulacion(boolean esOpcionTitulacion) {
        this.esOpcionTitulacion = esOpcionTitulacion;
    }

    public OrientacionModel getOrientacion() {
        return orientacion;
    }

    public void setOrientacion(OrientacionModel orientacion) {
        this.orientacion = orientacion;
    }

    public String getCalificacion() {
        return calificacion;
    }

    public void setCalificacion(String calificacion) {
        this.calificacion = calificacion;
    }

    public Date getFechaAprobacion() {
        return fechaAprobacion;
    }

    public void setFechaAprobacion(Date fechaAprobacion) {
        this.fechaAprobacion = fechaAprobacion;
    }

    public AreaConocimientoModel getAreaConocimiento() {
        return areaConocimiento;
    }

    public void setAreaConocimiento(AreaConocimientoModel areaConocimiento) {
        this.areaConocimiento = areaConocimiento;
    }

    public int getFolio() {
        return folio;
    }

    public void setFolio(int folio) {
        this.folio = folio;
    }

    public InscripcionAlumnoOTModel() {
    }

    public InscripcionAlumnoOTModel(int idInscripcionAlumnoOT, ModalidadTitulacionModel modalidadTitulacion, OpcionTitulacionModel opcionTitulacion, AlumnoModel alumno, Date fechaRegistro, String comentario, String estatus, Date fechaTesis, Date fechaInicio, Date fechaFin, String nombre, String semestreInicio, String recursamiento, boolean esOpcionTitulacion, OrientacionModel orientacion, String calificacion, Date fechaAprobacion, AreaConocimientoModel areaConocimiento, int folio) {
        this.idInscripcionAlumnoOT = idInscripcionAlumnoOT;
        this.modalidadTitulacion = modalidadTitulacion;
        this.opcionTitulacion = opcionTitulacion;
        this.alumno = alumno;
        this.fechaRegistro = fechaRegistro;
        this.comentario = comentario;
        this.estatus = estatus;
        this.fechaTesis = fechaTesis;
        this.fechaInicio = fechaInicio;
        this.fechaFin = fechaFin;
        this.nombre = nombre;
        this.semestreInicio = semestreInicio;
        this.recursamiento = recursamiento;
        this.esOpcionTitulacion = esOpcionTitulacion;
        this.orientacion = orientacion;
        this.calificacion = calificacion;
        this.fechaAprobacion = fechaAprobacion;
        this.areaConocimiento = areaConocimiento;
        this.folio = folio;
    }
}
