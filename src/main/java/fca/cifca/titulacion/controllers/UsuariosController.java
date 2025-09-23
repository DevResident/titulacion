package fca.cifca.titulacion.controllers;

import fca.cifca.usuarios.models.UsuarioModel;
import fca.cifca.usuarios.models.dtos.AltaUsuarioRequest;
import fca.cifca.usuarios.services.AltaUsuarioService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/usuarios")
@RequiredArgsConstructor
public class UsuariosController {

    private final AltaUsuarioService altaUsuarioService;

    @PostMapping("/alta")
    public ResponseEntity<UsuarioModel> altaDeUsuarios(@RequestBody AltaUsuarioRequest altaUsuarioRequest) {

        UsuarioModel nuevoUsuario = altaUsuarioService.darAltaUsuario(altaUsuarioRequest);
        return ResponseEntity.ok().body(nuevoUsuario);

    }

}