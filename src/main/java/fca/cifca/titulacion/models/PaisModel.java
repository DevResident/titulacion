package fca.cifca.titulacion.models;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table (name = "pais")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class PaisModel {
    @Id
    @GeneratedValue (strategy = GenerationType.IDENTITY)
    @Column (name = "pais_id_pais")
    private Integer pais_id_pais;

    @Column (name = "pais_nombre", length = 100, nullable = false)
    private String pais_nombre;

    @Column (name = "pais_nacionalidad", length = 50, nullable = true)
    private String pais_nacionalidad;

    @Column (name = "pais_cve_lada", length = 8, nullable = true)
    private String pais_cve_lada;

}