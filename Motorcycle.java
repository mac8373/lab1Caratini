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
    // Characteristics of Motorcycle
    private final Make make;
    private final Model model;

    private final Year year;

    private final Color color;
    private final Engine engine;

    /**
     * Constructor for creating a Motorcycle.
     *
     * @param make The make of the motorcycle.
     * @param model The model of the motorcycle.
     * @param year The year of the motorcycle.
     * @param color The color of the motorcycle.
     * @param engine The engine liter size of the motorcycle.
     */

    public Motorcycle(Make make, Model model, Year year, Color color, Engine engine) {
        this.make = make;
        this.model = model;
        this.year = year;
        this.color = color;
        this.engine = engine;
    }
    // Getter methods

    /**
     * Print characteristics of motorcycle.
     */

    public void printDetails() {
        System.out.println("Make: " + make.getMake());
        System.out.println("Model: " + model.getModel());
        System.out.println("Year: " + year.getYear());
        System.out.println("Color: " + color.getColor());
        System.out.println("Engine Liter Size: " + engine.getEngineLiterSize());
    }
}
