package fca.cifca.titulacion.utils;

import fca.cifca.titulacion.models.dtos.RegistroDTO;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;

public class HashMapRegistro {

    private Map<String, RegistroDTO> registros = new HashMap<>();

    public Map<String, RegistroDTO> getRegistros() {
        return registros;
    }

    public void setRegistros(Map<String, RegistroDTO> registros) {
        this.registros = registros;
    }

    public HashMapRegistro() {

        registros.put("320247558", new RegistroDTO("320247558", "Diego", "Ortega",
                null, "FCA", "Informática", "Proyecto", new Date(), new Date()));
        registros.put("319253704", new RegistroDTO("319253704", "Fernando", "Hurtado",
                "Bárcena", "FCA", "Derecho", "Tesis", new Date(), new Date()));

    }

}
