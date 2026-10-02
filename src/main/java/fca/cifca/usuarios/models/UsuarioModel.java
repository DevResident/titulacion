package fca.cifca.usuarios.models;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Table(name = "usuario")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class UsuarioModel {

    @Id
    @Column(name = "usua_id_usuario")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer idusuario;

    @Column(name = "usua_numero_cuenta", length = 9, nullable = false, unique = true)
    private String usuario;

    @Column(name = "usua_correo", nullable = false)
    private String contrasenia;

    @Column(name = "usua_rol", length = 30, nullable = false)
    private String rol;

    @Column(name = "usua_activo", nullable = false)
    private Boolean activo;

}