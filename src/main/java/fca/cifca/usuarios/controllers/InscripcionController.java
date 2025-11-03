package fca.cifca.usuarios.controllers;

import fca.cifca.usuarios.models.InscripcionModel;
import fca.cifca.usuarios.models.UsuarioModel;
import fca.cifca.usuarios.models.dtos.InscripcionRequest;
import fca.cifca.usuarios.models.dtos.PeriodoRequest;
import fca.cifca.usuarios.services.PeriodoService;
import fca.cifca.usuarios.services.UsuarioEstatusService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/inscripciones")
@RequiredArgsConstructor
public class InscripcionController {

    private final UsuarioEstatusService usuarioEstatusService;
    private final PeriodoService periodoService;

    @PostMapping("/estatus")
    public List<UsuarioModel> buscarUsuarioEstatus(@RequestBody InscripcionRequest inscripcionRequest) {
        return usuarioEstatusService.buscarUsuarioEstatus(inscripcionRequest);
    }

    @PostMapping("/periodo")
    public List<InscripcionModel> obtenerInscripcionesPorPeriodo(@RequestBody PeriodoRequest periodoRequest) {
        return periodoService.obtenerInscritosPorPeriodo(periodoRequest.getPeriodo());
    }
}
