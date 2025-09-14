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
        basePackages = "fca.cifca.titulacion.repositories",
        entityManagerFactoryRef = "titulacionEntityManagerFactory",
        transactionManagerRef = "titulacionTransactionManager"
)
public class TitulacionDBConfig {

    @Bean(name = "titulacionDataSource")
    @ConfigurationProperties(prefix = "spring.datasource")
    public DataSource titulacionDataSource() {

        return DataSourceBuilder.create()
                .url("jdbc:postgresql://localhost:5432/titulacion")
                .username("postgres")
                .password("Dortega1008.")
                .driverClassName("org.postgresql.Driver")
                .build();

    }

    @Bean(name = "titulacionEntityManagerFactory")
    public LocalContainerEntityManagerFactoryBean titulacionEntityManagerFactory(
            @Qualifier("titulacionDataSource") DataSource dataSource) {
        LocalContainerEntityManagerFactoryBean em = new LocalContainerEntityManagerFactoryBean();
        em.setDataSource(dataSource);
        em.setPackagesToScan("fca.cifca.titulacion.models");
        em.setJpaVendorAdapter(new HibernateJpaVendorAdapter());

        Map<String, Object> props = new HashMap<>();
        props.put("hibernate.dialect", "org.hibernate.dialect.PostgreSQLDialect");
        em.setJpaPropertyMap(props);

        return em;
    }

    @Bean(name = "titulacionTransactionManager")
    public PlatformTransactionManager titulacionTransactionManager(
            @Qualifier("titulacionEntityManagerFactory") EntityManagerFactory titulacionEntityManagerFactory) {
        return new JpaTransactionManager(titulacionEntityManagerFactory);
    }
}