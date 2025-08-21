package fca.cifca.titulacion.models;

import jakarta.persistence.*;

@Entity
@Table (name = "area_conocimiento")

public class AreaConocimientoModel {

    @Id
    @GeneratedValue (strategy = GenerationType.IDENTITY)
    @Column (name = "arco_id_area_conocimiento")
    private int idAreaConocimiento;

    @Column (name = "arco_nombre", nullable = false, length = 50)
    private String arcoNombre;

    @Column (name = "arco_tipo", nullable = false, length = 1)
    private String arcoTipo;

    @Column (name = "arco_siglas", nullable = false, length = 10)
    private String arcoSiglas;

    @Column (name = "arco_estatus", nullable = true)
    private String arcoEstatus;

    public int getIdAreaConocimiento() {
        return idAreaConocimiento;
    }

    public void setIdAreaConocimiento(int idAreaConocimiento) {
        this.idAreaConocimiento = idAreaConocimiento;
    }

    public String getArcoNombre() {
        return arcoNombre;
    }

    public void setArcoNombre(String arcoNombre) {
        this.arcoNombre = arcoNombre;
    }

    public String getArcoTipo() {
        return arcoTipo;
    }

    public void setArcoTipo(String arcoTipo) {
        this.arcoTipo = arcoTipo;
    }

    public String getArcoSiglas() {
        return arcoSiglas;
    }

    public void setArcoSiglas(String arcoSiglas) {
        this.arcoSiglas = arcoSiglas;
    }

    public String getArcoEstatus() {
        return arcoEstatus;
    }

    public void setArcoEstatus(String arcoEstatus) {
        this.arcoEstatus = arcoEstatus;
    }

    public AreaConocimientoModel() {
    }

    public AreaConocimientoModel(int idAreaConocimiento, String arcoNombre, String arcoTipo, String arcoSiglas, String arcoEstatus) {
        this.idAreaConocimiento = idAreaConocimiento;
        this.arcoNombre = arcoNombre;
        this.arcoTipo = arcoTipo;
        this.arcoSiglas = arcoSiglas;
        this.arcoEstatus = arcoEstatus;
    }
}
