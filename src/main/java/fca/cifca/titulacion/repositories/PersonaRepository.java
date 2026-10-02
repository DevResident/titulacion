package fca.cifca.titulacion.repositories;

import fca.cifca.titulacion.models.PersonaModel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PersonaRepository extends JpaRepository<PersonaModel, Integer> {
}
