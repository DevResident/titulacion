package fca.cifca.titulacion.services.clients;

import fca.cifca.titulacion.models.dtos.RegistroDTO;
import org.springframework.stereotype.Service;
import org.springframework.web.reactive.function.client.WebClient;
import org.springframework.http.MediaType;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

@Service
public class ClientePDF {

    private final WebClient cliente;

    //8081 pq ahí corro el otro
    public ClientePDF(WebClient.Builder webClientBuilder) {
        this.cliente = webClientBuilder
                .baseUrl("http://127.0.0.1:8081")
                .codecs(configurer ->
                        configurer.defaultCodecs().maxInMemorySize(16 * 1024 * 1024) // 16MB
                )
                .build();
    }

    public byte[] generarComprobante(RegistroDTO dto) {

        byte[] pdf = cliente.post()
                .uri("/titulacion/comprobante")
                .contentType(MediaType.APPLICATION_JSON)
                .bodyValue(dto)
                .retrieve()
                .bodyToMono(byte[].class)
                .block();

        //Mandar a almacenamiento
        if(pdf != null) {

            try{

                //Crear el filename así chulo de bonito
                String nombreArchivo = dto.getNumeroCuenta() + "-comprobante-titulacion.pdf";

                //Ruta.
                Path path = Paths.get("pdfs", nombreArchivo);

                Files.createDirectories(path.getParent());
                Files.write(path, pdf);
                System.out.println("PDF guardado en: " + path.toAbsolutePath());

            } catch (IOException ex){

                ex.printStackTrace();

            }

        }

        return pdf;

    }

}