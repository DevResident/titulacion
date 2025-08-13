package fca.cifca.titulacion.models;

import jakarta.persistence.*;

@Entity
@Table (name = "alumno")

public class AlumnoModel {
    @Id
    @GeneratedValue (strategy = GenerationType.IDENTITY)
    @Column (name = "alum_id_alumno")
    private int alum_id_alumno;
    @Column (name = "alum_id_carrera_plantel", nullable = false)
    private int alum_id_carrera_plantel;
    @Column (name = "alum_id_plan_estudio", nullable = false)
    private int alum_id_plan_estudio;
    @Column (name = "alum_generacion", nullable = false, length = 4)
    private String alum_generacion;
    @Column (name = "alum_titulado", nullable = false, length = 1)
    private String alum_titulado;
    @Column (name = "alum_sistema", nullable = false, length = 3)
    private String alum_sistema;
    @Column (name = "alum_promedio", nullable = false)
    private double alum_promedio;
    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn (name = "alum_id_persona", nullable = false)
    private int alum_id_persona;
    @Column (name = "alum_no_cuenta", nullable = false, length = 15)
    private String alum_no_cuenta;
    @Column (name = "alum_ingreso", nullable = true, length = 8)
    private String alum_ingreso;
    @Column (name = "alum_egreso", nullable = true, length = 8)
    private String alum_egreso;

    public int getAlum_id_alumno() {
        return alum_id_alumno;
    }

    public void setAlum_id_alumno(int alum_id_alumno) {
        this.alum_id_alumno = alum_id_alumno;
    }

    public int getAlum_id_carrera_plantel() {
        return alum_id_carrera_plantel;
    }

    public void setAlum_id_carrera_plantel(int alum_id_carrera_plantel) {
        this.alum_id_carrera_plantel = alum_id_carrera_plantel;
    }

    public int getAlum_id_plan_estudio() {
        return alum_id_plan_estudio;
    }

    public void setAlum_id_plan_estudio(int alum_id_plan_estudio) {
        this.alum_id_plan_estudio = alum_id_plan_estudio;
    }

    public String getAlum_generacion() {
        return alum_generacion;
    }

    public void setAlum_generacion(String alum_generacion) {
        this.alum_generacion = alum_generacion;
    }

    public String getAlum_titulado() {
        return alum_titulado;
    }

    public void setAlum_titulado(String alum_titulado) {
        this.alum_titulado = alum_titulado;
    }

    public String getAlum_sistema() {
        return alum_sistema;
    }

    public void setAlum_sistema(String alum_sistema) {
        this.alum_sistema = alum_sistema;
    }

    public double getAlum_promedio() {
        return alum_promedio;
    }

    public void setAlum_promedio(double alum_promedio) {
        this.alum_promedio = alum_promedio;
    }

    public int getAlum_id_persona() {
        return alum_id_persona;
    }

    public void setAlum_id_persona(int alum_id_persona) {
        this.alum_id_persona = alum_id_persona;
    }

    public String getAlum_no_cuenta() {
        return alum_no_cuenta;
    }

    public void setAlum_no_cuenta(String alum_no_cuenta) {
        this.alum_no_cuenta = alum_no_cuenta;
    }

    public String getAlum_ingreso() {
        return alum_ingreso;
    }

    public void setAlum_ingreso(String alum_ingreso) {
        this.alum_ingreso = alum_ingreso;
    }

    public String getAlum_egreso() {
        return alum_egreso;
    }

    public void setAlum_egreso(String alum_egreso) {
        this.alum_egreso = alum_egreso;
    }

    public AlumnoModel() {
    }

    public AlumnoModel(int alum_id_alumno, int alum_id_carrera_plantel, int alum_id_plan_estudio, String alum_generacion, String alum_titulado, String alum_sistema, double alum_promedio, int alum_id_persona, String alum_no_cuenta, String alum_ingreso, String alum_egreso) {
        this.alum_id_alumno = alum_id_alumno;
        this.alum_id_carrera_plantel = alum_id_carrera_plantel;
        this.alum_id_plan_estudio = alum_id_plan_estudio;
        this.alum_generacion = alum_generacion;
        this.alum_titulado = alum_titulado;
        this.alum_sistema = alum_sistema;
        this.alum_promedio = alum_promedio;
        this.alum_id_persona = alum_id_persona;
        this.alum_no_cuenta = alum_no_cuenta;
        this.alum_ingreso = alum_ingreso;
        this.alum_egreso = alum_egreso;
    }
}
