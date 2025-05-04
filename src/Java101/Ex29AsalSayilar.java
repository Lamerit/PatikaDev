package Java101;

public class Ex29AsalSayilar {
    public static void main(String[] args) {
        boolean asal;
        for (int sayi = 2; sayi <=100 ; sayi++) {
            asal=true;
            for (int i = 2; i <sayi ; i++) {
                if (sayi%i==0){
                    asal=false;
                    break;
                }
            }if (asal){
                System.out.print(sayi + " ");
            }
        }
    }
}