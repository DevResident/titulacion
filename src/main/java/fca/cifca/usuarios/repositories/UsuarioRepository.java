package fca.cifca.usuarios.repositories;

import fca.cifca.usuarios.models.UsuarioModel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface UsuarioRepository extends JpaRepository<UsuarioModel, Integer> {
    Optional<UsuarioModel> findByUsuario(String usuario);
    Optional<UsuarioModel> findByNumeroCuenta(String numeroCuenta);
}
