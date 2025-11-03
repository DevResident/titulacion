package fca.cifca.usuarios.services;

import fca.cifca.usuarios.models.InscripcionModel;
import fca.cifca.usuarios.models.dtos.InscripcionDTO;
import fca.cifca.usuarios.repositories.InscripcionRepository;
import fca.cifca.usuarios.services.interfaces.IPeriodoService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

@Slf4j
@Service
@RequiredArgsConstructor
public class PeriodoService implements IPeriodoService {

    private final InscripcionRepository inscripcionRepository;

    @Override
    public List<InscripcionDTO> obtenerInscritosPorPeriodo(String periodo) {
        try{

           List<InscripcionModel> inscripciones = inscripcionRepository.findAllByPeriodo(periodo);

            return inscripciones.stream() //Convertir lista a stream
                    .map(i -> new InscripcionDTO( //De modelo a DTO
                            i.getId(),
                            i.getUsuario().getIdusuario(),
                            i.getEstatus().getIdEstatus(),
                            i.getPeriodo()
                    ))
                    .collect(Collectors.toList()); //Junta todos los DTOs en una lista.


        } catch(Exception e){

            log.error("Ha ocurrido un error al obtener las incripciones.");
            throw new IllegalArgumentException(e);

        }
    }
}
