package TryCathExercise;

import java.util.Scanner;

public class TryAndCath {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        try {
            System.out.print("Bölünmesini istediğiniz sayıyı girin: ");
            double bolunen = scan.nextDouble();
            System.out.print("Bölen: ");
            double bolen = scan.nextDouble();
            System.out.println("Sonuç= " + bolunen + "/" + bolen + "= " + (bolunen/bolen) );
        } catch (ArithmeticException e) {
            System.out.println("Yanlış giriş yaptınız!" + e.getMessage());
        } catch (Exception e) {
            System.out.println("Bir hata oluştu " + e.getMessage());
        } finally {
            System.out.println("Programı kullandığınız için teşekkürler.");
        }
    }
}
