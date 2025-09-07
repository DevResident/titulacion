package fca.cifca.titulacion.models.dtos;

import fca.cifca.titulacion.models.AlumnoModel;
import fca.cifca.titulacion.models.PersonaModel;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor

public class AlumnoDTO {
    private String numeroCuenta;
    private String nombre;
    private String primerApellido;
    private String segundoApellido;
    private String sexo;
    private String nacionalidad; //Se llena desde la relación
    private String curp;

    //Constructor para mappear el Model al DTO
    public AlumnoDTO(AlumnoModel alumno) {

        this.numeroCuenta = alumno.getNumeroCuenta();
        PersonaModel persona = alumno.getIdPersona();

        if (persona != null) {
            this.nombre = persona.getPers_nombre();
            this.primerApellido = persona.getPers_apaterno();
            this.segundoApellido = persona.getPers_amaterno();
            this.sexo = persona.getPers_sexo();
            this.nacionalidad = persona.getPers_id_pais().getPais_nacionalidad();
            this.curp = persona.getPers_curp();
        }

    }

}
