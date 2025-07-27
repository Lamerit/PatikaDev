package Metods;

public class Recursive02Asal {
    public static boolean isPrime(int number, int divisor) {
        // 1 ve negatif sayılar asal değil
        if (number <= 1) {
            return false;
        }

        // Eğer bölen sayıya ulaştıysak asal
        if (divisor == number) {
            return true;
        }

        // Eğer tam bölünüyorsa asal değil
        if (number % divisor == 0) {
            return false;
        }

        // Bir sonraki böleni dene
        return isPrime(number, divisor + 1);
    }

    public static void main(String[] args) {
        System.out.println(isPrime(7, 2)); // true
        System.out.println(isPrime(10, 2)); // false
    }
}