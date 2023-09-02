package com.geolocator;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.core.env.Environment;
import org.springframework.jdbc.datasource.DriverManagerDataSource;

import javax.sql.DataSource;

@Configuration
@ComponentScan("com.geolocator")
@PropertySource("classpath:application.properties")
public class SpringJdbcConfig {

    final
    Environment environment;

    public SpringJdbcConfig(Environment environment) {
        this.environment = environment;
    }

    @Bean
    public DataSource mysqlDataSource() {
        var dataSource = new DriverManagerDataSource();
        dataSource.setDriverClassName(environment.getProperty("driver"));
        dataSource.setUrl(environment.getProperty("url"));
        dataSource.setUsername(environment.getProperty("dbuser"));
        dataSource.setPassword(environment.getProperty("dbpassword"));
        return dataSource;
    }
}
