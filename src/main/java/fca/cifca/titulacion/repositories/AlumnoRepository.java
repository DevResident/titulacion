package fca.cifca.titulacion.repositories;

import fca.cifca.titulacion.models.AlumnoModel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface AlumnoRepository extends JpaRepository<AlumnoModel, Integer> {

    @Query("SELECT a FROM AlumnoModel a WHERE a.numeroCuenta = :numeroCuenta AND a.idPersona.pers_curp = :curp")
    Optional<AlumnoModel> findByNumeroCuentaAndCurp(String numeroCuenta, String curp);

}
