package Odevler;

import java.util.Scanner;

public class Ex04TaxiMeter {
    public static void main(String[] args) {
        //Acilis ucreti 10tl, En dusuk odenecek tutar 20tl, Kmbasına 2.2tl
        Scanner scan = new Scanner(System.in);
        double perKM = 2.20, openingAmount = 10, total;
        System.out.print("======================================" +
                "\nKatedilen Mesafeyi Km Cinsinden giriniz: ");
        double km = scan.nextDouble();
        scan.close();
        total = (perKM * km) + openingAmount;
        total = (total < 20) ? 20 : total;
        System.out.format("Ödenecek tutar = %.2f\n======================================", total);

    }

}
