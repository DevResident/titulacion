package fca.cifca.titulacion.models;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table (name = "carrera_plantel")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class CarreraPlantelModel {
    @Id
    @GeneratedValue (strategy = GenerationType.IDENTITY)
    @Column (name = "capa_id_carrera_plantel")
    private int idCarreraPlantel;

    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn (name = "capa_id_carrera", nullable = false)
    private CarreraModel carrera;

    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn (name = "capa_id_institucion", nullable = false)
    private InstitucionModel institucion;

}
