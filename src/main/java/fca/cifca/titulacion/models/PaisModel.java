package fca.cifca.titulacion.models;

import jakarta.persistence.*;

@Entity
@Table (name = "pais")

public class PaisModel {
    @Id
    @GeneratedValue (strategy = GenerationType.IDENTITY)
    @Column (name = "pais_id_pais")
    private int pais_id_pais;
    @Column (name = "pais_nombre", length = 100, nullable = false)
    private String pais_nombre;
    @Column (name = "pais_nacionalidad", length = 50, nullable = false)
    private String pais_nacionalidad;
    @Column (name = "pais_cve_lada", length = 8, nullable = false)
    private String pais_cve_lada;

    public int getPais_id_pais() {
        return pais_id_pais;
    }

    public void setPais_id_pais(int pais_id_pais) {
        this.pais_id_pais = pais_id_pais;
    }

    public String getPais_nombre() {
        return pais_nombre;
    }

    public void setPais_nombre(String pais_nombre) {
        this.pais_nombre = pais_nombre;
    }

    public String getPais_nacionalidad() {
        return pais_nacionalidad;
    }

    public void setPais_nacionalidad(String pais_nacionalidad) {
        this.pais_nacionalidad = pais_nacionalidad;
    }

    public String getPais_cve_lada() {
        return pais_cve_lada;
    }

    public void setPais_cve_lada(String pais_cve_lada) {
        this.pais_cve_lada = pais_cve_lada;
    }

    public PaisModel() {
    }

    public PaisModel(String pais_nombre, String pais_nacionalidad, String pais_cve_lada) {
        this.pais_nombre = pais_nombre;
        this.pais_nacionalidad = pais_nacionalidad;
        this.pais_cve_lada = pais_cve_lada;
    }
}
