package fca.cifca.titulacion.repositories;

import fca.cifca.titulacion.models.PlanEstudioModel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PlanEstudioRepository extends JpaRepository<PlanEstudioModel, Integer> {
}
