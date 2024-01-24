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

        //Create instances for motorcycle 1
        Make make1 = new Make("BMW");
        Model model1 = new Model("S1000RR");
        Year year1 = new Year(2022);
        Color color1 = new Color("Red");
        Engine engine1 = new Engine(1.0);

        Motorcycle bike1 = new Motorcycle(make1, model1, year1, color1, engine1);

        //Create instances for motorcycle 2
        Make make2 = new Make("Suzuki");
        Model model2 = new Model("GSX-R1000");
        Year year2 = new Year(2020);
        Color color2 = new Color("Black");
        Engine engine2 = new Engine(1.0);

        Motorcycle bike2 = new Motorcycle(make2, model2, year2, color2, engine2);

        //Create instances for motorcycle 3
        Make make3 = new Make("Suzuki");
        Model model3 = new Model("Hayabusa");
        Year year3 = new Year(2021);
        Color color3 = new Color("Silver");
        Engine engine3 = new Engine(1.4);

        Motorcycle bike3 = new Motorcycle(make3, model3, year3, color3, engine3);

        //Print details for all 3 motorcycles
        System.out.println("Before Updates:");
        bike1.printDetails();
        bike2.printDetails();
        bike3.printDetails();

    }
}
