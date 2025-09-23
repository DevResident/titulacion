package fca.cifca.usuarios.services;

import fca.cifca.usuarios.models.UsuarioModel;
import fca.cifca.usuarios.models.dtos.AltaUsuarioRequest;
import fca.cifca.usuarios.repositories.UsuarioRepository;
import fca.cifca.usuarios.services.interfaces.IAltaUsuariosService;
import lombok.RequiredArgsConstructor;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class AltaUsuarioService implements IAltaUsuariosService{

    private final UsuarioRepository usuarioRepository;
    private final PasswordEncoder passwordEncoder;

    @Override
    public UsuarioModel darAltaUsuario(AltaUsuarioRequest request) {

        UsuarioModel nuevoUsuario = new UsuarioModel();
        nuevoUsuario.setUsuario(request.getNumeroCuenta());
        nuevoUsuario.setContrasenia(passwordEncoder.encode(request.getCorreo()));
        nuevoUsuario.setRol("Estudiante");
        nuevoUsuario.setEstatus(Boolean.TRUE);

        return usuarioRepository.save(nuevoUsuario);

    }
}
