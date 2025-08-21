package fca.cifca.titulacion.controllers;

import fca.cifca.titulacion.models.dtos.AlumnoDTO;
import fca.cifca.titulacion.models.dtos.AlumnoRequest;
import fca.cifca.titulacion.models.dtos.RegistroDTO;
import fca.cifca.titulacion.services.AlumnoService;
import fca.cifca.titulacion.services.RegistroService;
import jakarta.validation.Valid;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/alumno")
public class AlumnoController {

    private final AlumnoService alumnoService;
    private final RegistroService registroService;

    public AlumnoController(AlumnoService alumnoService, RegistroService registroService) {

        this.alumnoService = alumnoService;
        this.registroService = registroService;
    }
    @GetMapping
    public AlumnoDTO buscarAlumno(@RequestParam String numeroCuenta, @RequestParam String curp) {
        return alumnoService.buscarAlumno(numeroCuenta, curp);
    }

    @PostMapping("/registro")
    public RegistroDTO obtenerRegistro(@RequestBody AlumnoRequest alumnoRequest) {

        AlumnoDTO alumnoPrueba = alumnoService.buscarAlumno(
                alumnoRequest.getNumeroCuenta(),
                alumnoRequest.getCurp()
        );
        return registroService.obtenerRegistro(alumnoPrueba.getNumeroCuenta());

    }
}
