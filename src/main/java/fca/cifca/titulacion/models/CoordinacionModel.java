package fca.cifca.titulacion.models;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table (name = "coor_id_coordinacion")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class CoordinacionModel {

    @Id
    @GeneratedValue (strategy = GenerationType.IDENTITY)
    @Column (name = "coor_id_coordinacion")
    private int idCoordinacion;

    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn (name = "coor_id_division", nullable = false)
    private DivisionModel division;

    @Column (name = "coor_nombre", nullable = false, length = 100)
    private String nombre;

    @Column (name = "coor_edo", nullable = true, length = 1)
    private String edo;

    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn (name = "coor_id_grado")
    private GradoModel grado;

}
