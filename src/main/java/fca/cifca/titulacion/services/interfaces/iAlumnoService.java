package fca.cifca.titulacion.services.interfaces;

import fca.cifca.titulacion.models.dtos.AlumnoDTO;
import org.springframework.stereotype.Service;

@Service
public interface iAlumnoService {
    AlumnoDTO buscarAlumno(String numeroCuenta, String curp);
}
