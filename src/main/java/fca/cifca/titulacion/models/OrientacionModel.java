package fca.cifca.titulacion.models;

import jakarta.persistence.*;

@Entity
@Table (name = "orientacion")

public class OrientacionModel {

    @Id
    @GeneratedValue (strategy = GenerationType.IDENTITY)
    @Column (name = "orie_id_orientacion")
    private int orieIdOrientacion;

    @Column (name = "orie_clave_orientacion", nullable = true)
    private int orieClaveOrientacion;

    @Column (name = "orie_nombre", nullable = true, length = 80)
    private String orieNombre;

    @ManyToOne (fetch = FetchType.EAGER)
    @JoinColumn (name = "orie_id_grado", nullable = false)
    private GradoModel grado;

    @ManyToOne (fetch = FetchType.EAGER)
    @JoinColumn (name = "orie_id_coordinacion", nullable = false)
    private CoordinacionModel coordinacion;

}
