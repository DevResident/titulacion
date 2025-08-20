package fca.cifca.titulacion.services.interfaces;

import fca.cifca.titulacion.models.dtos.RegistroDTO;
import org.springframework.stereotype.Service;

@Service
public interface IRegistroService {
    RegistroDTO obtenerRegistro(String numCuenta);
}
