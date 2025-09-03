package fca.cifca.titulacion.controllers;

import fca.cifca.titulacion.models.dtos.AlumnoDTO;
import fca.cifca.titulacion.models.dtos.AlumnoRequest;
import fca.cifca.titulacion.models.dtos.RegistroDTO;
import fca.cifca.titulacion.services.AlumnoServiceDB;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/alumno")
public class AlumnoController {

    @Autowired
    private AlumnoServiceDB alumnoService;

    @PostMapping("/buscar")
    //public AlumnoDTO buscarAlumno(@RequestParam String numeroCuenta, @RequestParam String curp) {
    public AlumnoDTO buscarAlumno(@RequestBody AlumnoRequest alumnoRequest) {
        //return alumnoService.buscarAlumno(numeroCuenta, curp);
        return alumnoService.buscarAlumno(alumnoRequest.getNumeroCuenta(), alumnoRequest.getCurp());
    }

    @PostMapping("/registro")
    public RegistroDTO obtenerRegistro(@RequestBody AlumnoRequest alumnoRequest) {

        return alumnoService.obtenerRegistro(alumnoRequest);

    }

    //Nuevo registro
    @PostMapping("registro/nuevo")
    public ResponseEntity<?> registrarAlumno(@RequestBody AlumnoRequest alumnoRequest) {
        
    }

}
