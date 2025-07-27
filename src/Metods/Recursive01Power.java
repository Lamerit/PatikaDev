package Metods;

public class Recursive01Power {
    public static int üs(int sayi, int üs){
        if (üs ==0){
            return 1;
        }
        return sayi * üs(sayi, üs -1);
    }

    public static void main(String[] args) {
        System.out.println(üs(2,0));
    }
}