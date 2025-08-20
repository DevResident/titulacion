package fca.cifca.titulacion.models;

import jakarta.persistence.*;

//Implementación por definir aún.
@Entity(name = "inscripcion_alumno_ot")
public class RegistroModel {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "iaot_id_inscripcion_alumno_ot")
    private int idRegistroAlumno;

}
