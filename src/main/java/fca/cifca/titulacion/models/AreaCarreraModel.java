package fca.cifca.titulacion.models;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "area_carrera")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class AreaCarreraModel {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "arca_id_area_carrera")
    private Integer idAreaCarrera;

    @Column(name = "arca_nombre", length = 40)
    private String nombre;

}
