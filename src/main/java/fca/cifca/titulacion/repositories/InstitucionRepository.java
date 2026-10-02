package fca.cifca.titulacion.repositories;

import fca.cifca.titulacion.models.InstitucionModel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface InstitucionRepository extends JpaRepository<InstitucionModel, Integer> {
}
