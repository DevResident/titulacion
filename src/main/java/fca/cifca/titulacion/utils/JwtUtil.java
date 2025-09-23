package fca.cifca.titulacion.utils;

import io.jsonwebtoken.Jwts;
import io.jsonwebtoken.SignatureAlgorithm;
import org.springframework.stereotype.Component;
import java.util.HashMap;
import java.util.Map;
import java.util.Date;

@Component
public class JwtUtil {

    private final String SECRETO = "LittleSolaceComesToThoseWhoGrieveWhen" +
            "ThoughtsKeepDriftingAsWallsKeepShiftingAndThisGreatBlueWorldOfOursSeems" +
            "AHouseOfLeavesMomentsBeforeTheWind";

    public String generarToken(String numeroCuenta, String correo){

        Map<String, Object> claims = new HashMap<>();
        claims.put("numeroCuenta", numeroCuenta);
        claims.put("correo", correo);

        return Jwts.builder()
                .setClaims(claims)
                .setSubject(numeroCuenta)
                .setIssuedAt(new Date())
                .setExpiration(new Date(System.currentTimeMillis() + 1000 * 60 * 60))
                .signWith(SignatureAlgorithm.HS512, SECRETO.getBytes())
                .compact();
    }

    public String extractNumeroCuenta(String token) {
        return Jwts.parser()
                .setSigningKey(SECRETO.getBytes())
                .parseClaimsJws(token)
                .getBody()
                .get("numeroCuenta", String.class);
    }

    public String extractCorreo(String token) {
        return Jwts.parser()
                .setSigningKey(SECRETO.getBytes())
                .parseClaimsJws(token)
                .getBody()
                .get("correo", String.class);
    }

    //Extraer el token.
    public String extractTokenFromHeader(String authHeader){

        //"Bearer " tiene 7 caracteres, por eso se pone el 7.
        if (authHeader != null && authHeader.startsWith("Bearer ")) {

            return authHeader.substring(7);

        }

        throw new RuntimeException("Token no encontrado o inválido en la cabecera Authorization");
    }


}
