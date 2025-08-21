package fca.cifca.titulacion.models;

import jakarta.persistence.*;

@Entity
@Table (name = "alumno")

public class AlumnoModel {

    @Id
    @GeneratedValue (strategy = GenerationType.IDENTITY)
    @Column (name = "alum_id_alumno")
    private int idAlumno;

    @Column (name = "alum_id_carrera_plantel", nullable = true)
    private int idCarreraPlantel;

    @Column (name = "alum_id_plan_estudio", nullable = true)
    private int idPlanEstudio;

    @Column (name = "alum_generacion", nullable = true, length = 4)
    private String generacion;

    @Column (name = "alum_titulado", nullable = true, length = 1)
    private String esTitulado;

    @Column (name = "alum_sistema", nullable = true, length = 3)
    private String sistema;

    @Column (name = "alum_promedio", nullable = true)
    private double promedio;

    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn (name = "alum_id_persona", nullable = true)
    private PersonaModel idPersona;

    @Column (name = "alum_no_cuenta", nullable = true, length = 15)
    private String numeroCuenta;

    @Column (name = "alum_ingreso", nullable = true, length = 8)
    private String ingreso;

    @Column (name = "alum_egreso", nullable = true, length = 8)
    private String egreso;


}
