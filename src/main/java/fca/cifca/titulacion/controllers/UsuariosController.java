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
@RequestMapping("/usuarios")
@RequiredArgsConstructor
public class UsuariosController {

    private final AltaUsuarioService altaUsuarioService;
    private final VerificarCorreoService verificarCorreoService;

    //Paso 1, solicitar código de verificación
    @PostMapping("/solicitar-codigo")
    public ResponseEntity<String> solicitarCodigo(@RequestBody Map<String, String> request) {
        String correo = request.get("correo");
        verificarCorreoService.enviarCodigo(correo);
        return ResponseEntity.ok("Código enviado a " + correo);
    }

    //Paso 2, el alta. Rutear redirecci?n desde ./solicitar_codigo
    @PostMapping("/alta")
    public ResponseEntity<?> altaDeUsuarios(@RequestBody AltaUsuarioRequest altaUsuarioRequest) {

        boolean valido = verificarCorreoService.verificarCodigo(
                altaUsuarioRequest.getCorreo(),
                altaUsuarioRequest.getCodigo()
        );

        if (!valido) {

            return ResponseEntity.badRequest().body("Código inválido o expirado");
        }

        UsuarioModel nuevoUsuario = altaUsuarioService.darAltaUsuario(altaUsuarioRequest);
        return ResponseEntity.ok().body(nuevoUsuario);

    }

}