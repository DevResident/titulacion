package fca.cifca.titulacion.models;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table (name = "area")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class AreaModel {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "area_id_area")
    private Integer idArea;

    @Column(name = "area_id_operador", nullable = true, length = 4)
    private Integer idOperador;

    @Column(name = "area_id_persona")
    private Integer idPersona;

    @Column(name = "area_id_area_superior")
    private Integer idAreaSuperior;

    @Column(name = "area_nombre", nullable = true, length = 150)
    private String nombreArea;

    @Column(name = "area_clave", nullable = true, length = 5)
    private String claveArea;

    @Column(name = "area_abreviatura", nullable = true, length = 5)
    private String abreviaturaArea;

}