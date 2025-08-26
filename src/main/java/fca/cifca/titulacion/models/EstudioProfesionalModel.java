package fca.cifca.titulacion.models;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table (name = "estudio_profesional")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class EstudioProfesionalModel {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "espr_id_estudio_prof")
    private int espr_id_estudio_prof;

    @Column(name = "espr_nombre", nullable = false, length = 50)
    private String espr_nombre;

    @Column(name = "espr_id_grado_estudio", nullable = false)
    private int espr_id_grado_estudio;

    @Column(name = "espr_abv1", nullable = true, length = 15)
    private String espr_abv1;

    @Column(name = "espr_abv2", nullable = true, length = 15)
    private String espr_abv2;

}