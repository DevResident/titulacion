package fca.cifca.titulacion.services;

import fca.cifca.titulacion.models.dtos.CodigoDTO;
import fca.cifca.titulacion.models.dtos.CorreoRequest;
import fca.cifca.titulacion.utils.CodigoUtil;
import org.springframework.stereotype.Service;
import java.time.Instant;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.logging.Logger;


@Service
public class VerificarCorreoService {

    private final Map<String, CodigoDTO> codigosPendientes = new ConcurrentHashMap<>();
    private final CorreoService correoService;

    public VerificarCorreoService(CorreoService correoService) {
        this.correoService = correoService;
    }

    public void enviarCodigo(String correo){

        String codigo = CodigoUtil.generarCodigo();
        codigosPendientes.put(correo, new CodigoDTO(correo,
                codigo,
                LocalDateTime.ofInstant(
                        Instant.now().plusSeconds(300),
                        ZoneId.systemDefault())
                )
        );

        correoService.mandarCorreo(new CorreoRequest(
                correo,
                "C?digo de verificaci?n",
                "Tu c?digo de verificaci?n es: " + codigo + ". Expira en 5 minutos."
        ));

        Logger log =  Logger.getLogger(VerificarCorreoService.class.getName());
        log.info("C?digo enviado: " + codigo);

    }


    public boolean verificarCodigo(String correo, String codigoIngresado) {
        CodigoDTO info = codigosPendientes.get(correo);
        if (info == null) return false;

        // Comparar usando LocalDateTime
        if (LocalDateTime.now().isAfter(info.getExpiracion())) return false;

        return info.getCodigo().equals(codigoIngresado);
    }

}