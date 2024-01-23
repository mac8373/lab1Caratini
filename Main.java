/**
 * Project: lab1Caratini
 * Purpose Details: Main class for testing motorcycle objects
 * Course: IST 242
 * Author: Maximo Caratini
 * Date Developed: 1/21/24
 * Last Date Changed: 1/21/24
 * Rev: 1.0
 */

public class Main {
    public static void main(String[] args) {

        Make make = new Make("BMW");
        Model model = new Model("S1000RR");
        Year year = new Year(2022);
        Color color = new Color("Red");
        Engine engine = new Engine(1.0);

        Motorcycle bike = new Motorcycle(make, model, year, color, engine);
        bike.printDetails();
    }
}