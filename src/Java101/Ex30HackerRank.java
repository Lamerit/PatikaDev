package Java101;
import java.util.Scanner;

public class Ex30HackerRank {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // 1. Kaç sorgu var?
        System.out.println("Sorgu Sayısını Giriniz: ");
        int q = scanner.nextInt();

        // 2. Her sorgu için a, b, n oku ve seriyi yazdır
        for (int i = 0; i < q; i++) {
            int a = scanner.nextInt();
            int b = scanner.nextInt();
            int n = scanner.nextInt();

            int toplam = a;  // Sj-1’i saklayacak (başlangıçta a)
            for (int j = 0; j < n; j++) {
                // b·2^j kısmını ekle
                toplam += b * (1 << j);
                System.out.print(toplam + " ");
            }

            System.out.println();  // bir sonraki sorgu için alt satıra geç
        }

        scanner.close();
    }
}
