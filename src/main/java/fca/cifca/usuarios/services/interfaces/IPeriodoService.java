package fca.cifca.usuarios.services.interfaces;

import fca.cifca.usuarios.models.dtos.InscripcionDTO;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface IPeriodoService {

    public List<InscripcionDTO> obtenerInscritosPorPeriodo(String periodo);

}
