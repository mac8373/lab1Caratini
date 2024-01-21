/**
 * Project: lab1Caratini
 * Purpose Details: Main class for testing motorcycle class
 * Course: IST 242
 * Author: Maximo Caratini
 * Date Developed: 1/21/24
 * Last Date Changed: 1/21/24
 * Rev: 1.0
 */

public class Main {
    public static void main(String[] args) {

        Motorcycle bike1 = new Motorcycle("BMW", "S1000RR", 2022, "Red", 1.0);
        Motorcycle bike2 = new Motorcycle("Suzuki", "GSX-R1000", 2020, "Black", 1.0);
        Motorcycle bike3 = new Motorcycle("Suzuki", "Hayabusa", 2023, "Silver", 1.34);

        System.out.println("Before Updates:");
        bike1.printDetails();
        bike2.printDetails();
        bike3.printDetails();


        bike1.setBrand("BMW");
        bike2.setColor("Black");
        bike3.setEngineLiterSize(1.34);


        System.out.println("\nAfter Updates:");
        bike1.printDetails();
        bike2.printDetails();
        bike3.printDetails();
    }
}
