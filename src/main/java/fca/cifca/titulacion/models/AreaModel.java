package fca.cifca.titulacion.models;

import jakarta.persistence.*;

@Entity
@Table (name = "area")

public class AreaModel {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "area_id_area")
    private int area_id_area;
    @Column(name = "area_id_operador", nullable = true, length = 4)
    private int area_id_operador;
    @Column(name = "area_id_persona")
    private int area_id_persona;
    @Column(name = "area_id_area_superior")
    private int area_id_area_superior;
    @Column(name = "area_nombre", nullable = true, length = 150)
    private String area_nombre;
    @Column(name = "area_clave", nullable = true, length = 5)
    private String area_clave;
    @Column(name = "area_abreviatura", nullable = true, length = 5)
    private String area_abreviatura;

    public int getArea_id_area() {
        return area_id_area;
    }

    public void setArea_id_area(int area_id_area) {
        this.area_id_area = area_id_area;
    }

    public int getArea_id_operador() {
        return area_id_operador;
    }

    public void setArea_id_operador(int area_id_operador) {
        this.area_id_operador = area_id_operador;
    }

    public int getArea_id_persona() {
        return area_id_persona;
    }

    public void setArea_id_persona(int area_id_persona) {
        this.area_id_persona = area_id_persona;
    }

    public int getArea_id_area_superior() {
        return area_id_area_superior;
    }

    public void setArea_id_area_superior(int area_id_area_superior) {
        this.area_id_area_superior = area_id_area_superior;
    }

    public String getArea_nombre() {
        return area_nombre;
    }

    public void setArea_nombre(String area_nombre) {
        this.area_nombre = area_nombre;
    }

    public String getArea_clave() {
        return area_clave;
    }

    public void setArea_clave(String area_clave) {
        this.area_clave = area_clave;
    }

    public String getArea_abreviatura() {
        return area_abreviatura;
    }

    public void setArea_abreviatura(String area_abreviatura) {
        this.area_abreviatura = area_abreviatura;
    }

    public AreaModel() {
    }

    public AreaModel(int area_id_area, int area_id_operador, int area_id_persona, int area_id_area_superior, String area_nombre, String area_clave, String area_abreviatura) {
        this.area_id_area = area_id_area;
        this.area_id_operador = area_id_operador;
        this.area_id_persona = area_id_persona;
        this.area_id_area_superior = area_id_area_superior;
        this.area_nombre = area_nombre;
        this.area_clave = area_clave;
        this.area_abreviatura = area_abreviatura;
    }
}