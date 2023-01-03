package com.synchrony.user.onboarding.Config;


import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import springfox.documentation.builders.ApiInfoBuilder;
import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.builders.RequestParameterBuilder;
import springfox.documentation.schema.ScalarType;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.service.ParameterType;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

import java.util.Collections;

@Configuration
@EnableSwagger2
public class SwaggerConfig {
    ApiInfo apiInfo() {
        return new ApiInfoBuilder().title(" USer Onboard  Service")
                .description("APIs for CURD operations on Users")
                .version("1.0.0.-SNAPSHOT")
                .build();
    }

    @Bean
    public Docket api() {
        return
                new Docket(DocumentationType.SWAGGER_2)
                        .apiInfo(apiInfo())
                        .select()
                        .apis(RequestHandlerSelectors.basePackage("com.synchrony.user"))
                        .paths(PathSelectors.any())
                        .paths(PathSelectors.any())
                        .build();
    }
}