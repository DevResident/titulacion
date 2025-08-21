package fca.cifca.titulacion.models;

import jakarta.persistence.*;

@Entity
@Table (name = "division")

public class DivisionModel {

    @Id
    @GeneratedValue (strategy = GenerationType.IDENTITY)
    @Column (name = "divi_id_division")
    private int idDivision;

    @Column (name = "divi_nombre", nullable = false, length = 100)
    private String nombreDivision;

    public int getIdDivision() {
        return idDivision;
    }

    public void setIdDivision(int idDivision) {
        this.idDivision = idDivision;
    }

    public String getNombreDivision() {
        return nombreDivision;
    }

    public void setNombreDivision(String nombreDivision) {
        this.nombreDivision = nombreDivision;
    }

    public DivisionModel() {
    }

    public DivisionModel(int idDivision, String nombreDivision) {
        this.idDivision = idDivision;
        this.nombreDivision = nombreDivision;
    }
}
