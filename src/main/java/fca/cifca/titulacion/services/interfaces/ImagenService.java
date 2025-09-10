package fca.cifca.titulacion.services.interfaces;

import org.springframework.stereotype.Service;

@Service
public interface ImagenService {



}
/*
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.ResourceHandlerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@Configuration
public class StaticResourceConfig implements WebMvcConfigurer {

    @Override
    public void addResourceHandlers(ResourceHandlerRegistry registry) {
        // Servir archivos desde "uploads/imagenes" en disco
        registry.addResourceHandler("/imagenes/**")
                .addResourceLocations("file:uploads/imagenes/");
    }
}


* */