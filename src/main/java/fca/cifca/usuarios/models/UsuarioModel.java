package fca.cifca.usuarios.models;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Table(name = "usuarios")
@Data
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class UsuarioModel {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer idusuario;

    @Column(name = "numerocuenta", length = 9, nullable = false, unique = true)
    private String usuario;

    @Column(name = "correo", nullable = false)
    private String contrasenia;

    @Column(name = "rol", length = 30, nullable = false)
    private String rol;

    @Column(name = "estatus", nullable = false)
    private Boolean estatus;


}