package fca.cifca.titulacion.models.dtos;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class ArchivoDTO {
    private String nombreArchivo;
    private byte[] contenido;
}