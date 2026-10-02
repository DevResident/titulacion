package fca.cifca.titulacion.utils;

import fca.cifca.titulacion.models.dtos.AlumnoDTO;

import java.util.HashMap;
import java.util.Map;

@Deprecated
public class HashMapAlumno {

    private Map<String, AlumnoDTO> alumnos = new HashMap<>();

    public Map<String, AlumnoDTO> getAlumnos() {
        return alumnos;
    }

    public void setAlumnos(Map<String, AlumnoDTO> alumnos) {
        this.alumnos = alumnos;
    }

    public HashMapAlumno() {

    }



}
