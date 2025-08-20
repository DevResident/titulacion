package fca.cifca.titulacion.models;

import jakarta.persistence.*;

@Entity
@Table (name = "moti_id_modalidad_titulacion")

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
}
