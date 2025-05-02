package Java101;

import java.util.Scanner;

public class Ex08Calculator {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("2 sayı girin: ");
        int n1 = scan.nextInt(), n2 = scan.nextInt();
        int secim;
        System.out.println("Yapmak istediğiniz işlemi seçin" +
                "\n1.Toplama\n2.Çıkarma\n3.Bölme\n4.Çarpma");
        secim= scan.nextInt();
        switch (secim) {
            case 1:
                System.out.println("Toplam= " + (n1 + n2));
                break;
            case 2:
                System.out.println("Çıkarma= " + (n1 - n2));
                break;
            case 3:
                System.out.println("Bölme= " + (n1 / n2));
                break;
            case 4:
                System.out.println("Çarpım= " + (n1 * n2));
                break;
        }
        scan.close();
    }
}
