package fca.cifca.titulacion.controllers;

import fca.cifca.titulacion.models.dtos.AlumnoDTO;
import fca.cifca.titulacion.models.dtos.AlumnoRequest;
import fca.cifca.titulacion.models.dtos.RegistroDTO;
import fca.cifca.titulacion.models.dtos.RegistroRequest;
import fca.cifca.titulacion.services.AlumnoServiceDB;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
@CrossOrigin
@RestController
@RequestMapping("/alumno")
public class AlumnoController {

    @Autowired
    private AlumnoServiceDB alumnoService;

    @PostMapping("/buscar")
    public AlumnoDTO buscarAlumno(@RequestBody AlumnoRequest alumnoRequest) {
        return alumnoService.buscarAlumno(alumnoRequest.getNumeroCuenta());
    }

    @PostMapping("/registro")
    public RegistroDTO obtenerRegistro(@RequestBody AlumnoRequest alumnoRequest) {

        return alumnoService.obtenerRegistro(alumnoRequest);

    }

    //Nuevo registro
    @PostMapping("registro/nuevo")
    public ResponseEntity<?> registrarAlumno(@RequestBody RegistroRequest registroRequest) {

        return ResponseEntity.ok(alumnoService.registrarAlumno(registroRequest));

    }

}