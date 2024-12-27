package Odevler;

import java.util.Scanner;

public class Ex19_4ve5inKuvvetleri {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("-------------------");
        System.out.println("Bir sayı giriniz: ");
        int girilenSayi=scan.nextInt();
        System.out.println("-------------------" + "\n4'ün Katları: ");
        for (int i =1; i <=girilenSayi ; i*=4) {
            System.out.print(i + " ");
        }
        System.out.println("\n-------------------" + "\n5'in Katları: ");
        for (int i =1; i <=girilenSayi ; i*=5) {
            System.out.print(i + " ");
        }
        System.out.println("\n-------------------");
        scan.close();
    }
}
