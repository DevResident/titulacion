package fca.cifca.titulacion.repositories;

import fca.cifca.titulacion.models.CarreraPlantelModel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CarreraPlantelRepository extends JpaRepository<CarreraPlantelModel, Integer> {
}
