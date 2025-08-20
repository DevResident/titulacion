package fca.cifca.titulacion.models;

import jakarta.persistence.*;

@Entity
@Table (name = "coor_id_coordinacion")

public class CoordinacionModel {

    @Id
    @GeneratedValue (strategy = GenerationType.IDENTITY)
    @Column (name = "coor_id_coordinacion")
    private int idCoordinacion;

    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn (name = "coor_id_division", nullable = false)
    private DivisionModel division;

    @Column (name = "coor_nombre", nullable = false, length = 100)
    private String nombre;

    @Column (name = "coor_edo", nullable = true, length = 1)
    private String edo;

    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn (name = "coor_id_grado")
    private GradoModel grado;

    public int getIdCoordinacion() {
        return idCoordinacion;
    }

    public void setIdCoordinacion(int idCoordinacion) {
        this.idCoordinacion = idCoordinacion;
    }

    public DivisionModel getDivision() {
        return division;
    }

    public void setDivision(DivisionModel division) {
        this.division = division;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getEdo() {
        return edo;
    }

    public void setEdo(String edo) {
        this.edo = edo;
    }

    public GradoModel getGrado() {
        return grado;
    }

    public void setGrado(GradoModel grado) {
        this.grado = grado;
    }

    public CoordinacionModel() {
    }

    public CoordinacionModel(int idCoordinacion, DivisionModel division, String nombre, String edo, GradoModel grado) {
        this.idCoordinacion = idCoordinacion;
        this.division = division;
        this.nombre = nombre;
        this.edo = edo;
        this.grado = grado;
    }
}
