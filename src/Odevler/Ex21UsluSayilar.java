package Odevler;
import java.util.Scanner;

public class Ex21UsluSayilar {
    public static void main(String[] args) {
        //Kullanıcıdan 2 değer al ve hesaplat
        Scanner scan=new Scanner(System.in);
        System.out.print("Sayı giriniz: ");
        int sayi=scan.nextInt();
        System.out.print("Üs giriniz: ");
        int us= scan.nextInt();
        int toplam=1;
        for (int i = 1; i <=us ; i++) {
            toplam=sayi*toplam;
        }System.out.println(toplam);
        scan.close();
    }
}
