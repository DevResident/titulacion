package fca.cifca.titulacion.controllers;

import fca.cifca.titulacion.models.dtos.AlumnoDTO;
import fca.cifca.titulacion.models.dtos.RegistroDTO;
import fca.cifca.titulacion.models.dtos.RegistroRequest;
import fca.cifca.titulacion.services.AlumnoServiceDB;
import fca.cifca.titulacion.utils.JwtUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
@CrossOrigin
@RestController
@RequestMapping("/alumno")
public class AlumnoController {

    @Autowired
    private AlumnoServiceDB alumnoService;

    @Autowired
    private JwtUtil jwtUtil;

    @PostMapping("/buscar")
    public AlumnoDTO buscarAlumno(@RequestHeader("Authorization") String authHeader) {
        String token = jwtUtil.extractTokenFromHeader(authHeader);
        return alumnoService.buscarAlumno(jwtUtil.extractNumeroCuenta(token));
    }

    @PostMapping("/registro")
    public RegistroDTO obtenerRegistro(@RequestHeader("Authorization") String authHeader) {

        //return alumnoService.obtenerRegistro(alumnoRequest);
        String token = jwtUtil.extractTokenFromHeader(authHeader);
        return alumnoService.obtenerRegistro(jwtUtil.extractNumeroCuenta(token));


    }

    //Nuevo registro
    @PostMapping("registro/nuevo")
    public ResponseEntity<?> registrarAlumno(@RequestBody RegistroRequest registroRequest) {

        return ResponseEntity.ok(alumnoService.registrarAlumno(registroRequest));

    }

}