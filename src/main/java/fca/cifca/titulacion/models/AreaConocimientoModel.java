package fca.cifca.titulacion.models;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Table (name = "area_conocimiento")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class AreaConocimientoModel {

    @Id
    @GeneratedValue (strategy = GenerationType.IDENTITY)
    @Column (name = "arco_id_area_conocimiento")
    private Integer idAreaConocimiento;

    @Column (name = "arco_nombre", nullable = false, length = 50)
    private String arcoNombre;

    @Column (name = "arco_tipo", nullable = false, length = 1)
    private String arcoTipo;

    @Column (name = "arco_siglas", nullable = false, length = 10)
    private String arcoSiglas;

    @Column (name = "arco_estatus", nullable = true)
    private String arcoEstatus;

}
