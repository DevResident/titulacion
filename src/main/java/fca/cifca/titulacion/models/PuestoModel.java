//Faltan las entidades con las que tiene relación

package fca.cifca.titulacion.models;

import jakarta.persistence.*;

@Entity
@Table (name = "puesto")

public class PuestoModel {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "pues_id_puesto")
    private int pues_id_puesto;
    @Column(name = "pues_descripcion", nullable = true, length = 200)
    private String pues_descripcion;
    @Column(name = "pues_rango", nullable = true)
    private int pues_rango;
    @Column(name = "pues_id_coordinacion", nullable = true, length = 6)
    private String pues_id_coordinacion;
    @Column(name = "pues_id_division", nullable = true, length = 2)
    private String pues_id_division;
    @Column(name = "pues_es_jefe_area", nullable = true)
    private boolean pues_es_jefe_area;

    public int getPues_id_puesto() {
        return pues_id_puesto;
    }

    public void setPues_id_puesto(int pues_id_puesto) {
        this.pues_id_puesto = pues_id_puesto;
    }

    public String getPues_descripcion() {
        return pues_descripcion;
    }

    public void setPues_descripcion(String pues_descripcion) {
        this.pues_descripcion = pues_descripcion;
    }

    public int getPues_rango() {
        return pues_rango;
    }

    public void setPues_rango(int pues_rango) {
        this.pues_rango = pues_rango;
    }

    public String getPues_id_coordinacion() {
        return pues_id_coordinacion;
    }

    public void setPues_id_coordinacion(String pues_id_coordinacion) {
        this.pues_id_coordinacion = pues_id_coordinacion;
    }

    public String getPues_id_division() {
        return pues_id_division;
    }

    public void setPues_id_division(String pues_id_division) {
        this.pues_id_division = pues_id_division;
    }

    public boolean isPues_es_jefe_area() {
        return pues_es_jefe_area;
    }

    public void setPues_es_jefe_area(boolean pues_es_jefe_area) {
        this.pues_es_jefe_area = pues_es_jefe_area;
    }

    public PuestoModel() {
    }

    public PuestoModel(int pues_id_puesto, String pues_descripcion, int pues_rango, String pues_id_coordinacion, String pues_id_division, boolean pues_es_jefe_area) {
        this.pues_id_puesto = pues_id_puesto;
        this.pues_descripcion = pues_descripcion;
        this.pues_rango = pues_rango;
        this.pues_id_coordinacion = pues_id_coordinacion;
        this.pues_id_division = pues_id_division;
        this.pues_es_jefe_area = pues_es_jefe_area;
    }
}