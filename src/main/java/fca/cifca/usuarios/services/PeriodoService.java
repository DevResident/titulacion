package fca.cifca.usuarios.services;

import fca.cifca.usuarios.models.InscripcionModel;
import fca.cifca.usuarios.repositories.InscripcionRepository;
import fca.cifca.usuarios.services.interfaces.IPeriodoService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.util.List;

@Slf4j
@Service
@RequiredArgsConstructor
public class PeriodoService implements IPeriodoService {

    private final InscripcionRepository inscripcionRepository;

    @Override
    public List<InscripcionModel> obtenerInscritosPorPeriodo(String periodo) {
        try{

            return inscripcionRepository.getAllByPeriodo(periodo)
                    .orElseThrow(() -> new RuntimeException("Sin registros para el periodo " + periodo));

        } catch(Exception e){

            log.error("Ha ocurrido un error al obtener las incripciones.");
            throw new IllegalArgumentException(e);

        }
    }
}
