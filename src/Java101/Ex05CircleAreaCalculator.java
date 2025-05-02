package Java101;

import java.util.Scanner;

public class Ex05CircleAreaCalculator {
    public static void main(String[] args) {
        //r is Radius
        //Circle Area Formula is : π * r * r
        //Circle Perimeter Formula is : 2 * π * r
        Scanner scan= new Scanner(System.in);
        System.out.print("Please input radius : ");
        double r= scan.nextDouble();
        double area=3.14*(r*r);
        double perimeter=2*(3.14*r);
        System.out.printf("Area Of The Circle = %.2f\nPerimeter Of The Circle = %.2f", area,perimeter);
    scan.close();
    }
}
