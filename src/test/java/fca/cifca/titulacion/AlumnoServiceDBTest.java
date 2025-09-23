package fca.cifca.titulacion;

import fca.cifca.titulacion.exceptions.AlumnoNoEncontradoException;
import fca.cifca.titulacion.exceptions.CurpInvalidaException;
import fca.cifca.titulacion.exceptions.NumeroCuentaInvalidoException;
import fca.cifca.titulacion.models.*;
import fca.cifca.titulacion.models.dtos.AlumnoRequest;
import fca.cifca.titulacion.repositories.AlumnoRepository;
import fca.cifca.titulacion.services.AlumnoServiceDB;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.annotation.DirtiesContext;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertThrows;

@SpringBootTest
@DirtiesContext(classMode = DirtiesContext.ClassMode.BEFORE_EACH_TEST_METHOD)
class AlumnoServiceDBTest {

    @Autowired
    private AlumnoServiceDB alumnoService;

    @Autowired
    private AlumnoRepository alumnoRepository;

    @BeforeEach
    void setUp() {

        AlumnoModel alumno = CreadorDatosPruebas.crearAlumno();
        alumnoRepository.save(alumno);
    }

    @Test
    void buscarAlumno_NumeroCuentaInvalido_LanzaExcepcion() {
        assertThrows(NumeroCuentaInvalidoException.class, () -> {
            alumnoService.buscarAlumno("ABC123");
        });
    }

    @Test
    void buscarAlumno_CurpInvalida_LanzaExcepcion() {
        assertThrows(CurpInvalidaException.class, () -> {
            alumnoService.buscarAlumno("202312345");
        });
    }

    @Test
    void buscarAlumno_AlumnoNoExiste_LanzaExcepcion() {
        assertThrows(AlumnoNoEncontradoException.class, () -> {
            alumnoService.buscarAlumno("202399999");
        });
    }

    @Test
    void buscarAlumno_AlumnoExiste_RetornaDTO() {
        assertNotNull(alumnoService.buscarAlumno("320247568"));
    }
    /*
    @Test
    void obtenerRegistro_NoExisteRegistro_LanzaExcepcion() {
        assertThrows(AlumnoNoEncontradoException.class, () -> {
            alumnoService.obtenerRegistro(new AlumnoRequest("202312345", "PEPE010101HDFRRN01"));
        });
    }

     */
}