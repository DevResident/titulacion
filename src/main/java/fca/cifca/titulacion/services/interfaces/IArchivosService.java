package fca.cifca.titulacion.services.interfaces;

import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import java.io.IOException;

@Service
public interface IArchivosService {

    public String guardarArchivo(MultipartFile archivo, String numeroCuenta, String curp)
            throws IOException;

}