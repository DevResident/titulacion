package fca.cifca.usuarios.repositories;

import fca.cifca.usuarios.models.InscripcionModel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface InscripcionRepository extends JpaRepository<Integer, InscripcionModel> {
    Optional<InscripcionModel> getAllByPeriodo(String periodo);
}
