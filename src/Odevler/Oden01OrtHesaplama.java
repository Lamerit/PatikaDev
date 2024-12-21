package Odevler;

import java.util.Scanner;


public class Oden01OrtHesaplama {


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Matematik Dersi Notunuzu Giriniz: ");
        double matNot = sc.nextInt();
        System.out.println("Edebiyat Dersi Notunuzu Giriniz: ");
        double edNot = sc.nextDouble();
        System.out.println("Müzik Dersi Notunuzu Giriniz: ");
        double muzikNot = sc.nextDouble();
        System.out.println("Geometri Dersi Notunuzu Giriniz: ");
        double geoNot = sc.nextDouble();
        System.out.println("Resim Dersi Notunuzu Giriniz: ");
        double resimNot = sc.nextDouble();
        System.out.println("Bilgi Teknolojileri Dersi Notunuzu Giriniz: ");
        double bTNot = sc.nextDouble();
        double toplam = matNot + edNot + muzikNot + geoNot + resimNot + bTNot;
        double ortalama = toplam / 6;
        System.out.println("Matematik notunuz: " + matNot +
                "\nEdebiyat Notunuz: " + edNot +
                "\nMüzik Notunuz: " + muzikNot +
                "\nGeometri Notunuz: " + geoNot +
                "\nResim Notunuz: " + resimNot +
                "\nBilgi Teknojileri Notunuz: " + bTNot +
                "\nOrtalamanız: " + ortalama);


    }
}
