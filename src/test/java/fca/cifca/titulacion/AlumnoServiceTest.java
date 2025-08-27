package fca.cifca.titulacion;

import fca.cifca.titulacion.exceptions.AlumnoNoEncontradoException;
import fca.cifca.titulacion.exceptions.CurpInvalidaException;
import fca.cifca.titulacion.exceptions.NumeroCuentaInvalidoException;
import fca.cifca.titulacion.models.dtos.AlumnoDTO;
import fca.cifca.titulacion.models.dtos.AlumnoRequest;
import fca.cifca.titulacion.services.AlumnoService;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class AlumnoServiceTest {

    //Servicio que queremos probar unitariamente.
    private AlumnoService alumnoService;

    @BeforeEach
     void setUp() {
        alumnoService = new AlumnoService();
    }

    @Test
    void buscarAlumno_NumeroCuentaInvalido_LanzaExcepcion() {
        assertThrows(NumeroCuentaInvalidoException.class, () -> {
            alumnoService.buscarAlumno("ABC123", "CURPVALIDA12345678");
        });
    }

    @Test
    void buscarAlumno_CurpInvalida_LanzaExcepcion() {
        assertThrows(CurpInvalidaException.class, () -> {
            alumnoService.buscarAlumno("202312345", "CURP_INVALIDA");
        });
    }

    @Test
    void buscarAlumno_AlumnoNoExiste_LanzaExcepcion() {
        assertThrows(AlumnoNoEncontradoException.class, () -> {
            alumnoService.buscarAlumno("202312345", "PEPE010101HDFRRN01");
        });
    }

    @Test
    void obtenerRegistro_NumeroCuentaNoExiste_RetornaNulo() {
        assertNull(alumnoService.obtenerRegistro(
                new AlumnoRequest("202312345", "PEPE010101HDFRRN01"))
        );
    }

}
