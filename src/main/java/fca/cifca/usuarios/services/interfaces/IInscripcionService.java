package fca.cifca.usuarios.services.interfaces;

import fca.cifca.usuarios.models.InscripcionModel;
import org.springframework.stereotype.Service;

@Service
public interface IInscripcionService {

    //TBD mover lo de IPeriodoService aquí.

    InscripcionModel guardarInscripcion(InscripcionModel inscripcion);

}
