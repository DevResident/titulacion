package fca.cifca.titulacion.services;

import fca.cifca.titulacion.services.interfaces.IArchivosService;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.multipart.MultipartFile;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

@Service
public class ArchivoService implements IArchivosService {

    @Value("${storage.path}")
    private String rutaAlmacenamiento;

    //Recibe los strings desde el controller
    @Override
    @Transactional(transactionManager = "titulacionTransactionManager", readOnly = true)
    public String guardarArchivo(MultipartFile archivo, String numeroCuenta, String curp)
            throws IOException {


        //Crear dinámicamente el nombre del directorio
        String nombreDirectorio = numeroCuenta + "_" + curp;

        //Verificar que el path raíz exista y evitar chirimoyadas
        Path rutaDirectorioUsuario = Paths.get(rutaAlmacenamiento, nombreDirectorio);
        if(!Files.exists(rutaDirectorioUsuario)) {

            Files.createDirectories(rutaDirectorioUsuario);

        }

        //Obtener el nombre original del archivo
        String nombreArchivo = archivo.getOriginalFilename();
        if(nombreArchivo == null || nombreArchivo.isBlank()){
            throw new IOException("Nombre de archivo inválido");
        }

        //Construir la ruta completa
        Path rutaArchivo = rutaDirectorioUsuario.resolve(nombreArchivo).normalize();

        //Guardamos
        Files.write(rutaArchivo, archivo.getBytes());

        //Regreasar la ruta
        return nombreDirectorio + "/" + nombreArchivo;
    }
}
