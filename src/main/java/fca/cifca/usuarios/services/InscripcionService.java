package fca.cifca.usuarios.services;

import fca.cifca.usuarios.models.InscripcionModel;
import fca.cifca.usuarios.repositories.InscripcionRepository;
import fca.cifca.usuarios.services.interfaces.IInscripcionService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

@Slf4j
@Service
@RequiredArgsConstructor
public class InscripcionService implements IInscripcionService {

    private final InscripcionRepository inscripcionRepository;

    @Override
    public InscripcionModel guardarInscripcion(InscripcionModel inscripcion) {

        //Aqui debe ir la logica que setee las relaciones de usuario y de estatus junto al periodo.
        return inscripcionRepository.save(inscripcion);
    }

}