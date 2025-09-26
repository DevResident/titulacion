package fca.cifca.titulacion.configs;

import fca.cifca.titulacion.utils.FiltroJWT;
import fca.cifca.titulacion.utils.JwtUtil;
import fca.cifca.usuarios.services.DetallesUsuarioService;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.config.annotation.authentication.configuration.AuthenticationConfiguration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.security.web.SecurityFilterChain;
import org.springframework.security.web.authentication.UsernamePasswordAuthenticationFilter;

@Configuration
public class SeguridadConfig {

    private final DetallesUsuarioService usuarioDetallesService;
    private final JwtUtil jwtUtil;
    private final FiltroJWT filtroJWT;

    public SeguridadConfig(DetallesUsuarioService usuarioDetallesService, JwtUtil jwtUtil,
                           FiltroJWT filtroJWT) {
        this.usuarioDetallesService = usuarioDetallesService;
        this.jwtUtil = jwtUtil;
        this.filtroJWT = filtroJWT;
    }

    @Bean
    public PasswordEncoder passwordEncoder() {

        return new BCryptPasswordEncoder();

    }

    @Bean
    public AuthenticationManager authenticationManager(
            AuthenticationConfiguration authConfig) throws Exception {

        return authConfig.getAuthenticationManager();

    }

    @Bean
    public SecurityFilterChain securityFilterChain(HttpSecurity http) throws Exception {

        http.csrf(csrf -> csrf.disable())
                .authorizeHttpRequests(auth -> auth
                        .requestMatchers("/auth/login",
                                "/usuarios/alta",
                                "auth/validar_correo",
                                "usuarios/solicitar-codigo").permitAll()
                        .anyRequest().authenticated()
                )
                .addFilterBefore(filtroJWT, UsernamePasswordAuthenticationFilter.class);

        return http.build();

    }

}