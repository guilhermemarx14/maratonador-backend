package com.guilhermemarx14.maratonadorbackend.config;

import org.springframework.beans.factory.annotation.Qualifier;
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
    @Qualifier("tmdb-api")
    public RequestInterceptor requestInterceptorTmdb(final ApplicationProperties properties) {
        return requestTemplate -> {

            requestTemplate.header(
                    HttpHeaders.AUTHORIZATION, String.format("Bearer %s", properties.getTmdb().getApiToken()));

            requestTemplate.header("accept", "application/json");

        };
    }

    @Bean
    @Qualifier("trakt-api")
    public RequestInterceptor requestInterceptorTrakt(final ApplicationProperties properties) {
        return requestTemplate -> {

            requestTemplate.header(
                    HttpHeaders.CONTENT_TYPE, "application/json");
            requestTemplate.header(
                    "trakt-api-key", properties.getTrakt().getClientId());
            requestTemplate.header(
                    "trakt-api-version", "2");

        };
    }
}
