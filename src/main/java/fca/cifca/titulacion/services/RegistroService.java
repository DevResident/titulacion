package fca.cifca.titulacion.services;

import fca.cifca.titulacion.models.dtos.RegistroDTO;
import fca.cifca.titulacion.services.interfaces.IRegistroService;
import org.springframework.stereotype.Service;

import java.util.Date;

@Service
public class RegistroService implements IRegistroService {

    @Override
    public RegistroDTO obtenerRegistro(String numCuenta){

        RegistroDTO registroDTO = new RegistroDTO("320247558", "Diego", "Ortega",
                null, "FCA", "Informática", "Proyecto",
                new Date(), new Date());

        return registroDTO;

    }

}