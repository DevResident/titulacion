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


    public HashMapRegistro() {

        registros.put("320247558", new RegistroDTO("320247558", "Diego", "Ortega",
                null, "UNAM", "FCA", "Informática",
                "Proyecto", "Presencial(?)", LocalDate.now(), LocalDate.now(), null));

        registros.put("319253704", new RegistroDTO("319253704", "Fernando", "Hurtado",
                "Bárcena",
                "UNAM", "FCA", "Informática",
                "Proyecto", "Presencial(?)", LocalDate.now(), LocalDate.now(), null));

        registros.put("320240834", new RegistroDTO("320240834", "Prueba", "De captura",
                "De CURP con dos dígitos", "UNAM", "FCA",
                "Administración", "Diplomado", "A distancia",
                LocalDate.now(), LocalDate.now(), null));

    }

}
