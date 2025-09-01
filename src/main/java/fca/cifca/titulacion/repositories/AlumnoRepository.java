package fca.cifca.titulacion.repositories;

import fca.cifca.titulacion.models.AlumnoModel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface AlumnoRepository extends JpaRepository<AlumnoModel, Integer> {

    Optional<AlumnoModel> findByNumeroCuentaAndCurp(String numeroCuenta, String curp);

}
