package fca.cifca.titulacion.services.clients;

import fca.cifca.titulacion.models.dtos.RegistroDTO;
import org.springframework.stereotype.Service;
import org.springframework.web.reactive.function.client.WebClient;
import org.springframework.http.MediaType;

@Service
public class ClientePDF {

    private final WebClient cliente;

    //8081 pq ahí corro el otro
    public ClientePDF(WebClient.Builder webClientBuilder) {
        this.cliente = webClientBuilder
                .baseUrl("http://127.0.0.1:8081")
                .build();
    }

    public byte[] generarComprobante(RegistroDTO dto) {
        return cliente.post()
                .uri("/titulacion/comprobante")
                .contentType(MediaType.APPLICATION_JSON)       //Indicamos que esperamos un PDF
                .bodyValue(dto)                           //El cuerpo es el DTO
                .retrieve()
                .bodyToMono(byte[].class)                 //Esperamos un arreglo de bytes (el PDF)
                .block();                                 //Bloqueamos para hacerlo síncrono
    }

}
