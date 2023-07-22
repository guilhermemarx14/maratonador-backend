package com.guilhermemarx14.maratonadorbackend.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.guilhermemarx14.maratonadorbackend.property.ApplicationProperties;

@Configuration
public class BeanConfig {
    @Bean
    ApplicationProperties getApplicationProperties() {
        return new ApplicationProperties();
    }
}
