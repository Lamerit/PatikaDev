package Odevler;

import java.util.Scanner;

public class Ex18TekCift {
    public static void main(String[] args) {
//Java döngüler ile tek bir sayı girilene kadar kullanıcıdan girişleri kabul eden
// ve girilen değerlerden çift ve 4'ün katları olan sayıları toplayıp
// ekrana basan programı yazıyoruz.
        Scanner scan = new Scanner(System.in);
        int toplam = 0;
        int girilenSayi;
        do {
            System.out.println("Sayı giriniz: ");
            girilenSayi = scan.nextInt();
            if (girilenSayi % 2 == 0 && girilenSayi % 4 == 0) {
                toplam+=girilenSayi;
            }
        } while (girilenSayi % 2 == 0);

        System.out.print("Toplam= " + toplam);
    }

}
