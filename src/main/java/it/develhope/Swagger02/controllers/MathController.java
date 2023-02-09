package it.develhope.Swagger02.controllers;

import io.swagger.annotations.ApiOperation;
import it.develhope.Swagger02.entities.ArithmeticOperation;
import org.springframework.web.bind.annotation.*;

/**
 * @author Drumstyle92
 * Controller class that encloses the API that responds to Requests,
 * generating Responses regarding arithmetic operations
 */
@RestController
@RequestMapping("/math")
public class MathController {
    /**
     * @return Returns a string with a greeting
     * Method that when used returns a welcome get to the reference url section
     */
    @GetMapping("")
    @ApiOperation(value = "greet", notes = "Welcome a user to the reference section")
    public String welcomeMathMsg(){

        return "Welcome to the mathematical operations section!";

    }

    /**
     * @return Returns an instance object of the ArithmeticOperation class with info about the division
     * Method that when used returns a get with info about the division
     */
    @GetMapping("/division-info")
    @ApiOperation(value = "Get information about division operation",
                  notes = "Returns a new ArithmeticOperation with all the details about division")
    public ArithmeticOperation getInfoDivision(){

        return new ArithmeticOperation("Division",2,
                "dividend : divisor = quotient , remainder", new String[]{"Invariant", "Distributive"});

    }

    /**
     * @param a First factor parameter
     * @param b Second factor parameter
     * @return Returns a product of two multiplied numbers
     * Method that when used invokes the get by multiplying two factors
     */
    @GetMapping("/moltiplication")
    @ApiOperation(value = "Calculate the multiplication of two numbers", notes = "Accepts two integer parameters and returns the result of their multiplication")
    public int getMoltiplication(@RequestParam int a, @RequestParam int b){

    return a * b;

    }

    /**
     * @param n Number parameter
     * @return Returns the square of the parameter
     * Method that once used returns a get with the square of the number inserted in the url
     */
    @GetMapping("/square/{n}")
    @ApiOperation(value = "Calculate the square of a given integer",
                  notes = "Accepts an integer as parameter and returns its square")
    public int getSquare(@PathVariable int n){

        return n * n;

    }


}
