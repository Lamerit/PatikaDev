package Odevler;

import java.util.Scanner;

public class Ex03UcgenAlanHesaplama {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Üçgenin Dik Kenarını Giriniz: ");
        double dikKenar= scan.nextInt();
        System.out.print("Taban Kenarı Giriniz: ");
        double tabanKenar=scan.nextInt();
        System.out.println("Üçgenin Alanı: " + (dikKenar*tabanKenar/2));
        scan.close();
    }
}
