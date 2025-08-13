package fca.cifca.titulacion.models;

import jakarta.persistence.*;

@Entity
@Table (name = "carrera")

public class CarreraModel {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column (name = "carr_id_carrera")
    private int carr_id_carrera;
    @Column (name = "carr_nombre", nullable = false, length = 250)
    private String carr_nombre;
    @Column (name = "carr_nombre_completo", nullable = false, length = 40)
    private String carr_nombre_completo;
    @Column (name = "carr_nombre_corto", nullable = false, length = 8)
    private String carr_nombre_corto;

    public int getCarr_id_carrera() {
        return carr_id_carrera;
    }

    public void setCarr_id_carrera(int carr_id_carrera) {
        this.carr_id_carrera = carr_id_carrera;
    }

    public String getCarr_nombre() {
        return carr_nombre;
    }

    public void setCarr_nombre(String carr_nombre) {
        this.carr_nombre = carr_nombre;
    }

    public String getCarr_nombre_completo() {
        return carr_nombre_completo;
    }

    public void setCarr_nombre_completo(String carr_nombre_completo) {
        this.carr_nombre_completo = carr_nombre_completo;
    }

    public String getCarr_nombre_corto() {
        return carr_nombre_corto;
    }

    public void setCarr_nombre_corto(String carr_nombre_corto) {
        this.carr_nombre_corto = carr_nombre_corto;
    }

    public CarreraModel() {
    }

    public CarreraModel(int carr_id_carrera, String carr_nombre, String carr_nombre_completo, String carr_nombre_corto) {
        this.carr_id_carrera = carr_id_carrera;
        this.carr_nombre = carr_nombre;
        this.carr_nombre_completo = carr_nombre_completo;
        this.carr_nombre_corto = carr_nombre_corto;
    }
}