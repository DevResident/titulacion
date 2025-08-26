package fca.cifca.titulacion.models;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table (name = "modalidad_titulacion")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class ModalidadTitulacionModel {

    @Id
    @GeneratedValue (strategy = GenerationType.IDENTITY)
    @Column (name = "moti_id_modalidad_titulacion")
    private int idModalidadTitulacion;

    @Column (name = "moti_nombre", nullable = false, length = 60)
    private String nombre;

    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn (name = "moti_id_coordinacion", nullable = true)
    private CoordinacionModel coor_id_coordinacion;

    @Column (name = "moti_estado", nullable = true, length = 1)
    private String estado;

}