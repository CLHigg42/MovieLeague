package com.movieleague.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import io.swagger.v3.oas.models.Components;
import io.swagger.v3.oas.models.OpenAPI;
import io.swagger.v3.oas.models.info.Info;

@Configuration
public class OpenApiConfig {
    @Bean
    public OpenAPI movieLeagueOpenAPI() {
        return new OpenAPI()
                .components(new Components())
                .info(new Info().title("Movie League API").version("0.1.0").description("API for Movie League application"));
    }
}
