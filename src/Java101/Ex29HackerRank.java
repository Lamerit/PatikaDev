package Java101;

import java.util.Scanner;

public class Ex29HackerRank {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter a number:");
        int n = scan.nextInt();
        int result;
        for (int i = 1; i <= 10; i++) {
            result = n * i;
            System.out.println(n + "x" + i + "=" + result);
        }
    }
}
