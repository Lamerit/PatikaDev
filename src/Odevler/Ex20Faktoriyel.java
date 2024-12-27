package Odevler;

import java.util.Scanner;

public class Ex20Faktoriyel {
    //N elemanlı bir kümenin elemanları ile oluşturulacak r elemanlı
    // farklı grupların sayısı n’in r’li kombinasyonu olarak adlandırılır.
    // N’in r’li kombinasyonu C(n,r) şeklinde gösterilir.
    //Java ile kombinasyon hesaplayan program yazınız.
    //Kombinasyon formülü C(n,r) = n! / (r! * (n-r)!)
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Kümenin eleman sayısını (n) giriniz: ");
        int n = scan.nextInt();
        System.out.print("Seçilecek eleman sayısını (r) giriniz: ");
        int r = scan.nextInt();
        int facN = 1;
        int facR = 1;
        int j=n-r;
        int facJ=1;
        for (int i = j; i >= 1; i--) {
            facJ = facJ * i;
        }
        for (int i = n; i >= 1; i--) {
            facN = facN * i;
        }
        for (int i = r; i >= 1; i--) {
            facR = facR * i;
        }
        int comb=facN/(facR*(facJ));
        System.out.println("Kombinasyon= " +comb);

        scan.close();
    }
}
