package fca.cifca.titulacion.models;

import jakarta.persistence.*;

@Entity
@Table (name = "carrera_plantel")

public class CarreraPlantelModel {
    @Id
    @GeneratedValue (strategy = GenerationType.IDENTITY)
    @Column (name = "capa_id_carrera_plantel")
    private int capa_id_carrera_plantel;
    @Column (name = "capa_id_carrera", nullable = false)
    private int capa_id_carrera;
    @Column (name = "capa_id_institucion", nullable = false)
    private int capa_id_institucion;

    public int getCapa_id_carrera_plantel() {
        return capa_id_carrera_plantel;
    }

    public void setCapa_id_carrera_plantel(int capa_id_carrera_plantel) {
        this.capa_id_carrera_plantel = capa_id_carrera_plantel;
    }

    public int getCapa_id_carrera() {
        return capa_id_carrera;
    }

    public void setCapa_id_carrera(int capa_id_carrera) {
        this.capa_id_carrera = capa_id_carrera;
    }

    public int getCapa_id_institucion() {
        return capa_id_institucion;
    }

    public void setCapa_id_institucion(int capa_id_institucion) {
        this.capa_id_institucion = capa_id_institucion;
    }

    public CarreraPlantelModel() {
    }

    public CarreraPlantelModel(int capa_id_carrera_plantel, int capa_id_carrera, int capa_id_institucion) {
        this.capa_id_carrera_plantel = capa_id_carrera_plantel;
        this.capa_id_carrera = capa_id_carrera;
        this.capa_id_institucion = capa_id_institucion;
    }
}
