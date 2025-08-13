package fca.cifca.titulacion.models;

import jakarta.persistence.*;

@Entity
@Table (name = "persona")


public class PersonaModel {
    @Id
    @GeneratedValue (strategy = GenerationType.IDENTITY)
    @Column (name = "pers_id_persona")
    private int pers_id_persona;

}
