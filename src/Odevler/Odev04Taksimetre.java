package Odevler;

import java.util.Scanner;

public class Odev04Taksimetre {
    public static void main(String[] args) {
        //Acılıs ücreti 10tl, km başına 2.20 tl, minimum odenecek tutar 20tl
        Scanner scan = new Scanner(System.in);
        double acilis = 10, km = 2.20, toplam, girilenKm;
        System.out.print("Gidilen Mesafeyi giriniz: ");
        girilenKm = scan.nextDouble();
        scan.close();
        toplam = acilis + km * girilenKm;
        toplam=(toplam<20)?20:toplam;
        System.out.format("Toplam Tutar: %.2f TL\n", toplam);

    }

}
