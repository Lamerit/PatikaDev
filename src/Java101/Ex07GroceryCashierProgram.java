package Java101;

import java.util.Scanner;

public class Ex07GroceryCashierProgram {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        double pear = 2.14, apple = 3.67, tomato = 1.11, banana = 0.95, eggplant = 5.00;
        double weight, total = 0;
        System.out.print("Pear Kg: ");
        weight = scan.nextDouble();
        total += weight * pear;
        System.out.print("Apple Kg: ");
        weight = scan.nextDouble();
        total += weight * apple;
        System.out.print("Tomato Kg: ");
        weight = scan.nextDouble();
        total += weight * tomato;
        System.out.print("Banana Kg: ");
        weight = scan.nextDouble();
        total += weight * banana;
        System.out.print("Eggplant Kg: ");
        weight = scan.nextDouble();
        total += weight * eggplant;
        System.out.println("Total Price= " + total);

        //2nd solution using arrays and for loop
        String[] products = {"pear", "apple", "tomato", "banana", "eggplant" };
        double[] prices = {2.14, 3.67, 1.11, 0.95, 5.00};
        double totalPrice = 0;
        for (int i = 0; i < products.length; i++) {
            System.out.print(products[i] + "Kg: ");
            weight = scan.nextDouble();
            totalPrice += weight * prices[i];
        }
        System.out.println(totalPrice);
scan.close();
    }
}
