/**
 * Project: lab1Caratini
 * Purpose Details: Creating a motorcycle
 * Course: IST 242
 * Author: Maximo Caratini
 * Date Developed: 1/21/24
 * Last Date Changed: 1/21/24
 * Rev: 1.0
 */


public class Motorcycle {
    /**
     * Brand of motorcycle.
     */
    private String brand;
    /**
     * Model of motorcycle.
     */
    private String model;
    /**
     * Motorcycles year of manufacture.
     */
    private int year;
    /**
     * Color of motorcycle.
     */
    private String color;
    /**
     * Engine liter size of motorcycle.
     */
    private double engineLiterSize;

    /**
     * Constructor for creating a Motorcycle.
     *
     * @param brand The brand of the motorcycle.
     * @param model The model of the motorcycle.
     * @param year The year of the motorcycle.
     * @param color The color of the motorcycle.
     * @param engineLiterSize The engine liter size of the motorcycle.
     */

    public Motorcycle(String brand, String model, int year, String color, double engineLiterSize) {
        this.brand = brand;
        this.model = model;
        this.year = year;
        this.color = color;
        this.engineLiterSize = engineLiterSize;
    }

    /**
     * Get the brand of motorcycle.
     *
     * @return The brand of motorcycle.
     */
    public String getBrand() {
        return brand;
    }

    /**
     * Get the model of motorcycle.
     *
     * @return The model of motorcycle.
     */
    public String getModel() {
        return model;
    }

    /**
     * Get manufacturing year of motorcycle.
     *
     * @return The manufacturing year of motorcycle
     */
    public int getYear() {
        return year;
    }

    /**
     * Get color of motorcycle.
     *
     * @return The color of motorcyle.
     */
    public String getColor() {
        return color;
    }

    /**
     * Get engine liter size of motorcycle.
     *
     * @return Engine liter size of motorcycle.
     */
    public double getEngineLiterSize() {
        return engineLiterSize;
    }

    /**
     * Set engine liter size of motorcycle.
     *
     * @param engineLiterSize The engine liter size to set.
     */
    public void setEngineLiterSize(double engineLiterSize) {
        this.engineLiterSize = engineLiterSize;
    }

    /**
     * Set brand of motorcycle.
     *
     * @param brand The brand to set.
     */
    public void setBrand(String brand) {
        this.brand = brand;
    }

    /**
     * Set color of motorcycle.
     *
     * @param color The color to set.
     */
    public void setColor(String color) {
        this.color = color;
    }

    /**
     * Print the details of the motorcycle.
     */
    public void printDetails() {
        System.out.println("Brand: " + brand);
        System.out.println("Model: " + model);
        System.out.println("Year: " + year);
        System.out.println("Color: " + color);
        System.out.println("Engine Liter Size: " + engineLiterSize);
    }
}
