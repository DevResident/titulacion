package fca.cifca.titulacion.repositories;

import fca.cifca.titulacion.models.AreaConocimientoModel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AreaConocimientoRepository extends JpaRepository<AreaConocimientoModel, Integer> {
}
