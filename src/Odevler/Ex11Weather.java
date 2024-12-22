package Odevler;

import java.util.Scanner;

public class Ex11Weather {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Sıcaklığı giriniz:");
        int heat = scan.nextInt();

        // Sıcaklık 5'ten küçükse kayak yapabilirsin
        if (heat < 5) {
            System.out.println("Kayak yapmayı tercih edebilirsiniz, hava biraz soğuk :)");
        }
        // Sıcaklık 5 ile 15 arasında ise sinemaya ya da pikniğe gidebilirsin
        else if (heat >= 5 && heat < 15) {
            System.out.println("Sinema veya Pikniğe gidebilirsin, hava " + heat + " derece");
        }
        // Sıcaklık 15 ile 25 arasında ise pikniğe gitmek güzel olabilir
        else if (heat >= 15 && heat <= 25) {
            System.out.println("Bu havada Pikniğe gitmek güzel olabilir");
        }
        // Sıcaklık 25'ten büyükse yüzmeye gidebilirsin
        else if (heat > 25) {
            System.out.println("Yüzmeye gidelim!");
        }
    }
}
