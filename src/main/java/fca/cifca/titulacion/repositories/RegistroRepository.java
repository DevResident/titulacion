package fca.cifca.titulacion.repositories;

import fca.cifca.titulacion.models.RegistroModel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RegistroRepository extends JpaRepository<RegistroModel, Integer> {
}
