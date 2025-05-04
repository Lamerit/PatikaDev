package Java101;

import java.util.Scanner;

public class Ex30Fibonacci {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Kaç elemanlı Fibonacci serisi istersiniz? ");
        int n = scanner.nextInt();
        int first = 0, second = 1, next;
        for (int i = 2; i < n; i++) {
            next = first + second;
            System.out.println(first + " + " + second + " = " + next);
            first = second;
            second = next;
        }
    }
}