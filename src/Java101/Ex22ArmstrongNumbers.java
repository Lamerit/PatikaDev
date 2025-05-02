package Java101;

import java.util.Scanner;

public class Ex22ArmstrongNumbers {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Sayı Giriniz :");
        int girilenSayi = scan.nextInt(); // Kullanıcıdan sayı al
        int basamakSayisi = 0; // Basamak sayısını tutan değişken
        int geciciSayi = girilenSayi; // Sayıyı geçici olarak saklamak
        int basamakTabani; // Her bir basamağın değerini tutacak değişken
        int basamakTabanSonuc; // Basamak tabanı üssünün çarpımını tutan değişken
        int toplam = 0; // Armstrong kontrolü için basamak üsleri toplamı

        // Basamak sayısını bulma
        while (geciciSayi != 0) {
            geciciSayi = geciciSayi / 10;
            basamakSayisi++;
        }
        geciciSayi = girilenSayi; // Sayıyı tekrar başa al

        // Her bir basamağı işleme
        while (geciciSayi != 0) {
            basamakTabani = geciciSayi % 10; // Son basamağı al
            // Basamak üssü hesaplama
            basamakTabanSonuc = 1; // Çarpım için 1 ile başlat
            for (int i = 0; i < basamakSayisi; i++) { // Basamak sayısı kadar üs al
                basamakTabanSonuc *= basamakTabani;
            }
            System.out.println("Basamak üssü sonucu: " + basamakTabani + "^" + basamakSayisi+ "=" + basamakTabanSonuc);

            // Toplama ekle
            toplam += basamakTabanSonuc;

            // Sayıyı bir basamak düşür
            geciciSayi = geciciSayi / 10;
        }

        // Sonuç kontrolü
        if (toplam == girilenSayi) {
            System.out.println(girilenSayi + " sayısı bir Armstrong sayıdır.");
        } else {
            System.out.println(girilenSayi + " sayısı bir Armstrong sayısı değildir.");
        }

        scan.close();
    }
}
