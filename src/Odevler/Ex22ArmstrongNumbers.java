package Odevler;

import java.util.Scanner;

public class Ex22ArmstrongNumbers {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Sayı Giriniz :");
        int sayi = scan.nextInt();
        int basamakSayisi = 0;
        int geciciSayi = sayi;
        int basamaktakiDeger;
        int armstrongSonuc = 0;
        int basamakGucu;

        // Basamak sayıs
        while (geciciSayi != 0) {
            geciciSayi /= 10;
            basamakSayisi++;
        }

        // Armstrong
        geciciSayi = sayi;
        while (geciciSayi != 0) {
            basamaktakiDeger = geciciSayi % 10;
            // Basamağın üssünü hesaplama
            basamakGucu = 1;
            for (int i = 1; i <= basamakSayisi; i++) {
                basamakGucu *= basamaktakiDeger;
            }
            armstrongSonuc += basamakGucu;
            geciciSayi /= 10;
        }
        //sonuc
        if (armstrongSonuc == sayi) {
            System.out.println(sayi + " sayısı bir Armstrong sayıdır.");
        } else {
            System.out.println(sayi + " sayısı bir Armstrong sayısı değildir.");
        }

        scan.close();
    }
}
