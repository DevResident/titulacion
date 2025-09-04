package fca.cifca.titulacion.models;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table (name = "plan_estudio")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class PlanEstudioModel {

    @Id
    @GeneratedValue (strategy = GenerationType.IDENTITY)
    @Column (name = "ples_id_plan_estudio")
    private Integer ples_id_plan_estudio;

    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn (name = "ples_id_carrera", nullable = false)
    private CarrerasModel ples_id_carrera;

    @Column (name = "ples_nombre", nullable = false, length = 100)
    private String ples_nombre;

    @Column (name = "ples_nivel", nullable = false, length = 1)
    private String ples_nivel;

    @Column (name = "ples_sistema", nullable = true, length = 1)
    private String ples_sistema;

    @Column (name = "ples_prim_gen", nullable = true)
    private Integer ples_prim_gen;

    @Column (name = "ples_plan", nullable = false, length = 1)
    private String ples_plan;

    @Column (name = "ples_duracion", nullable = false)
    private Integer ples_duracion;

    @Column (name = "ples_num_cred_oblig", nullable = false)
    private Integer ples_num_cred_oblig;

    @Column (name = "ples_num_cred_opta", nullable = false)
    private Integer ples_num_cred_opta;

    @Column (name = "ples_vigencia", nullable = false)
    private Integer ples_vigencia;

    @Column (name = "ples_tipo_programa", nullable = true)
    private Integer ples_tipo_programa;

    @Column (name = "ples_num_asig_cred_flex", nullable = true)
    private Integer ples_num_asig_cred_flex;

    @Column (name = "ples_cred_seminario", nullable = true)
    private Integer ples_cred_seminario;


}