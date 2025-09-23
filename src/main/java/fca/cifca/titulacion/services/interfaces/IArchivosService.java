package fca.cifca.titulacion.services.interfaces;

import fca.cifca.titulacion.enums.TiposDocumento;
import fca.cifca.titulacion.models.dtos.AlumnoRequest;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import java.io.IOException;

@Service
public interface IArchivosService {

    public String guardarArchivo(MultipartFile archivo, String numeroCuenta, TiposDocumento tipo)
            throws IOException;

}