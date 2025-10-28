package fca.cifca.usuarios.controllers;

import fca.cifca.usuarios.models.UsuarioModel;
import fca.cifca.usuarios.models.dtos.InscripcionDTO;
import fca.cifca.usuarios.services.UsuarioEstatusService;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;

@Controller
@RequestMapping("/inscripciones")
@RequiredArgsConstructor
public class InscripcionController {

    @Autowired
    private final UsuarioEstatusService usuarioEstatusService;

    @PostMapping("/estatus")
    public List<UsuarioModel> buscarUsuarioEstatus(@RequestParam InscripcionDTO inscripcionDTO) {
        return usuarioEstatusService.buscarUsuarioEstatus(inscripcionDTO);
    }

    //@PostMapping("/periodo")
}
