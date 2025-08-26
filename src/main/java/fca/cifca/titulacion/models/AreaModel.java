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
    private int idArea;
    @Column(name = "area_id_operador", nullable = true, length = 4)
    private int idOperador;
    @Column(name = "area_id_persona")
    private int idPersona;
    @Column(name = "area_id_area_superior")
    private int idAreaSuperior;
    @Column(name = "area_nombre", nullable = true, length = 150)
    private String nombreArea;
    @Column(name = "area_clave", nullable = true, length = 5)
    private String claveArea;
    @Column(name = "area_abreviatura", nullable = true, length = 5)
    private String abreviaturaArea;

}