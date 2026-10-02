package fca.cifca.titulacion.configs;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.ResourceHandlerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@Configuration
public class RecursosEstaticosConfig implements WebMvcConfigurer {

    @Value("${storage.path}")
    private String almacenamientoPath;

    @Override
    public void addResourceHandlers(ResourceHandlerRegistry registry) {
        registry.addResourceHandler("/misc/**")
                .addResourceLocations("file:" + almacenamientoPath);
    }

}