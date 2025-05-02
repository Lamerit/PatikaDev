package Java101;
import java.util.Scanner;
public class Ex23YıldızUcgen {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Basamak Sayısını Giriniz:");
        int n= scan.nextInt();
        for (int i = 1; i <=n ; i++) {
            for (int j = i; j <=n-1 ; j++) {
                System.out.print(" ");
            }
            for (int k = 1; k <=2*i-1; k++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
