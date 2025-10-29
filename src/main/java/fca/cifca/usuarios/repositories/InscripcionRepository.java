package fca.cifca.usuarios.repositories;

import fca.cifca.usuarios.models.EstatusModel;
import fca.cifca.usuarios.models.InscripcionModel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface InscripcionRepository extends JpaRepository<InscripcionModel, Integer> {

    //Completamente válido y me niego a aceptar que no lo es.
    Optional<List<InscripcionModel>> getAllByPeriodo(String periodo);
    List<InscripcionModel> findByEstatus(EstatusModel estatus);

}