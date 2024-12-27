package Odevler;

import java.util.Scanner;

public class Ex173ve4 {
    //0'dan girilen sayıya kadar olan sayılardan 3 ve 4'e tam bölünen sayıların ortalamasını hesaplayan programı yazınız.

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Bir sayı giriniz: ");
        int girilenSayi = scan.nextInt();
        int sayac = 0;
        int ortalama=0;
        int toplam=0;
        System.out.print("0'dan Girdiğiniz Sayıya Kadar 3 ve 4'e tam bölünenler: ");
        for (int i = 1; i <= girilenSayi; i++) {
            if (i % 3 == 0 && i % 4 == 0) {
                System.out.print(i + " ");
                sayac++;
                toplam+=i;
                ortalama = toplam / sayac;
            }
        }
        System.out.println("Girdiğiniz Sayıların Ortalaması=  " + ortalama);

        scan.close();
    }
}