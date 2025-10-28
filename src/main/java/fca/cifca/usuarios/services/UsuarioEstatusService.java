package fca.cifca.usuarios.services;

import fca.cifca.usuarios.models.EstatusModel;
import fca.cifca.usuarios.models.InscripcionModel;
import fca.cifca.usuarios.models.UsuarioModel;
import fca.cifca.usuarios.models.dtos.InscripcionDTO;
import fca.cifca.usuarios.repositories.InscripcionRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class UsuarioEstatusService {

    private final InscripcionRepository inscripcionRepository;
    private final EstatusService estatusService;

    public List<UsuarioModel> buscarUsuarioEstatus(InscripcionDTO inscripcionDTO) {
        EstatusModel estatus = estatusService.findByEstatus(inscripcionDTO.getEstatus());

        return inscripcionRepository.findByEstatus(estatus).stream()
                .map(InscripcionModel::getUsuario)
                .toList();
    }
}
