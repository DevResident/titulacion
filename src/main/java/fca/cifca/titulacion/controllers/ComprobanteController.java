package fca.cifca.titulacion.controllers;

import fca.cifca.titulacion.models.dtos.AlumnoRequest;
import fca.cifca.titulacion.models.dtos.ArchivoDTO;
import fca.cifca.titulacion.services.AlumnoServiceDB;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpHeaders;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/comprobante")
public class ComprobanteController {

    @Autowired
    private AlumnoServiceDB alumnoService;

    //PDF del registro.
    @PostMapping("/pdf")
    public ResponseEntity<byte[]> generarPDFComprobante(@RequestBody AlumnoRequest alumnoRequest) {

        ArchivoDTO archivo = alumnoService.generarComprobantePdf(alumnoRequest);

        return ResponseEntity.ok()
                .header(HttpHeaders.CONTENT_DISPOSITION, "inline; filename=" + archivo.getNombreArchivo())
                .contentType(MediaType.APPLICATION_PDF)
                .body(archivo.getContenido());

    }

}
