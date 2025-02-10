package com.assessment.grad001.RixongoteloBaloyi.waste_sorting_api.config;

import io.swagger.v3.oas.models.OpenAPI;
import io.swagger.v3.oas.models.info.Info;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class SwaggerConfig {
    @Bean
    public OpenAPI customOpenAPI() {
        return new OpenAPI()
                .info(new Info()
                        .title("Waste-Sorting-Api")
                        .description("API documentation Waste-Sorting-Api")
                        .version("1.0"));
    }
}

