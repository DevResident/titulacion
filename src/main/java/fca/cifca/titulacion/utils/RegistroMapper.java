package fca.cifca.titulacion.utils;

import fca.cifca.titulacion.models.RegistroModel;
import fca.cifca.titulacion.models.dtos.RegistroResponse;
import lombok.NoArgsConstructor;

@NoArgsConstructor
public class RegistroMapper {

    public RegistroResponse toDto(RegistroModel model) {

        RegistroResponse dto = new RegistroResponse();
        dto.setIdRegistro(model.getIdRegistroAlumno());
        dto.setIdAlumno(model.getAlumno().getIdAlumno());
        dto.setIdModalidadTitulacion(model.getModalidadTitulacion().getIdModalidadTitulacion());
        dto.setIdOpcionTitulacion(model.getOpcionTitulacion().getIdOpcionTitulacion());
        dto.setIdConvocatoria(model.getConvocatoriaTitulacion() != null ?
                model.getConvocatoriaTitulacion().getCoti_id_convocatoria_titulacion() : null);
        dto.setIdOrientacion(model.getOrientacion() != null ?
                model.getOrientacion().getOrieIdOrientacion() : null);
        dto.setIdAreaConocimiento(model.getAreaConocimiento() != null ?
                model.getAreaConocimiento().getIdAreaConocimiento() : null);

        dto.setComentario(model.getComentario());
        dto.setNombre(model.getNombre());
        dto.setSemestreInicio(model.getSemestreInicio());
        dto.setSemestreFin(model.getSemestreFin());
        dto.setEsOpcionTitulacion(model.getEsOpcionTitulacion());
        dto.setCalificacion(model.getCalificacion());
        dto.setFechaInicio(model.getFechaInicio());
        dto.setFechaFin(model.getFechaFin());
        dto.setFecAprobacion(model.getFecAprobacion());
        dto.setFolio(model.getFolio());
        dto.setFechaRegistro(model.getFechaRegistro());
        return dto;
    }


}
