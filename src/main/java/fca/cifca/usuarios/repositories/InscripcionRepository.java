package fca.cifca.usuarios.repositories;

import fca.cifca.usuarios.models.InscripcionModel;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface InscripcionRepository extends JpaRepository<Integer, InscripcionModel> {
    Optional<InscripcionModel> getAllByPeriodo(String periodo);
}
