package fca.cifca.titulacion.services.interfaces;

import fca.cifca.titulacion.models.dtos.AlumnoDTO;
import fca.cifca.titulacion.models.dtos.AlumnoRequest;
import fca.cifca.titulacion.models.dtos.RegistroDTO;
import org.springframework.stereotype.Service;

@Service
public interface IAlumnoService {
    AlumnoDTO buscarAlumno(String numeroCuenta, String curp);
    RegistroDTO obtenerRegistro(AlumnoRequest alumnoRequest);
}