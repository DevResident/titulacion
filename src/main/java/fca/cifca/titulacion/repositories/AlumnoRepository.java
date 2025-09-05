package fca.cifca.titulacion.repositories;

import fca.cifca.titulacion.models.AlumnoModel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface AlumnoRepository extends JpaRepository<AlumnoModel, Integer> {

    @Query("SELECT a FROM AlumnoModel a " +
            "JOIN FETCH a.idPersona p " +
            "JOIN FETCH p.pers_id_pais pais " +
            "WHERE a.numeroCuenta = :numeroCuenta " +
            "AND p.pers_curp = :curp")
    Optional<AlumnoModel> findByNumeroCuentaAndCurp(@Param("numeroCuenta") String numeroCuenta,
                                                    @Param("curp") String curp);

}
