package fca.cifca.usuarios.models;


import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity(name = "inscripcion")
public class InscripcionModel {

    @Id
    @Column(name = "insc_id_inscripcion")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "insc_id_usuario", nullable = false)
    private UsuarioModel usuario;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "insc_id_estatus", nullable = false)
    private EstatusModel estatus;

    //Deben seguir un formato "xxxx-x", como 2026-1
    @Column(name = "insc_periodo", nullable = false, length = 6, unique = true)
    private String periodo;

}
