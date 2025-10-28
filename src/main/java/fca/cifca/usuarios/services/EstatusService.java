package fca.cifca.usuarios.services;

import fca.cifca.usuarios.models.EstatusModel;
import fca.cifca.usuarios.repositories.EstatusRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class EstatusService {

    private final EstatusRepository estatusRepository;

    public EstatusModel findByEstatus(String estatus) {
        return estatusRepository.findByEstatus(estatus)
                .orElseThrow(() -> new RuntimeException("Estatus no encontrado"));
    }

    //Puse este metodo, pero no se si lo vayamos a usar
    public List<EstatusModel> findAll() {
        return estatusRepository.findAll();
    }
}
