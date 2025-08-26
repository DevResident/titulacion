//Faltan las entidades con las que tiene relación

package fca.cifca.titulacion.models;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table (name = "puesto")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class PuestoModel {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "pues_id_puesto")
    private int pues_id_puesto;

    @Column(name = "pues_descripcion", nullable = true, length = 200)
    private String pues_descripcion;

    @Column(name = "pues_rango", nullable = true)
    private int pues_rango;

    @Column(name = "pues_id_coordinacion", nullable = true, length = 6)
    private String pues_id_coordinacion;

    @Column(name = "pues_id_division", nullable = true, length = 2)
    private String pues_id_division;

    @Column(name = "pues_es_jefe_area", nullable = true)
    private boolean pues_es_jefe_area;


}