package fca.cifca.titulacion.models;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table (name = "nivel_grado")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class NivelGradoModel {

    @Id
    @GeneratedValue (strategy = GenerationType.IDENTITY)
    @Column (name = "nigr_id_nivel_grado")
    private Integer idNivelGrado;

    @Column (name = "nigr_nombre", nullable = false, length = 150)
    private String nombre;

}