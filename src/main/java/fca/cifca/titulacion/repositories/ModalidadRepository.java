package fca.cifca.titulacion.repositories;

import fca.cifca.titulacion.models.ModalidadTitulacionModel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ModalidadRepository extends JpaRepository<ModalidadTitulacionModel, Integer> {
}
