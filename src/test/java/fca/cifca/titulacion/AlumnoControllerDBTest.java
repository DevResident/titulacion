package fca.cifca.titulacion;

import com.fasterxml.jackson.databind.ObjectMapper;
import fca.cifca.titulacion.controllers.AlumnoController;
import fca.cifca.titulacion.models.dtos.AlumnoDTO;
import fca.cifca.titulacion.models.dtos.AlumnoRequest;
import fca.cifca.titulacion.models.dtos.RegistroDTO;
import fca.cifca.titulacion.models.dtos.RegistroRequest;
import fca.cifca.titulacion.services.AlumnoServiceDB;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.test.context.bean.override.mockito.MockitoBean;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.http.MediaType;

import static org.mockito.ArgumentMatchers.any;
import static org.mockito.Mockito.doNothing;
import static org.mockito.Mockito.when;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.post;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.*;

@WebMvcTest(AlumnoController.class)
public class AlumnoControllerDBTest {

    //Todos nuestros cosos para mockear.
    @Autowired
    private MockMvc mockMvc;

    @Autowired
    private ObjectMapper objectMapper;

    @MockitoBean
    private AlumnoServiceDB alumnoService;

    @Test
    void buscarAlumno_devuelveAlumnoDTO() throws Exception {
        /*
        private String numeroCuenta;
    private String nombre;
    private String primerApellido;
    private String segundoApellido;
    private String sexo;
    private String nacionalidad; //Se llena desde la relación
    private String curp;
        */

        AlumnoDTO mockAlumno = new AlumnoDTO();
        mockAlumno.setNumeroCuenta("320247568");
        mockAlumno.setNombre("Juan");
        mockAlumno.setPrimerApellido("Rulfo");
        mockAlumno.setSegundoApellido(null);
        mockAlumno.setSexo("M");
        mockAlumno.setNacionalidad("Checa");
        mockAlumno.setCurp("OEMD040810HDFRLGA6");

        AlumnoRequest request = new AlumnoRequest();
        request.setNumeroCuenta("320247568");

        when(alumnoService.buscarAlumno("320247568"))
                .thenReturn(mockAlumno);

        mockMvc.perform(post("/alumno/buscar")
                        .contentType(MediaType.APPLICATION_JSON)
                        .content(objectMapper.writeValueAsString(request)))
                .andExpect(status().isOk())
                .andExpect(jsonPath("$.numeroCuenta").value("320247568"))
                .andExpect(jsonPath("$.nombre").value("Juan"))
                .andExpect(jsonPath("$.primerApellido").value("Rulfo"))
                .andExpect(jsonPath("$.segundoApellido").doesNotExist()) //El dato seteado es nulo, no existe
                .andExpect(jsonPath("$.sexo").value("M"))
                .andExpect(jsonPath("$.nacionalidad").value("Checa"))
                .andExpect(jsonPath("$.curp").value("OEMD040810HDFRLGA6"));

    }

    @Test
    void obtenerRegistro_devuelveRegistroDTO() throws Exception {

        AlumnoRequest request = new AlumnoRequest();
        request.setNumeroCuenta("320247568");

        RegistroDTO registro = new RegistroDTO();
        registro.setNumeroCuenta("320247568");

        when(alumnoService.obtenerRegistro(request)).thenReturn(registro);

        mockMvc.perform(post("/alumno/registro")
                        .contentType(MediaType.APPLICATION_JSON)
                        .content(objectMapper.writeValueAsString(request)))
                .andExpect(status().isOk())
                .andExpect(jsonPath("$.numeroCuenta").value("320247568"));
    }

    @Test
    void obtenerAlumno_devuelveOk() throws Exception {

        RegistroRequest request = new RegistroRequest();
        request.setIdAlumno(1);
        request.setIdModalidadTitulacion(2);
        request.setIdOpcionTitulacion(3);
        request.setComentario("Comentario de prueba");
        request.setNombre("Proyecto X");
        request.setSemestreInicio("2023-1");
        request.setSemestreFin("2023-2");
        request.setEsOpcionTitulacion(true);
        request.setCalificacion("9.5");
        request.setFolio(1234);

        when(alumnoService.registrarAlumno(any(RegistroRequest.class)))
                .thenReturn(null);

        mockMvc.perform(post("/alumno/registro/nuevo")
                        .contentType(MediaType.APPLICATION_JSON)
                        .content(objectMapper.writeValueAsString(request)))
                .andExpect(status().isOk());

    }

}