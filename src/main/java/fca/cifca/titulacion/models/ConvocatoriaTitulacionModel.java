package fca.cifca.titulacion.models;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.cglib.core.Local;

import java.time.LocalDate;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "convocatoria_titulacion")
public class ConvocatoriaTitulacionModel {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "coti_id_convocatoria_titulacion")
    private Integer coti_id_convocatoria_titulacion;

    @Column(name = "coti_id_modalidad_titulacion")
    private Integer coti_id_modalidad_titulacion;

    @Column(name = "coti_inicio_inscripciones")
    private LocalDate coti_inicio_inscripciones;

    @Column(name = "coti_fin_inscripciones")
    private LocalDate coti_fin_inscripciones;

    @Column(name = "coti_fecha_aplicacion")
    private LocalDate coti_fecha_aplicacion;

    @Column(name = "coti_estado")
    private String coti_estado;

    @Column(name = "coti_fecha_primera")
    private LocalDate coti_fecha_primera;

    @Column(name = "coti_fecha_segunda")
    private LocalDate coti_fecha_segunda;

    @Column(name = "coti_fecha_tercera")
    private LocalDate coti_fecha_tercera;

    @Column(name = "coti_fecha_reinscripcion")
    private LocalDate coti_fecha_reinscripcion;

}