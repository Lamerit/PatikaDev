package Odevler;

import java.util.Scanner;

public class Odev02KDVHesaplama {
    public static void main(String[] args) {
        //para değeri al
        Scanner scan = new Scanner(System.in);
        System.out.println("KDV'si hesaplanacak tutarı giriniz: ");
        double girilenTutar = scan.nextInt();
        //kdv'yi %18 olarak belirle
        double kDVOrani = 18;
        double kDVliFiyat = (girilenTutar) + (girilenTutar*kDVOrani/100);
        double kDVTutari = girilenTutar * kDVOrani/100;
        System.out.println("KDV'siz Tutar= " + girilenTutar +
                "\nKDV'li Tutar= " + kDVliFiyat +
                "\nKDV Tutarı= " + kDVTutari);

    }
}
