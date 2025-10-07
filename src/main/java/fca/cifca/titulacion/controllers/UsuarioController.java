package fca.cifca.titulacion.controllers;

import fca.cifca.titulacion.services.VerificarCorreoService;
import fca.cifca.usuarios.models.UsuarioModel;
import fca.cifca.usuarios.models.dtos.AltaUsuarioRequest;
import fca.cifca.usuarios.services.AltaUsuarioService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Map;

@RestController
@RequestMapping("/usuario")
@RequiredArgsConstructor
public class UsuarioController {

    private final AltaUsuarioService altaUsuarioService;
    private final VerificarCorreoService verificarCorreoService;

    //Paso 1, solicitar c�digo de verificaci�n
    @PostMapping("/solicitar-codigo")
    public ResponseEntity<String> solicitarCodigo(@RequestBody String correo) {
        verificarCorreoService.enviarCodigo(correo);
        return ResponseEntity.ok("Código enviado a " + correo);
    }

    //Paso 2, el alta. Rutear redirecci?n desde ./solicitar_codigo
    @PostMapping("/alta")
    public ResponseEntity<?> altaUsuario(@RequestBody AltaUsuarioRequest altaUsuarioRequest) {

        if (!verificarCorreoService.verificarCodigo(altaUsuarioRequest)) {
            return ResponseEntity.badRequest().body("Código inválido o expirado");
        }
        UsuarioModel nuevoUsuario = altaUsuarioService.darAltaUsuario(altaUsuarioRequest);
        return ResponseEntity.ok().body(nuevoUsuario);

    }

}