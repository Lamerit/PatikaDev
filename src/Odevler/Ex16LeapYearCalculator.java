package Odevler;

import java.util.Scanner;

public class Ex16LeapYearCalculator {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Yılı Giriniz: ");
        int year = scan.nextInt();

        if ((year % 4 == 0 && year % 100 != 0) || year % 400 == 0) {
            System.out.println(year + " Yılı Artık Bir Yıldır.");
        } else {
            System.out.println(year + " Yılı Artık Bir Yıl Değildir.");
        }
        scan.close();
    }
}
