package fca.cifca.titulacion.services;

import fca.cifca.titulacion.models.dtos.AlumnoDTO;
import fca.cifca.titulacion.services.interfaces.IAlumnoService;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.Map;

@Service
public class AlumnoService implements IAlumnoService {

    private static final Map<String, AlumnoDTO> alumnos = new HashMap<>();

    static {
        alumnos.put("320247558", new AlumnoDTO("320247558", "Diego", "Ortega", null, 'h', "Mexicana", "XXXX123456XXX"));
        alumnos.put("319253704", new AlumnoDTO("319253704", "Fernando", "Hurtado", "Bárcena", 'h', "Mexicana", "HUBF020824HDFRRRA3"));
    }

    @Override
    public AlumnoDTO buscarAlumno(String numeroCuenta, String curp) {

        return alumnos.getOrDefault(numeroCuenta, null);
    }

}
