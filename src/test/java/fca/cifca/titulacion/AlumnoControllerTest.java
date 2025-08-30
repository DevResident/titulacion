package fca.cifca.titulacion;

import com.fasterxml.jackson.databind.ObjectMapper;
import fca.cifca.titulacion.controllers.AlumnoController;
import fca.cifca.titulacion.models.dtos.AlumnoDTO;
import fca.cifca.titulacion.models.dtos.AlumnoRequest;
import fca.cifca.titulacion.models.dtos.RegistroDTO;
import fca.cifca.titulacion.services.AlumnoService;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.http.MediaType;
import org.springframework.test.context.bean.override.mockito.MockitoBean;
import org.springframework.test.web.servlet.MockMvc;
import java.time.LocalDate;
import static org.mockito.ArgumentMatchers.eq;
import static org.mockito.Mockito.when;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.post;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.*;

@WebMvcTest(AlumnoController.class)
public class AlumnoControllerTest {

    @Autowired
    private MockMvc mockMvc;

    @MockitoBean
    private AlumnoService alumnoService;

    @Autowired
    private ObjectMapper objectMapper;

    @BeforeEach
    void setUp() {
        //Solo sé que este método va siempre aunque esté pelón
    }

    @Test
    @DisplayName("Debe devolver AlumnoDTO al buscar alumno")
    void testBuscarAlumno() throws Exception {
        AlumnoRequest request = new AlumnoRequest("123456789", "CURP123456");
        AlumnoDTO mockResponse = new AlumnoDTO(
                "123456789",
                "Diego",
                "Damiel",
                "Ortega",
                'M',
                "Mexicana",
                "CURP123456"
        );

        //Fingiremos que esto es un servicio real. Todo en la vida es mentira a fin de cuentas.
        when(alumnoService.buscarAlumno(eq("123456789"), eq("CURP123456")))
                .thenReturn(mockResponse);

        mockMvc.perform(post("/alumno/buscar")
                        .contentType(MediaType.APPLICATION_JSON)
                        .content(objectMapper.writeValueAsString(request)))
                .andExpect(status().isOk())
                .andExpect(jsonPath("$.numeroCuenta").value("123456789"))
                .andExpect(jsonPath("$.nombre").value("Diego"))
                .andExpect(jsonPath("$.primerApellido").value("Damiel"))
                .andExpect(jsonPath("$.segundoApellido").value("Ortega"))
                .andExpect(jsonPath("$.curp").value("CURP123456"));
    }

    @Test
    @DisplayName("Debe devolver RegistroDTO al obtener registro")
    void testObtenerRegistro() throws Exception {
        AlumnoRequest request = new AlumnoRequest("987654321", "CURP987654");
        RegistroDTO mockResponse = new RegistroDTO(
                "987654321",
                "Ana",
                "Pérez",
                "López",
                "UNAM",
                "FES Aragón",
                "Derecho",
                "Tesis",
                "Escolarizada",
                LocalDate.of(2025, 1, 10),
                LocalDate.of(2025, 2, 20)
        );

        when(alumnoService.obtenerRegistro(request)).thenReturn(mockResponse);

        mockMvc.perform(post("/alumno/registro")
                        .contentType(MediaType.APPLICATION_JSON)
                        .content(objectMapper.writeValueAsString(request)))
                .andExpect(status().isOk())
                .andExpect(jsonPath("$.numeroCuenta").value("987654321"))
                .andExpect(jsonPath("$.universidadProcedencia").value("UNAM"))
                .andExpect(jsonPath("$.plantelProcedencia").value("FES Aragón"))
                .andExpect(jsonPath("$.licenciatura").value("Derecho"))
                .andExpect(jsonPath("$.opcionTitulacion").value("Tesis"))
                .andExpect(jsonPath("$.modalidad").value("Escolarizada"))
                .andExpect(jsonPath("$.fechaRegistro").value("2025-01-10"))
                .andExpect(jsonPath("$.fechaAplicacion").value("2025-02-20"));
    }

}