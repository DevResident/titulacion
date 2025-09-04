package fca.cifca.titulacion.models;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table (name = "opcion_titulacion")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class OpcionTitulacionModel {

    @Id
    @GeneratedValue (strategy = GenerationType.IDENTITY)
    @Column (name = "opti_id_opcion_titulacion")
    private Integer idOpcionTitulacion;

    @ManyToOne (fetch = FetchType.EAGER)
    @JoinColumn (name = "opti_id_area_conocimiento", nullable = true)
    private AreaConocimientoModel areaConocimiento;

    @Column (name = "opti_nombre", nullable = false, length = 250)
    private String nombre;

    @Column (name = "opti_num_modulo", nullable = true)
    private Integer numModulo;

    @Column (name = "opti_siglas", nullable = true, length = 10)
    private String siglas;

    @Column (name = "opti_clave", nullable = true, length = 5)
    private String clave;

    @Column (name = "opti_estado", nullable = true)
    private String estado;

    @Column (name = "opti_idioma", nullable = true, length = 15)
    private String idioma;

}