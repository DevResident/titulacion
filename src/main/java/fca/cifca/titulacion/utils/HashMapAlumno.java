package fca.cifca.titulacion.utils;

import fca.cifca.titulacion.models.dtos.AlumnoDTO;

import java.util.HashMap;
import java.util.Map;

public class HashMapAlumno {

    private Map<String, AlumnoDTO> alumnos = new HashMap<>();

    public Map<String, AlumnoDTO> getAlumnos() {
        return alumnos;
    }

    public void setAlumnos(Map<String, AlumnoDTO> alumnos) {
        this.alumnos = alumnos;
    }

    public HashMapAlumno() {

        alumnos.put("320247558", new AlumnoDTO("320247558", "Diego", "Ortega", null, 'h', "Mexicana", "OEMD040810HDFRLGA6"));
        alumnos.put("319253704", new AlumnoDTO("319253704", "Fernando", "Hurtado", "Bárcena", 'h', "Mexicana", "HUBF020824HDFRRRA3"));

    }



}
