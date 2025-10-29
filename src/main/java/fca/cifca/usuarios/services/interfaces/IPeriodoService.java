package fca.cifca.usuarios.services.interfaces;

import fca.cifca.usuarios.models.EstatusModel;
import fca.cifca.usuarios.models.InscripcionModel;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface IPeriodoService {

    public List<InscripcionModel> obtenerInscritosPorPeriodo(String periodo);

}
