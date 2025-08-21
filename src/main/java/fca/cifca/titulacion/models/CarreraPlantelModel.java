package fca.cifca.titulacion.models;

import jakarta.persistence.*;

@Entity
@Table (name = "carrera_plantel")

public class CarreraPlantelModel {
    @Id
    @GeneratedValue (strategy = GenerationType.IDENTITY)
    @Column (name = "capa_id_carrera_plantel")
    private int idCarreraPlantel;

    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn (name = "capa_id_carrera", nullable = false)
    private CarreraModel carrera;

    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn (name = "capa_id_institucion", nullable = false)
    private InstitucionModel institucion;

    public int getIdCarreraPlantel() {
        return idCarreraPlantel;
    }

    public void setIdCarreraPlantel(int idCarreraPlantel) {
        this.idCarreraPlantel = idCarreraPlantel;
    }

    public CarreraModel getCarrera() {
        return carrera;
    }

    public void setCarrera(CarreraModel carrera) {
        this.carrera = carrera;
    }

    public InstitucionModel getInstitucion() {
        return institucion;
    }

    public void setInstitucion(InstitucionModel institucion) {
        this.institucion = institucion;
    }

    public CarreraPlantelModel() {
    }

    public CarreraPlantelModel(int idCarreraPlantel, CarreraModel carrera, InstitucionModel institucion) {
        this.idCarreraPlantel = idCarreraPlantel;
        this.carrera = carrera;
        this.institucion = institucion;
    }
}
