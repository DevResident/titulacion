package fca.cifca.titulacion.services;

import fca.cifca.titulacion.models.dtos.RegistroDTO;
import fca.cifca.titulacion.services.interfaces.IRegistroService;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;

@Service
public class RegistroService implements IRegistroService {

    private static final Map<String, RegistroDTO> registros = new HashMap<>();

    static {
        registros.put("320247558", new RegistroDTO("320247558", "Diego", "Ortega",
                null, "FCA", "Informática", "Proyecto", new Date(), new Date()));

        registros.put("319253704", new RegistroDTO("319253704", "Fernando", "Hurtado",
                "Bárcena", "FCA", "Derecho", "Tesis", new Date(), new Date()));
    }

    @Override
    public RegistroDTO obtenerRegistro(String numCuenta) {
        return registros.getOrDefault(numCuenta, null);
    }
}