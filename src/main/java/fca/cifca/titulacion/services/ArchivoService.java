package fca.cifca.titulacion.services;

import fca.cifca.titulacion.enums.TiposDocumento;
import fca.cifca.titulacion.models.dtos.AlumnoRequest;
import fca.cifca.titulacion.services.interfaces.IArchivosService;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.multipart.MultipartFile;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Objects;

@Service
public class ArchivoService implements IArchivosService {

    @Value("${storage.path}")
    private String rutaAlmacenamiento;

    //Recibe los strings desde el controller
    @Override
    public String guardarArchivo(MultipartFile archivo, String numeroCuenta, TiposDocumento tipo)
            throws IOException {

        //Crear dinámicamente el nombre del directorio
        String nombreDirectorio = numeroCuenta;

        //Verificar que el path raíz exista y evitar chirimoyadas
        Path rutaDirectorioUsuario = Paths.get(rutaAlmacenamiento, nombreDirectorio);
        if(!Files.exists(rutaDirectorioUsuario)) {
            Files.createDirectories(rutaDirectorioUsuario);
        }
        //Construir la ruta completa
        Path rutaArchivo = rutaDirectorioUsuario.resolve(tipo.getDescripcion()).normalize();
        if(tipo == TiposDocumento.FOTO && !archivo.getOriginalFilename().split("\\.")[1].equals("jpg")){
            throw new IOException("El archivo debe ser JPG");
        }
        if(!(tipo == TiposDocumento.FOTO) && !archivo.getOriginalFilename().split("\\.")[1].equals("pdf")){
            throw new IOException("El archivo debe ser PDF");
        }
        //Guardamos
        Files.write(rutaArchivo, archivo.getBytes());
        //Regreasar la ruta
        return nombreDirectorio + "/" + tipo;
    }
}
