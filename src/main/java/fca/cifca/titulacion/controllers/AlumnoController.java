package fca.cifca.titulacion.controllers;

import fca.cifca.titulacion.models.dtos.AlumnoDTO;
import fca.cifca.titulacion.models.dtos.AlumnoRequest;
import fca.cifca.titulacion.services.AlumnoService;
import jakarta.validation.Valid;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/alumno")
public class AlumnoController {

    private final AlumnoService alumnoService;
    public AlumnoController(AlumnoService alumnoService) {

        this.alumnoService = alumnoService;
    }
    @GetMapping
    public AlumnoDTO buscarAlumno(@RequestParam String numeroCuenta, @RequestParam String curp) {
        return alumnoService.buscarAlumno(numeroCuenta, curp);
    }

}
