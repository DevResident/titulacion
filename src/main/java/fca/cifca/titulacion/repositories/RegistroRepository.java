package fca.cifca.titulacion.repositories;

import fca.cifca.titulacion.models.RegistroModel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface RegistroRepository extends JpaRepository<RegistroModel, Integer> {

    @Query("SELECT r FROM inscripcion_alumno_ot r " +
            "WHERE r.alumno.numeroCuenta = :numeroCuenta " +
            "AND r.alumno.idPersona.pers_curp = :curp")
    Optional<RegistroModel> findByNumeroAndCurp(
            @Param("numeroCuenta") String numeroCuenta,
            @Param("curp") String curp
    );

}
