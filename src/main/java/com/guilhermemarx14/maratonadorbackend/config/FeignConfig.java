package com.guilhermemarx14.maratonadorbackend.config;

import org.springframework.cloud.openfeign.FeignClientsConfiguration;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;
import org.springframework.http.HttpHeaders;

import com.guilhermemarx14.maratonadorbackend.property.ApplicationProperties;

import feign.RequestInterceptor;
import lombok.extern.slf4j.Slf4j;

@Configuration
@Import(FeignClientsConfiguration.class)
@Slf4j
public class FeignConfig {
    @Bean
    feign.Logger.Level feignLoggerLevel() {
        log.debug("FeignConfiguration.feignLoggerLevel()");
        return feign.Logger.Level.FULL;
    }

    @Bean
    public RequestInterceptor requestInterceptor(final ApplicationProperties properties) {
        return requestTemplate -> {

            requestTemplate.header(
                    HttpHeaders.AUTHORIZATION, String.format("Bearer %s", properties.getTmdb().getApiToken()));

            requestTemplate.header("accept", "application/json");

        };
    }
}
