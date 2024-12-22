package Odevler;

import java.util.Scanner;


public class Oden01OrtHesaplama {


    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Matematik Dersi Notunuzu Giriniz: ");
        double matNot = scan.nextInt();
        System.out.println("Edebiyat Dersi Notunuzu Giriniz: ");
        double edNot = scan.nextDouble();
        System.out.println("Müzik Dersi Notunuzu Giriniz: ");
        double muzikNot = scan.nextDouble();
        System.out.println("Geometri Dersi Notunuzu Giriniz: ");
        double geoNot = scan.nextDouble();
        System.out.println("Resim Dersi Notunuzu Giriniz: ");
        double resimNot = scan.nextDouble();
        System.out.println("Bilgi Teknolojileri Dersi Notunuzu Giriniz: ");
        double bTNot = scan.nextDouble();
        double toplam = matNot + edNot + muzikNot + geoNot + resimNot + bTNot;
        double ortalama = toplam / 6;
        System.out.println("Matematik notunuz: " + matNot +
                "\nEdebiyat Notunuz: " + edNot +
                "\nMüzik Notunuz: " + muzikNot +
                "\nGeometri Notunuz: " + geoNot +
                "\nResim Notunuz: " + resimNot +
                "\nBilgi Teknojileri Notunuz: " + bTNot +
                "\nOrtalamanız: " + ortalama);

scan.close();
    }
}
