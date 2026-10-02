package fca.cifca.usuarios.models;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Table(name = "estatus")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class EstatusModel {

    @Id
    @Column(name = "esta_id_estatus")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer idEstatus;

    @Column(name = "esta_estatus", nullable = false, unique = true)
    private String estatus;
}
