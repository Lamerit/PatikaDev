package Java101;

import java.util.Scanner;

public class Ex15ChinaZodiac {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Doğum Yılınızı Giriniz: ");
        int birthYear = scan.nextInt();
        int result = birthYear % 12;
        String horoscope = "";
        if (result == 0) {
            horoscope = "Maymun";
        } else if (result == 1) {
            horoscope = "Horoz";
        } else if (result == 2) {
            horoscope = "Köpek";
        } else if (result == 3) {
            horoscope = "Domuz";
        } else if (result == 4) {
            horoscope = "Fare";
        } else if (result == 5) {
            horoscope = "Öküz";
        } else if (result == 6) {
            horoscope = "Kaplan";
        } else if (result == 7) {
            horoscope = "Tavşan";
        } else if (result == 8) {
            horoscope = "Ejderha";
        } else if (result == 9) {
            horoscope = "Yılan";
        } else if (result == 10) {
            horoscope = "At";
        } else if (result == 11) {
            horoscope = "Koyun";
        }
        System.out.println("Çin Zodyağı Burcunuz: " + horoscope);
        scan.close();
    }
}
