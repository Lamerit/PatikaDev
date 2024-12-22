package Odevler;

import java.util.Scanner;

public class Ex10PassExamClass {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        double mat,psychics, sports;
        System.out.println("Matematik Notunuz: ");
        mat= scan.nextDouble();
        System.out.println("Fizik Notunuz: ");
        psychics= scan.nextDouble();
        System.out.println("Spor Dersi Notunuz: ");
        sports= scan.nextDouble();
        double average= (mat+psychics+sports)/3;
        if (average>=50){
            System.out.println("Ortalamanız: " + average + " Geçtiniz Tebrikler!");
        }else {
            System.out.println("Sınıfta Kaldınız!.");
        }

    }
}
