package Java101;

import java.util.Scanner;

public class Ex28TersUcgen {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Basamak Sayısını Giriniz:");
        int basamakSayisi = scan.nextInt();
        for (int i = basamakSayisi; i >0; i--) {
            for (int j = 1; j <= 2 * i - 1; j++) {
                System.out.print("*");
            }System.out.println();
        }

    }
}