package fca.cifca.usuarios.repositories;

import fca.cifca.usuarios.models.EstatusModel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface EstatusRepository extends JpaRepository<EstatusModel, Integer>{
    Optional<EstatusModel> findByEstatus(String estatus);
}
