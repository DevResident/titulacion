package fca.cifca.titulacion.controllers;

import fca.cifca.titulacion.enums.TiposDocumento;
import fca.cifca.titulacion.models.dtos.AlumnoDTO;
import fca.cifca.titulacion.services.AlumnoServiceDB;
import fca.cifca.titulacion.services.ArchivoService;
import fca.cifca.titulacion.utils.JwtUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

@RestController
@RequestMapping("/carga")
public class ArchivoController {

    @Autowired
    private ArchivoService archivoService;
    @Autowired
    private AlumnoServiceDB alumnoService;
    @Autowired
    private JwtUtil jwtUtil;


    @PostMapping
    public ResponseEntity<String> cargarArchivo(@RequestParam("archivo")MultipartFile archivo, @RequestParam("tipo") TiposDocumento tipo,
                                                @RequestHeader("Authorization") String authHeader){

        try{

            String token = jwtUtil.extractTokenFromHeader(authHeader);
            String numeroCuenta = jwtUtil.extractNumeroCuenta(token);
            AlumnoDTO alumnoDTO = alumnoService.buscarAlumno(numeroCuenta);
            String nombreDirectorio = numeroCuenta + "_" + alumnoDTO.getCurp();
            String urlArchivo = archivoService.guardarArchivo(archivo, numeroCuenta, tipo, nombreDirectorio);

            return ResponseEntity.ok("Archivo guardado en: " + urlArchivo);

        } catch (Exception ex) {

            return ResponseEntity.status(500).body("Error al subir el archivo: " + ex.getMessage());

        }

    }

}
