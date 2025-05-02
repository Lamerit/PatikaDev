package Java101;

import java.util.Scanner;

public class Ex25EbobEkok {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("1. Sayıyı Giriniz: ");
        int number1 = scan.nextInt();
        System.out.print("2.Sayıyı Giriniz: ");
        int number2 = scan.nextInt();
        int i = 1;
        int ebob = 1;
        while (i <= number1 && i <= number2) {
            if (number1 % i == 0 && number2 % i == 0) {
                ebob = i;
            }
            i++;
        }
        System.out.println("Ebob= " + ebob);
        int ekok = (number1*number2)/ebob;
        System.out.println("Ekok= " +ekok);
    }

}