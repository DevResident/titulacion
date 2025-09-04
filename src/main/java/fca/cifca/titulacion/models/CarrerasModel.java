package fca.cifca.titulacion.models;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "carreras")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class CarrerasModel {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "carr_id_carrera")
    private Integer idCarrera;

    @Column(name = "carr_clave")
    private String claveCarrera;

    @Column(name = "carr_nombre")
    private String nombreCarrera;



}
