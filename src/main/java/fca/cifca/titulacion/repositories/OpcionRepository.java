package fca.cifca.titulacion.repositories;

import fca.cifca.titulacion.models.OpcionTitulacionModel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface OpcionRepository extends JpaRepository<OpcionTitulacionModel, Integer> {
}
