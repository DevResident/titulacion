package fca.cifca.titulacion.controllers;

import fca.cifca.titulacion.services.ArchivoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

@RestController
@RequestMapping("/carga")
public class CargaArchivosController {

    @Autowired
    private ArchivoService archivoService;


    @PostMapping
    public ResponseEntity<String> cargarArchivo(@RequestParam("archivo")MultipartFile archivo){

        try{
            String urlArchivo = archivoService.guardarArchivo(archivo);
            return ResponseEntity.ok("Archivo guardado en: " + urlArchivo);
        } catch (Exception ex) {

            return ResponseEntity.status(500).body("Error al subir el archivo: " + ex.getMessage());

        }

    }

}
