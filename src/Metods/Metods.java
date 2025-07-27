package Metods;

public class Metods {
    public static int topla(int a, int b){
        return a+b;
    }
    public static int kare(int a){
        return a*a;
    }
    public static void selamver(){
        System.out.println("Merhaba");
    }
    public static void  selamver(String isim){
        System.out.println("Merhaba" + " " + isim);
    }
    public static void main(String[] args) {
        System.out.println(topla(5,5));
        selamver();
        selamver("Hamza");
        System.out.println(kare(5));
    }
}
