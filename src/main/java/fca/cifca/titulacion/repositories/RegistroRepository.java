package fca.cifca.titulacion.repositories;

import fca.cifca.titulacion.models.RegistroModel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import java.util.List;

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
    @Query("SELECT r FROM inscripcion_alumno_ot r " +
            "WHERE r.alumno.numeroCuenta = :numeroCuenta")
    Optional<RegistroModel> findByNumeroCuenta(
            @Param("numeroCuenta") String numeroCuenta
    );

    @Query("SELECT r FROM inscripcion_alumno_ot r " +
            "WHERE r.alumno.numeroCuenta = :numeroCuenta " +
            "AND r.modalidadTitulacion.idModalidadTitulacion = :idModalidadTitulacion")
    //La lista fuerza a no usar getSingleResult()
    //Esto de momento se queda así, ID de modalidad 6 (examen) permite varios registros.
    List<RegistroModel> findByNumeroCuentaAndIdModalidadTitulacion(
            @Param("numeroCuenta") String numeroCuenta,
            @Param("idModalidadTitulacion") Integer idModTitulacion
    );

}