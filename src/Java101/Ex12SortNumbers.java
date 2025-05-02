package Java101;

import java.util.Scanner;

public class Ex12SortNumbers {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Birinci sayıyı giriniz:");
        int sayi1 = scan.nextInt();

        System.out.println("İkinci sayıyı giriniz:");
        int sayi2 = scan.nextInt();

        System.out.println("Üçüncü sayıyı giriniz:");
        int sayi3 = scan.nextInt();

        // Sıralama için if-else blokları
        if (sayi1 >= sayi2 && sayi1 >= sayi3) {
            if (sayi2 >= sayi3) {
                System.out.println("Büyükten küçüğe: " + sayi1 + " > " + sayi2 + " > " + sayi3);
            } else {
                System.out.println("Büyükten küçüğe: " + sayi1 + " > " + sayi3 + " > " + sayi2);
            }
        } else if (sayi2 >= sayi1 && sayi2 >= sayi3) {
            if (sayi1 >= sayi3) {
                System.out.println("Büyükten küçüğe: " + sayi2 + " > " + sayi1 + " > " + sayi3);
            } else {
                System.out.println("Büyükten küçüğe: " + sayi2 + " > " + sayi3 + " > " + sayi1);
            }
        } else {
            if (sayi1 >= sayi2) {
                System.out.println("Büyükten küçüğe: " + sayi3 + " > " + sayi1 + " > " + sayi2);
            } else {
                System.out.println("Büyükten küçüğe: " + sayi3 + " > " + sayi2 + " > " + sayi1);
            }
        }
    }
}
