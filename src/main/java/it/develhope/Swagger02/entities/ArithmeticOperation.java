package it.develhope.Swagger02.entities;

import io.swagger.annotations.ApiModelProperty;

/**
 * @author Drumstyle92
 * Entity class that contains the characteristics that a certain arithmetic operation can have.
 */
public class ArithmeticOperation {
    /**
     * Name of the arithmetic operation
     */
    @ApiModelProperty(value = "name of the arithmetic operation", example = "subtraction")
    private String name;
    /**
     * The minimum number allowed to test the arithmetic operation
     */
    @ApiModelProperty(value = "minimum number necessary to carry out the operations", example = "2")
    private int minNumberOfOperands;
    /**
     * Description of the arithmetic operation
     */
    @ApiModelProperty(value = "description of the operation", example = "minuend - subtrahend = difference or remainder")
    private String description;
    /**
     * The various properties of an arithmetic operation
     */
    @ApiModelProperty(value = "the list of properties of the operation", example = "{'Invariant'}")
    private String[] properties;

    /**
     * @param name Arithmetic operation name parameter
     * @param minNumberOfOperands Parameter of the minimum allowed number of the arithmetic operation
     * @param description Arithmetic operation description parameter
     * @param properties Parameter of the properties of the arithmetic operation
     * Constructor of the class to which it belongs
     */
    public ArithmeticOperation(String name, int minNumberOfOperands, String description, String[] properties) {
        this.name = name;
        this.minNumberOfOperands = minNumberOfOperands;
        this.description = description;
        this.properties = properties;
    }

    /**
     * @return
     * encapsulation method
     */
    public String getName() {
        return name;
    }

    /**
     * @param name
     * encapsulation method
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * @return
     * encapsulation method
     */
    public int getMinNumberOfOperands() {
        return minNumberOfOperands;
    }

    /**
     * @param minNumberOfOperands
     * encapsulation method
     */
    public void setMinNumberOfOperands(int minNumberOfOperands) {
        this.minNumberOfOperands = minNumberOfOperands;
    }

    /**
     * @return
     * encapsulation method
     */
    public String getDescription() {
        return description;
    }

    /**
     * @param description
     * encapsulation method
     */
    public void setDescription(String description) {
        this.description = description;
    }

    /**
     * @return
     * encapsulation method
     */
    public String[] getProperties() {
        return properties;
    }

    /**
     * @param properties
     * encapsulation method
     */
    public void setProperties(String[] properties) {
        this.properties = properties;
    }

}
