package Odevler;

import java.util.Scanner;

public class Ex10PassExamClass {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int mat,psychics, sports;
        System.out.println("Matematik Notunuz: ");
        mat= scan.nextInt();
        System.out.println("Fizik Notunuz: ");
        psychics= scan.nextInt();
        System.out.println("Spor Dersi Notunuz: ");
        sports= scan.nextInt();
        double average= (mat+psychics+sports)/3;
        if (average>=50){
            System.out.println("Geçtiniz Tebrikler!");
        }else {
            System.out.println("Sınıfta Kaldınız!.");
        }

    }
}
