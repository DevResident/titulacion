package fca.cifca.usuarios.models;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Table(name = "usuario")
@Data
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class UsuarioModel {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer idUsuario;

    @Column(name = "usuario", length = 9, nullable = false, unique = true)
    private String usuario;

    @Column(name = "contrasenia", length = 18)
    private String contrasenia;


}
