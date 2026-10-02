package fca.cifca.titulacion.controllers;

import fca.cifca.titulacion.models.dtos.LoginRequest;
import fca.cifca.titulacion.services.VerificarCorreoService;
import fca.cifca.titulacion.utils.JwtUtil;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.BadCredentialsException;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.Authentication;
import org.springframework.web.bind.annotation.*;

import java.util.Map;

@RequiredArgsConstructor
@RestController
@RequestMapping("/auth")
public class AutenticacionController {

    private final JwtUtil jwtUtil;
    private final AuthenticationManager authenticationManager;
    private final VerificarCorreoService verificarCorreoService;

    @PostMapping("/login")
    public ResponseEntity<?> login(@RequestBody LoginRequest request) {
        try {
            // Luego autenticar usuario
            Authentication authentication = authenticationManager.authenticate(
                    new UsernamePasswordAuthenticationToken(request.getUsuario(), request.getCorreo())
            );

            String token = jwtUtil.generarToken(
                    request.getUsuario(),
                    request.getCorreo()
            );

            return ResponseEntity.ok(Map.of("token", token));

        } catch (BadCredentialsException ex) {
            return ResponseEntity.status(HttpStatus.UNAUTHORIZED).body("Credenciales inválidas");
        }
    }

    //Sin protecci�n de security filter chain
    @PostMapping("/validar-correo")
    public ResponseEntity<?> solicitarCodigo(@RequestBody Map<String, String> request) {
        String correo = request.get("correo");
        verificarCorreoService.enviarCodigo(correo);
        return ResponseEntity.ok("Código enviado a " + correo);
    }

}