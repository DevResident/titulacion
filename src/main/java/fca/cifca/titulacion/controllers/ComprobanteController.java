package fca.cifca.titulacion.controllers;

import fca.cifca.titulacion.models.dtos.ArchivoDTO;
import fca.cifca.titulacion.services.AlumnoServiceDB;
import fca.cifca.titulacion.utils.JwtUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpHeaders;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/comprobante")
public class ComprobanteController {

    @Autowired
    private AlumnoServiceDB alumnoService;

    @Autowired
    private JwtUtil jwtUtil;

    //PDF del registro.
    @PostMapping("/pdf")
    public ResponseEntity<byte[]> generarPDFComprobante(@RequestHeader("Authorization") String authHeader) {

        String token = jwtUtil.extractTokenFromHeader(authHeader);
        ArchivoDTO archivo = alumnoService.generarComprobantePdf(jwtUtil.extractNumeroCuenta(token));

        return ResponseEntity.ok()
                .header(HttpHeaders.CONTENT_DISPOSITION, "inline; filename=" + archivo.getNombreArchivo())
                .contentType(MediaType.APPLICATION_PDF)
                .body(archivo.getContenido());

    }

}
