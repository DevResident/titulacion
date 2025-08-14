package fca.cifca.titulacion.models;

import jakarta.persistence.*;
import java.util.Date;

@Entity
@Table(name = "convocatoria_titulacion")
public class ConvocatoriaTitulacionModel {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "coti_id_convocatoria_titulacion")
    private int coti_id_convocatoria_titulacion;

    @Column(name = "coti_id_modalidad_titulacion")
    private int coti_id_modalidad_titulacion;

    @Column(name = "coti_inicio_inscripciones")
    private Date coti_inicio_inscripciones;

    @Column(name = "coti_fin_inscripciones")
    private Date coti_fin_inscripciones;

    @Column(name = "coti_fecha_aplicacion")
    private Date coti_fecha_aplicacion;

    @Column(name = "coti_estado")
    private char coti_estado;

    @Column(name = "coti_fecha_primera")
    private Date coti_fecha_primera;

    @Column(name = "coti_fecha_segunda")
    private Date coti_fecha_segunda;

    @Column(name = "coti_fecha_tercera")
    private Date coti_fecha_tercera;

    @Column(name = "coti_fecha_reinscripcion")
    private Date coti_fecha_reinscripcion;

    public int getCoti_id_convocatoria_titulacion() {
        return coti_id_convocatoria_titulacion;
    }

    public void setCoti_id_convocatoria_titulacion(int coti_id_convocatoria_titulacion) {
        this.coti_id_convocatoria_titulacion = coti_id_convocatoria_titulacion;
    }

    public int getCoti_id_modalidad_titulacion() {
        return coti_id_modalidad_titulacion;
    }

    public void setCoti_id_modalidad_titulacion(int coti_id_modalidad_titulacion) {
        this.coti_id_modalidad_titulacion = coti_id_modalidad_titulacion;
    }

    public Date getCoti_inicio_inscripciones() {
        return coti_inicio_inscripciones;
    }

    public void setCoti_inicio_inscripciones(Date coti_inicio_inscripciones) {
        this.coti_inicio_inscripciones = coti_inicio_inscripciones;
    }

    public Date getCoti_fin_inscripciones() {
        return coti_fin_inscripciones;
    }

    public void setCoti_fin_inscripciones(Date coti_fin_inscripciones) {
        this.coti_fin_inscripciones = coti_fin_inscripciones;
    }

    public Date getCoti_fecha_aplicacion() {
        return coti_fecha_aplicacion;
    }

    public void setCoti_fecha_aplicacion(Date coti_fecha_aplicacion) {
        this.coti_fecha_aplicacion = coti_fecha_aplicacion;
    }

    public char getCoti_estado() {
        return coti_estado;
    }

    public void setCoti_estado(char coti_estado) {
        this.coti_estado = coti_estado;
    }

    public Date getCoti_fecha_primera() {
        return coti_fecha_primera;
    }

    public void setCoti_fecha_primera(Date coti_fecha_primera) {
        this.coti_fecha_primera = coti_fecha_primera;
    }

    public Date getCoti_fecha_segunda() {
        return coti_fecha_segunda;
    }

    public void setCoti_fecha_segunda(Date coti_fecha_segunda) {
        this.coti_fecha_segunda = coti_fecha_segunda;
    }

    public Date getCoti_fecha_tercera() {
        return coti_fecha_tercera;
    }

    public void setCoti_fecha_tercera(Date coti_fecha_tercera) {
        this.coti_fecha_tercera = coti_fecha_tercera;
    }

    public Date getCoti_fecha_reinscripcion() {
        return coti_fecha_reinscripcion;
    }

    public void setCoti_fecha_reinscripcion(Date coti_fecha_reinscripcion) {
        this.coti_fecha_reinscripcion = coti_fecha_reinscripcion;
    }

    public ConvocatoriaTitulacionModel(int coti_id_modalidad_titulacion, Date coti_inicio_inscripciones,
                                       Date coti_fin_inscripciones, Date coti_fecha_aplicacion,
                                       char coti_estado, Date coti_fecha_primera,
                                       Date coti_fecha_segunda, Date coti_fecha_tercera,
                                       Date coti_fecha_reinscripcion) {
        this.coti_id_modalidad_titulacion = coti_id_modalidad_titulacion;
        this.coti_inicio_inscripciones = coti_inicio_inscripciones;
        this.coti_fin_inscripciones = coti_fin_inscripciones;
        this.coti_fecha_aplicacion = coti_fecha_aplicacion;
        this.coti_estado = coti_estado;
        this.coti_fecha_primera = coti_fecha_primera;
        this.coti_fecha_segunda = coti_fecha_segunda;
        this.coti_fecha_tercera = coti_fecha_tercera;
        this.coti_fecha_reinscripcion = coti_fecha_reinscripcion;
    }

    public ConvocatoriaTitulacionModel() {
    }
}