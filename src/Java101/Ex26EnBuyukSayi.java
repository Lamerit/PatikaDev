package Java101;

import java.util.Scanner;

public class Ex26EnBuyukSayi {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Kaç adet sayı gireceksiniz:");
        int sayiMiktari= scan.nextInt();
        int enBuyukSayi=0;
        int girilenSayi=0;
        for (int i = 1; i <=sayiMiktari ; i++) {
            System.out.println(i+". Sayıyı Giriniz: ");
            girilenSayi=scan.nextInt();
            if (girilenSayi>enBuyukSayi){
                enBuyukSayi=girilenSayi;
            }
        }
        System.out.print("En Büyük Sayı= "+girilenSayi);
    }
}
