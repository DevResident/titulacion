package fca.cifca.titulacion.models;

import jakarta.persistence.*;

@Entity
@Table (name = "carrera")

public class CarreraModel {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column (name = "carr_id_carrera")
    private int idCarrera;

    @Column (name = "carr_nombre", nullable = true, length = 250)
    private String nombreCarrera;

    @Column (name = "carr_nombre_completo", nullable = true, length = 40)
    private String nombreCompleto;

    @Column (name = "carr_nombre_corto", nullable = true, length = 8)
    private String nombreCorto;

    public int getIdCarrera() {
        return idCarrera;
    }

    public void setIdCarrera(int idCarrera) {
        this.idCarrera = idCarrera;
    }

    public String getNombreCarrera() {
        return nombreCarrera;
    }

    public void setNombreCarrera(String nombreCarrera) {
        this.nombreCarrera = nombreCarrera;
    }

    public String getNombreCompleto() {
        return nombreCompleto;
    }

    public void setNombreCompleto(String nombreCompleto) {
        this.nombreCompleto = nombreCompleto;
    }

    public String getNombreCorto() {
        return nombreCorto;
    }

    public void setNombreCorto(String nombreCorto) {
        this.nombreCorto = nombreCorto;
    }

    public CarreraModel() {
    }

    public CarreraModel(int idCarrera, String nombreCarrera, String nombreCompleto, String nombreCorto) {
        this.idCarrera = idCarrera;
        this.nombreCarrera = nombreCarrera;
        this.nombreCompleto = nombreCompleto;
        this.nombreCorto = nombreCorto;
    }
}