package fca.cifca.titulacion.models;

import jakarta.persistence.*;

@Entity
@Table (name = "inscripcion_alumno_ot")

public class InscripcionAlumnoOTModel {

    @Id
    @GeneratedValue (strategy = GenerationType.IDENTITY)
    @Column (name = "iaot_id_inscripcion_alumno_ot")
    private int iaot_id_inscripcion_alumno_ot;


}
