package Java101;

import java.util.Scanner;

public class Ex28TersUcgen {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Basamak Sayısını Giriniz:");
        int basamakSayisi = scan.nextInt();
        for (int i = basamakSayisi; i >0; i--) {//girilen basamak sayısı kadar bu döngü çalışşsın
            for (int j = 0; j <2*i-1 ; j++) {//girilen basamak sayısı x2-1 bu döngü çalışşsın. yıldız koysun
                System.out.print("*");
            }
            System.out.println();//diğer satıra geçsin
            }
        }
    }