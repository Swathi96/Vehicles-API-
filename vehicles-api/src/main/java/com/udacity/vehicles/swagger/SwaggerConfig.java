package com.udacity.vehicles.swagger;
import java.util.Collections;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.service.Contact;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;



@Configuration
@EnableSwagger2
public class SwaggerConfig {
    @Bean
    public Docket api() {
        return new Docket(DocumentationType.SWAGGER_2)
                .select()
                .apis(RequestHandlerSelectors.any())
                .paths(PathSelectors.any())
                .build()
                .useDefaultResponseMessages(false);
    }

    private ApiInfo apiInfo() {
        return new ApiInfo(
                "Vehicle API",
                "This API information documents CRUD operation for vehicles.",
                "1.0",
                "https://github.com/Swathi96/Vehicles-API-",
                new Contact("Swathi Sheshadri", "https://github.com/Swathi96/Vehicles-API-", "swathisheshadri1996@gmail.com"),
                "License of API", "https://github.com/Swathi96/Vehicles-API-", Collections.emptyList());
    }

}
