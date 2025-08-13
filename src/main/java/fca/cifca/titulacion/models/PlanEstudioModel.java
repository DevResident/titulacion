package fca.cifca.titulacion.models;

import jakarta.persistence.*;

@Entity
@Table (name = "plan_estudio")

public class PlanEstudioModel {

    @Id
    @GeneratedValue (strategy = GenerationType.IDENTITY)
    @Column (name = "ples_id_plan_estudio")
    private int ples_id_plan_estudio;

    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn (name = "ples_id_carrera", nullable = false)
    private CarreraModel ples_id_carrera;

    @Column (name = "ples_nombre", nullable = false, length = 100)
    private String ples_nombre;

    @Column (name = "ples_nivel", nullable = false, length = 1)
    private String ples_nivel;

    @Column (name = "ples_sistema", nullable = true, length = 1)
    private String ples_sistema;

    @Column (name = "ples_prim_gen", nullable = true)
    private int ples_prim_gen;

    @Column (name = "ples_plan", nullable = false, length = 1)
    private String ples_plan;

    @Column (name = "ples_duracion", nullable = false)
    private int ples_duracion;

    @Column (name = "ples_num_cred_oblig", nullable = false)
    private int ples_num_cred_oblig;

    @Column (name = "ples_num_cred_opta", nullable = false)
    private int ples_num_cred_opta;

    @Column (name = "ples_vigencia", nullable = false)
    private int ples_vigencia;

    @Column (name = "ples_tipo_programa", nullable = true)
    private int ples_tipo_programa;

    @Column (name = "ples_num_asig_cred_flex", nullable = true)
    private int ples_num_asig_cred_flex;

    @Column (name = "ples_cred_seminario", nullable = true)
    private int ples_cred_seminario;

    public int getPles_id_plan_estudio() {
        return ples_id_plan_estudio;
    }

    public void setPles_id_plan_estudio(int ples_id_plan_estudio) {
        this.ples_id_plan_estudio = ples_id_plan_estudio;
    }

    public CarreraModel getPles_id_carrera() {
        return ples_id_carrera;
    }

    public void setPles_id_carrera(CarreraModel ples_id_carrera) {
        this.ples_id_carrera = ples_id_carrera;
    }

    public String getPles_nombre() {
        return ples_nombre;
    }

    public void setPles_nombre(String ples_nombre) {
        this.ples_nombre = ples_nombre;
    }

    public String getPles_nivel() {
        return ples_nivel;
    }

    public void setPles_nivel(String ples_nivel) {
        this.ples_nivel = ples_nivel;
    }

    public String getPles_sistema() {
        return ples_sistema;
    }

    public void setPles_sistema(String ples_sistema) {
        this.ples_sistema = ples_sistema;
    }

    public int getPles_prim_gen() {
        return ples_prim_gen;
    }

    public void setPles_prim_gen(int ples_prim_gen) {
        this.ples_prim_gen = ples_prim_gen;
    }

    public String getPles_plan() {
        return ples_plan;
    }

    public void setPles_plan(String ples_plan) {
        this.ples_plan = ples_plan;
    }

    public int getPles_duracion() {
        return ples_duracion;
    }

    public void setPles_duracion(int ples_duracion) {
        this.ples_duracion = ples_duracion;
    }

    public int getPles_num_cred_oblig() {
        return ples_num_cred_oblig;
    }

    public void setPles_num_cred_oblig(int ples_num_cred_oblig) {
        this.ples_num_cred_oblig = ples_num_cred_oblig;
    }

    public int getPles_num_cred_opta() {
        return ples_num_cred_opta;
    }

    public void setPles_num_cred_opta(int ples_num_cred_opta) {
        this.ples_num_cred_opta = ples_num_cred_opta;
    }

    public int getPles_vigencia() {
        return ples_vigencia;
    }

    public void setPles_vigencia(int ples_vigencia) {
        this.ples_vigencia = ples_vigencia;
    }

    public int getPles_tipo_programa() {
        return ples_tipo_programa;
    }

    public void setPles_tipo_programa(int ples_tipo_programa) {
        this.ples_tipo_programa = ples_tipo_programa;
    }

    public int getPles_num_asig_cred_flex() {
        return ples_num_asig_cred_flex;
    }

    public void setPles_num_asig_cred_flex(int ples_num_asig_cred_flex) {
        this.ples_num_asig_cred_flex = ples_num_asig_cred_flex;
    }

    public int getPles_cred_seminario() {
        return ples_cred_seminario;
    }

    public void setPles_cred_seminario(int ples_cred_seminario) {
        this.ples_cred_seminario = ples_cred_seminario;
    }

    public PlanEstudioModel() {
    }

    public PlanEstudioModel(int ples_id_plan_estudio, CarreraModel ples_id_carrera,
                            String ples_nombre, String ples_nivel,
                            String ples_sistema, int ples_prim_gen,
                            String ples_plan, int ples_duracion,
                            int ples_num_cred_oblig,
                            int ples_num_cred_opta,
                            int ples_vigencia,
                            int ples_tipo_programa,
                            int ples_num_asig_cred_flex,
                            int ples_cred_seminario) {
        this.ples_id_plan_estudio = ples_id_plan_estudio;
        this.ples_id_carrera = ples_id_carrera;
        this.ples_nombre = ples_nombre;
        this.ples_nivel = ples_nivel;
        this.ples_sistema = ples_sistema;
        this.ples_prim_gen = ples_prim_gen;
        this.ples_plan = ples_plan;
        this.ples_duracion = ples_duracion;
        this.ples_num_cred_oblig = ples_num_cred_oblig;
        this.ples_num_cred_opta = ples_num_cred_opta;
        this.ples_vigencia = ples_vigencia;
        this.ples_tipo_programa = ples_tipo_programa;
        this.ples_num_asig_cred_flex = ples_num_asig_cred_flex;
        this.ples_cred_seminario = ples_cred_seminario;
    }
}
