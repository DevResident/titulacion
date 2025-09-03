package fca.cifca.titulacion.models;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

@Data
@AllArgsConstructor
@NoArgsConstructor
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

}