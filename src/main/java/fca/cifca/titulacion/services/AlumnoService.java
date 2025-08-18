package fca.cifca.titulacion.services;

import fca.cifca.titulacion.models.dtos.AlumnoDTO;
import fca.cifca.titulacion.services.interfaces.iAlumnoService;
import org.springframework.stereotype.Service;

@Service
public class AlumnoService implements iAlumnoService {
    @Override
    public AlumnoDTO buscarAlumno(String numeroCuenta, String curp) {
        AlumnoDTO alumno = new AlumnoDTO("319253704", "Fernando", "Hurtado", "Bárcena", 'h', "Mexicana", "HUBF020824HDFFFAD3");
        return alumno;
    }

}
