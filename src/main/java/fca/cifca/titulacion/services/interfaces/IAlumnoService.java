package fca.cifca.titulacion.services.interfaces;

import fca.cifca.titulacion.models.RegistroModel;
import fca.cifca.titulacion.models.dtos.AlumnoDTO;
import fca.cifca.titulacion.models.dtos.ArchivoDTO;
import fca.cifca.titulacion.models.dtos.RegistroDTO;
import fca.cifca.titulacion.models.dtos.RegistroRequest;
import org.springframework.stereotype.Service;

@Service
public interface IAlumnoService {
    AlumnoDTO buscarAlumno(String numeroCuenta);
    RegistroDTO obtenerRegistro(String numeroCuenta);
    RegistroModel registrarAlumno(RegistroRequest registro);
    ArchivoDTO generarComprobantePdf(String numeroCuenta);
}