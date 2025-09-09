package fca.cifca.titulacion.controllers;

import fca.cifca.titulacion.models.dtos.AlumnoRequest;
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

        byte[] pdf = alumnoService.generarComprobantePdf(alumnoRequest);

        //Extraer número de cuenta del request
        String numeroCuenta = alumnoRequest.getNumeroCuenta();

        //Crear el filename así chulo de bonito
        String nombreArchivo = numeroCuenta + "-comprobante-titulacion.pdf";

        return ResponseEntity.ok()
                .header(HttpHeaders.CONTENT_DISPOSITION, "inline; filename=" + nombreArchivo)
                .contentType(MediaType.APPLICATION_PDF)
                .body(pdf);

    }

}
