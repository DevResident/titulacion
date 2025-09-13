package fca.cifca.usuarios.services;

import fca.cifca.usuarios.models.UsuarioModel;
import fca.cifca.usuarios.repositories.UsuarioRepository;
import fca.cifca.usuarios.services.interfaces.IDetallesUsuarioService;
import org.springframework.context.annotation.Bean;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

@Service
public class DetallesUsuarioService implements IDetallesUsuarioService {

    private final UsuarioRepository usuarioRepository;

    public DetallesUsuarioService(UsuarioRepository usuarioRepository) {
        this.usuarioRepository = usuarioRepository;
    }

    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        UsuarioModel usuario = usuarioRepository.findByUsuario(username)
                .orElseThrow(() -> new UsernameNotFoundException("Usuario no encontrado"));

        return User.builder()
                .username(usuario.getUsuario())
                .password(usuario.getContrasenia())
                //TBA lo demás.
                .build();
    }
}
