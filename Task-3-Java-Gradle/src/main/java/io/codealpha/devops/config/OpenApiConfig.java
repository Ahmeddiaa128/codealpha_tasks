package io.codealpha.devops.config;

import io.swagger.v3.oas.models.OpenAPI;
import io.swagger.v3.oas.models.info.Info;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class OpenApiConfig {

    @Bean
    public OpenAPI customOpenAPI() {

        return new OpenAPI()
                .info(
                        new Info()
                                .title("CodeAlpha DevOps Showcase API")
                                .description("Spring Boot REST API developed for CodeAlpha DevOps Internship Task 3")
                                .version("1.0.0")
                );
    }
}
