package fca.cifca.titulacion.services;

import fca.cifca.titulacion.models.dtos.RegistroDTO;
import fca.cifca.titulacion.services.interfaces.IRegistroService;
import fca.cifca.titulacion.utils.HashMapRegistro;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;

@Service
public class RegistroService implements IRegistroService {

    private HashMapRegistro registros = new HashMapRegistro();


    @Override
    public RegistroDTO obtenerRegistro(String numCuenta, String curp) {

        return registros.getRegistros().getOrDefault(numCuenta, null);

    }
}