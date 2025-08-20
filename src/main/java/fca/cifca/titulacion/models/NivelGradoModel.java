package fca.cifca.titulacion.models;

import jakarta.persistence.*;

@Entity
@Table (name = "nivel_grado")

public class NivelGradoModel {

    @Id
    @GeneratedValue (strategy = GenerationType.IDENTITY)
    @Column (name = "nigr_id_nivel_grado")
    private int idNivelGrado;

    @Column (name = "nigr_nombre", nullable = false, length = 150)
    private String nombre;

    public int getIdNivelGrado() {
        return idNivelGrado;
    }

    public void setIdNivelGrado(int idNivelGrado) {
        this.idNivelGrado = idNivelGrado;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public NivelGradoModel() {
    }

    public NivelGradoModel(int idNivelGrado, String nombre) {
        this.idNivelGrado = idNivelGrado;
        this.nombre = nombre;
    }
}
