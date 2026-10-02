package fca.cifca.titulacion.repositories;

import fca.cifca.titulacion.models.ConvocatoriaTitulacionModel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ConvocatoriaRepository extends JpaRepository<ConvocatoriaTitulacionModel, Integer> {
}
