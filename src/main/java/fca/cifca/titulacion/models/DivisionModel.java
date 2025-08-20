package fca.cifca.titulacion.models;

import jakarta.persistence.*;

@Entity
@Table (name = "division")

public class DivisionModel {

    @Id
    @GeneratedValue (strategy = GenerationType.IDENTITY)
    @Column (name = "divi_id_division")
    private int division_id_division;

    @Column (name = "divi_nombre", nullable = false, length = 100)
    private String divi_nombre;

    public int getDivision_id_division() {
        return division_id_division;
    }

    public void setDivision_id_division(int division_id_division) {
        this.division_id_division = division_id_division;
    }

    public String getDivi_nombre() {
        return divi_nombre;
    }

    public void setDivi_nombre(String divi_nombre) {
        this.divi_nombre = divi_nombre;
    }

    public DivisionModel() {
    }

    public DivisionModel(int division_id_division, String divi_nombre) {
        this.division_id_division = division_id_division;
        this.divi_nombre = divi_nombre;
    }
}
