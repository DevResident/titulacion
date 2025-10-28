package fca.cifca.usuarios.services;

import fca.cifca.usuarios.models.EstatusModel;
import fca.cifca.usuarios.repositories.EstatusRepository;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.util.List;

@Slf4j
@Service
@RequiredArgsConstructor
public class EstatusService {

    private final EstatusRepository estatusRepository;

    public EstatusModel findByEstatus(String estatus) {
        try {

            return estatusRepository.findByEstatus(estatus)
                    .orElseThrow(() -> new RuntimeException("Estatus no encontrado"));

        } catch (Exception e) {
            log.error("Ha ocurrido un error al ejecutar la búsqueda", e);
            throw new IllegalArgumentException(e);
        }
    }

    //Puse este metodo, pero no se si lo vayamos a usar
    public List<EstatusModel> findAll() {
        try {

            return estatusRepository.findAll();

        } catch (Exception e) {
            log.error("Ha ocurrido un error al ejecutar la búsqueda global", e);
            throw new IllegalArgumentException(e);
        }
    }
}
