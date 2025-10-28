package fca.cifca.usuarios.services;

import fca.cifca.usuarios.models.EstatusModel;
import fca.cifca.usuarios.models.InscripcionModel;
import fca.cifca.usuarios.models.UsuarioModel;
import fca.cifca.usuarios.models.dtos.InscripcionDTO;
import fca.cifca.usuarios.repositories.InscripcionRepository;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.util.List;

@Slf4j
@Service
@RequiredArgsConstructor
public class UsuarioEstatusService {

    private final InscripcionRepository inscripcionRepository;
    private final EstatusService estatusService;

    public List<UsuarioModel> buscarUsuarioEstatus(InscripcionDTO inscripcionDTO) {
        try {

            EstatusModel estatus = estatusService.findByEstatus(inscripcionDTO.getEstatus());

            return inscripcionRepository.findByEstatus(estatus).stream()
                    .map(InscripcionModel::getUsuario)
                    .toList();

        } catch (Exception e) {
            log.error("Ha ocurrido un error al buscar a los usuarios con dicho estatus", e);
            throw new IllegalArgumentException(e);
        }
    }
}
