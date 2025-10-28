package fca.cifca.usuarios.controllers;

import fca.cifca.usuarios.models.UsuarioModel;
import fca.cifca.usuarios.models.dtos.InscripcionDTO;
import fca.cifca.usuarios.services.UsuarioEstatusService;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/inscripciones")
@RequiredArgsConstructor
public class InscripcionController {

    private final UsuarioEstatusService usuarioEstatusService;

    @PostMapping("/estatus")
    public List<UsuarioModel> buscarUsuarioEstatus(@RequestBody InscripcionDTO inscripcionDTO) {
        return usuarioEstatusService.buscarUsuarioEstatus(inscripcionDTO);
    }

    //@PostMapping("/periodo")
}
