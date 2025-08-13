package fca.cifca.titulacion.models;

import jakarta.persistence.*;

@Entity
@Table (name = "estudio_profesional")

public class EstudioProfesionalModel {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "espr_id_estudio_prof")
    private int espr_id_estudio_prof;

    @Column(name = "espr_nombre", nullable = false, length = 50)
    private String espr_nombre;

    @Column(name = "espr_id_grado_estudio", nullable = false)
    private int espr_id_grado_estudio;

    @Column(name = "espr_abv1", nullable = true, length = 15)
    private String espr_abv1;

    @Column(name = "espr_abv2", nullable = true, length = 15)
    private String espr_abv2;

    public int getEspr_id_estudio_prof() {
        return espr_id_estudio_prof;
    }

    public void setEspr_id_estudio_prof(int espr_id_estudio_prof) {
        this.espr_id_estudio_prof = espr_id_estudio_prof;
    }

    public String getEspr_nombre() {
        return espr_nombre;
    }

    public void setEspr_nombre(String espr_nombre) {
        this.espr_nombre = espr_nombre;
    }

    public int getEspr_id_grado_estudio() {
        return espr_id_grado_estudio;
    }

    public void setEspr_id_grado_estudio(int espr_id_grado_estudio) {
        this.espr_id_grado_estudio = espr_id_grado_estudio;
    }

    public String getEspr_abv1() {
        return espr_abv1;
    }

    public void setEspr_abv1(String espr_abv1) {
        this.espr_abv1 = espr_abv1;
    }

    public String getEspr_abv2() {
        return espr_abv2;
    }

    public void setEspr_abv2(String espr_abv2) {
        this.espr_abv2 = espr_abv2;
    }

    public EstudioProfesionalModel() {
    }

    public EstudioProfesionalModel(int espr_id_estudio_prof, String espr_nombre, int espr_id_grado_estudio, String espr_abv1, String espr_abv2) {
        this.espr_id_estudio_prof = espr_id_estudio_prof;
        this.espr_nombre = espr_nombre;
        this.espr_id_grado_estudio = espr_id_grado_estudio;
        this.espr_abv1 = espr_abv1;
        this.espr_abv2 = espr_abv2;
    }
}
