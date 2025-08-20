package fca.cifca.titulacion.models;

import jakarta.persistence.*;

@Entity
@Table (name = "grado")

public class GradoModel {

    @Id
    @GeneratedValue (strategy = GenerationType.IDENTITY)
    @Column (name = "grad_id_grado")
    private int idGrado;

    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn (name = "grad_id_nivel_grado",  nullable = true)
    private NivelGradoModel nivelGrado;

    @Column (name = "grad_nombre",  nullable = false, length = 150)
    private String nombre;

    public int getIdGrado() {
        return idGrado;
    }

    public void setIdGrado(int idGrado) {
        this.idGrado = idGrado;
    }

    public NivelGradoModel getNivelGrado() {
        return nivelGrado;
    }

    public void setNivelGrado(NivelGradoModel nivelGrado) {
        this.nivelGrado = nivelGrado;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public GradoModel() {
    }

    public GradoModel(int idGrado, NivelGradoModel nivelGrado, String nombre) {
        this.idGrado = idGrado;
        this.nivelGrado = nivelGrado;
        this.nombre = nombre;
    }
}
