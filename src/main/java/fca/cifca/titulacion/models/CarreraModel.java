package fca.cifca.titulacion.models;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table (name = "carrera")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class CarreraModel {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column (name = "carr_id_carrera")
    private int idCarrera;

    @Column (name = "carr_nombre", nullable = true, length = 250)
    private String nombreCarrera;

    @Column (name = "carr_nombre_completo", nullable = true, length = 40)
    private String nombreCompleto;

    @Column (name = "carr_nombre_corto", nullable = true, length = 8)
    private String nombreCorto;

}