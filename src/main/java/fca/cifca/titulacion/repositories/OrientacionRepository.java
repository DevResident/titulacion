package fca.cifca.titulacion.repositories;

import fca.cifca.titulacion.models.OrientacionModel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface OrientacionRepository extends JpaRepository<OrientacionModel, Integer> {
}
