package Metods;

import java.util.Scanner;

public class Calculator {
    public static void sum(Scanner scan) {
        int result = 0;
        int i = 1;
        while (true) {
            System.out.print(i + ". Sayıyı giriniz: " + "(Çıkmak İçin 0)" + "\n");
            int newNumber = scan.nextInt();
            i++;
            if (newNumber == 0) {
                break;
            }
            result += newNumber;
        }
        System.out.println("Toplam = " + result);
    }

    public static void minus(Scanner scan) {
        System.out.print("1. Sayıyı giriniz: ");
        int result = scan.nextInt(); // ilk sayı result olarak ayarlandı
        int i = 1;

        while (true) {
            System.out.print(i + ". Sayıyı giriniz (Çıkmak için 0): ");
            int newNumber = scan.nextInt();
            i++;
            if (newNumber == 0) {
                break;
            }

            result -= newNumber; // her yeni sayı çıkarılıyor
        }

        System.out.println("Çıkarma İşlemi Sonucu = " + result + "\n");
    }

    static void times(Scanner scan) {
        int number, result = 1, i = 1;

        while (true) {
            System.out.print(i++ + ". sayı :");
            number = scan.nextInt();

            if (number == 1)
                break;

            if (number == 0) {
                result = 0;
                break;
            }
            result *= number;
        }

        System.out.println("Sonuç : " + result);
    }

    static void divided(Scanner scan) {
        System.out.print("Kaç adet sayı gireceksiniz :");
        int counter = scan.nextInt();
        double number, result = 0.0;

        for (int i = 1; i <= counter; i++) {
            System.out.print(i + ". sayı :");
            number = scan.nextDouble();
            if (i != 1 && number == 0) {
                System.out.println("Böleni 0 giremezsiniz.");
                continue;
            }
            if (i == 1) {
                result = number;
                continue;
            }
            result /= number;
        }

        System.out.println("Sonuç : " + result);
    }

    static void power(Scanner scan) {
        System.out.print("Taban değeri giriniz :");
        int base = scan.nextInt();
        System.out.print("Üs değeri giriniz :");
        int exponent = scan.nextInt();
        int result = 1;

        for (int i = 1; i <= exponent; i++) {
            result *= base;
        }

        System.out.println("Sonuç : " + result);
    }

    static void factorial(Scanner scan) {
        System.out.print("Sayı giriniz :");
        int n = scan.nextInt();
        int result = 1;

        for (int i = 1; i <= n; i++) {
            result *= i;
        }

        System.out.println("Sonuç : " + result);
    }

    // MOD ALMA METODU
    static void mod(Scanner scan) {
        System.out.print("Mod alınacak sayıyı giriniz: ");
        int number = scan.nextInt();
        System.out.print("Mod değerini giriniz: ");
        int mod = scan.nextInt();

        int result = number % mod;
        System.out.println(number + " % " + mod + " = " + result);
    }

    // DİKDÖRTGEN ALAN VE ÇEVRE METODU
    static void rectangle(Scanner scan) {
        System.out.print("Dikdörtgenin uzun kenarını giriniz: ");
        int uzunKenar = scan.nextInt();
        System.out.print("Dikdörtgenin kısa kenarını giriniz: ");
        int kisaKenar = scan.nextInt();

        int alan = uzunKenar * kisaKenar;
        int cevre = 2 * (uzunKenar + kisaKenar);

        System.out.println("Dikdörtgen Alanı = " + alan);
        System.out.println("Dikdörtgen Çevresi = " + cevre);
    }

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        int select;
        String menu =
                "1- Toplama İşlemi\n"
                        + "2- Çıkarma İşlemi\n"
                        + "3- Çarpma İşlemi\n"
                        + "4- Bölme işlemi\n"
                        + "5- Üslü Sayı Hesaplama\n"
                        + "6- Faktoriyel Hesaplama\n"
                        + "7- Mod Alma\n"
                        + "8- Dikdörtgen Alan ve Çevre Hesabı\n"
                        + "0- Çıkış Yap";
        do {
            System.out.println(menu);
            System.out.print("Lütfen bir işlem seçiniz :");
            select = scan.nextInt();
            switch (select) {
                case 1:
                    sum(scan);
                    break;
                case 2:
                    minus(scan);
                    break;
                case 3:
                    times(scan);
                    break;
                case 4:
                    divided(scan);
                    break;
                case 5:
                    power(scan);
                    break;
                case 6:
                    factorial(scan);
                    break;
                case 7:
                    mod(scan);
                    break;
                case 8:
                    rectangle(scan);
                    break;
                case 0:
                    break;
                default:
                    System.out.println("Yanlış bir değer girdiniz, tekrar deneyiniz.");
            }
        } while (select != 0);
    }
}
