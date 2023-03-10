package it.develhope.Swagger02.configurations;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.service.Contact;
import springfox.documentation.service.Tag;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;

import java.util.Collections;

/**
 * @author Drumstyle92
 * Class that contains the configuration needed for Spring Fox
 */
@Configuration
public class SpringFoxConfig {
    /**
     * @return Returns a Bean containing all the features of the Swagger interface
     * Method that allows you to define and modify the Swagger
     */
    @Bean
    public Docket api() {

        ApiInfo apiInfo = new ApiInfo(
                "Math Api",
                "An API that provides services ",
                "2.0.0",
                "https://en.wikipedia.org/wiki/MIT_License",
                new Contact("Dino", "https://develhope.it", "dino@develhope.it"),
                "MIT",
                "https://en.wikipedia.org/wiki/MIT_License",
                Collections.emptyList()
        );

        return new Docket(DocumentationType.SWAGGER_2)
                .select()
                .apis(RequestHandlerSelectors.any())
                .paths(PathSelectors.any())
                .build().apiInfo(apiInfo)
                .tags(
                        new Tag("default-controller", "The main initial controller for all the API features"),
                        new Tag("math-controller", "Controller dedicated just to API > math operations")
                );
    }

}

