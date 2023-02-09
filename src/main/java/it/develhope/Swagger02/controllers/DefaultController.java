package it.develhope.Swagger02.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author Drumstyle92
 * Default controller class
 */
@RestController
public class DefaultController {
    /**
     * @return Returns a welcome string
     * Get method that accepts the welcome user as the response
     */
    @GetMapping("/")
    public String getHello(){
        return "Welcome visitor!";
    }
}
