package fca.cifca.titulacion.models;

import jakarta.persistence.*;

@Entity
@Table (name = "area")

public class AreaModel {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "area_id_area")
    private int idArea;
    @Column(name = "area_id_operador", nullable = true, length = 4)
    private int idOperador;
    @Column(name = "area_id_persona")
    private int idPersona;
    @Column(name = "area_id_area_superior")
    private int idAreaSuperior;
    @Column(name = "area_nombre", nullable = true, length = 150)
    private String nombreArea;
    @Column(name = "area_clave", nullable = true, length = 5)
    private String claveArea;
    @Column(name = "area_abreviatura", nullable = true, length = 5)
    private String abreviaturaArea;

    public int getIdArea() {
        return idArea;
    }

    public void setIdArea(int idArea) {
        this.idArea = idArea;
    }

    public int getIdOperador() {
        return idOperador;
    }

    public void setIdOperador(int idOperador) {
        this.idOperador = idOperador;
    }

    public int getIdPersona() {
        return idPersona;
    }

    public void setIdPersona(int idPersona) {
        this.idPersona = idPersona;
    }

    public int getIdAreaSuperior() {
        return idAreaSuperior;
    }

    public void setIdAreaSuperior(int idAreaSuperior) {
        this.idAreaSuperior = idAreaSuperior;
    }

    public String getNombreArea() {
        return nombreArea;
    }

    public void setNombreArea(String nombreArea) {
        this.nombreArea = nombreArea;
    }

    public String getClaveArea() {
        return claveArea;
    }

    public void setClaveArea(String claveArea) {
        this.claveArea = claveArea;
    }

    public String getAbreviaturaArea() {
        return abreviaturaArea;
    }

    public void setAbreviaturaArea(String abreviaturaArea) {
        this.abreviaturaArea = abreviaturaArea;
    }

    public AreaModel() {
    }

    public AreaModel(int idArea, int idOperador, int idPersona, int idAreaSuperior, String nombreArea, String claveArea, String abreviaturaArea) {
        this.idArea = idArea;
        this.idOperador = idOperador;
        this.idPersona = idPersona;
        this.idAreaSuperior = idAreaSuperior;
        this.nombreArea = nombreArea;
        this.claveArea = claveArea;
        this.abreviaturaArea = abreviaturaArea;
    }
}