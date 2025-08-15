package fca.cifca.titulacion.repositories;

import fca.cifca.titulacion.models.CarreraModel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CarreraRepository extends JpaRepository<CarreraModel, Integer> {
}
