package fca.cifca.titulacion.utils;

import fca.cifca.titulacion.models.dtos.RegistroDTO;

import java.time.LocalDate;
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


}
