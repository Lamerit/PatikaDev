package Odevler;

import java.util.Scanner;

public class Ex14FlyTicketCalculator {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Katedilecek Mesafeyi Km Cinsinden Giriniz: ");
        double km = scan.nextDouble();
        System.out.print("Yaşınızı Giriniz: ");
        int age = scan.nextInt();
        System.out.println("Yolculuk Şekli:\n1. Tek Yön\n2. Gidiş-Dönüş");
        int tripType = scan.nextInt();
        double perKm = 0.10;
        double totalPrice = perKm * km;
        if (km <= 0 || age <= 0 || (tripType != 1 && tripType != 2)) {
            System.out.println("Hatalı Veri Girdiniz!");
            return;
        }
        if (age < 12) {
            totalPrice *= 0.5; // yarısı ile çarpınca yarısı gider
        } else if (age >= 12 && age <= 24) {
            totalPrice *= 0.9; // 0.9 ile çarpınca 1 ile çarpılmadığı için yüzde 10 u azalır otomatikmen
        } else if (age > 65) {
            totalPrice *= 0.7; // yüzde yetmişi yüzde 30 indirilmiş halidir.
        }

        if (tripType == 2) {
            totalPrice *= 0.8; //
            totalPrice *= 2;   // Gidiş-dönüş fiyatı 2 katı ile çarpılı iki bilet olduğu için
        }

        System.out.println("Toplam Bilet Fiyatı: " + totalPrice + " TL");
    }
}
