package fca.cifca.titulacion.configs;

import jakarta.persistence.EntityManagerFactory;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.boot.jdbc.DataSourceBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.orm.jpa.JpaTransactionManager;
import org.springframework.orm.jpa.LocalContainerEntityManagerFactoryBean;
import org.springframework.orm.jpa.vendor.HibernateJpaVendorAdapter;
import org.springframework.transaction.PlatformTransactionManager;

import javax.sql.DataSource;
import java.util.HashMap;
import java.util.Map;

@Configuration
@EnableJpaRepositories(
        basePackages = "fca.cifca.usuarios.repositories", // paquetes de repositorios de la segunda DB
        entityManagerFactoryRef = "usuariosEntityManagerFactory",
        transactionManagerRef = "usuariosTransactionManager"
)
public class UsuariosDBConfig {

    @Bean(name = "usuariosDataSource")
    @ConfigurationProperties(prefix = "spring.datasource.secondary")
    public DataSource usuariosDataSource() {
        return DataSourceBuilder.create()
                .url("jdbc:postgresql://localhost:5432/usuarios")
                .username("postgres")
                .password("Dortega1008.")
                .driverClassName("org.postgresql.Driver")
                .build();
    }

    @Bean(name = "usuariosEntityManagerFactory")
    public LocalContainerEntityManagerFactoryBean usuariosEntityManagerFactory(
            @Qualifier("usuariosDataSource") DataSource dataSource
    ) {
        LocalContainerEntityManagerFactoryBean em = new LocalContainerEntityManagerFactoryBean();
        em.setDataSource(dataSource);
        em.setPackagesToScan("fca.cifca.usuarios.models"); // Entidades de esta DB
        em.setJpaVendorAdapter(new HibernateJpaVendorAdapter());

        em.setPersistenceUnitName("usuarios");

        Map<String, Object> props = new HashMap<>();
        props.put("hibernate.dialect", "org.hibernate.dialect.PostgreSQLDialect");
        em.setJpaPropertyMap(props);

        return em;
    }

    @Bean(name = "usuariosTransactionManager")
    public PlatformTransactionManager usuariosTransactionManager(
            @Qualifier("usuariosEntityManagerFactory") EntityManagerFactory usuariosEntityManagerFactory
    ) {
        return new JpaTransactionManager(usuariosEntityManagerFactory);
    }

}
