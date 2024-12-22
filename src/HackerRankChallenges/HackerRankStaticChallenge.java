package HackerRankChallenges;

import java.util.Scanner;
/*Ödev: Dikdörtgenin Alanı ve Çevresi
Bir dikdörtgenin uzunluğu ve genişliği verildiğinde, bu dikdörtgenin alanını
ve çevresini hesaplayan bir Java programı yazın.
Alan = Uzunluk × Genişlik
Çevre = 2 × (Uzunluk + Genişlik)*/

public class HackerRankStaticChallenge {
    static int uzunluk;
    static int genislik;

    static {
        Scanner scan = new Scanner(System.in);
        try {
            System.out.print("Uzunluğu gir: ");
            uzunluk = scan.nextInt();
            System.out.print("Genişliği gir: ");
            genislik = scan.nextInt();
            if (uzunluk <= 0 || genislik <= 0) {
                System.out.println("java.lang.Exception: Length and width must be positive");
            }
        } catch (Exception e) {
            System.out.println(e);
        }
    }

    public static void main(String[] args) {
        if (uzunluk > 0 && genislik > 0) {
            int cevre = 2 * (uzunluk + genislik);
            int alan = uzunluk * genislik;
            System.out.println("Çevre = " + cevre);
            System.out.println("Alan = " + alan);

        }
    }
}




