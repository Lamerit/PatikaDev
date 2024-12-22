package Odevler;
import java.util.Scanner;

public class Ex06BodyMassIndexCalculator {
    public static void main(String[] args) {
        // Formula: bMI = weight / (height * height);
        Scanner scan = new Scanner(System.in);
        // get weight
        System.out.print("Please enter your Weight (kg): ");
        double weight = scan.nextDouble();

        // get height
        System.out.print("Please enter your Height (m): ");
        double height = scan.nextDouble();

        // calculate bmı
        double bMI = weight / (height * height);

        // show BMI result
        System.out.printf("Your Body Mass Index is: %.2f\n", bMI);

        // BMI conclusion
        if (bMI < 18.5) {
            System.out.println("You are underweight.");
        } else if (bMI < 24.9) {
            System.out.println("You have a normal weight.");
        } else if (bMI < 29.9) {
            System.out.println("You are overweight.");
        } else {
            System.out.println("You are obese.");
        }
    }
}
