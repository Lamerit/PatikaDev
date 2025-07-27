package KareAlma;

import java.sql.SQLOutput;
import java.util.Scanner;

public class KareMain {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("Kenarı Giriniz: ");
        Kare kare=new Kare(scan.nextInt());
        System.out.println("Alan: " + kare.alan() + " Cevre: " + kare.cevre());
    }
}
