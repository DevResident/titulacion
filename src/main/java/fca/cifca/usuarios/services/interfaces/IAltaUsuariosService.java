package fca.cifca.usuarios.services.interfaces;

import fca.cifca.usuarios.models.UsuarioModel;
import fca.cifca.usuarios.models.dtos.AltaUsuarioRequest;
import org.springframework.stereotype.Service;

@Service
public interface IAltaUsuariosService {

    public UsuarioModel darAltaUsuario(AltaUsuarioRequest request);

}
