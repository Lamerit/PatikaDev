package Encapsulation;

public class KisiMain {
    public static void main(String[] args) {
        Kisi kisi = new Kisi("Hamza", "Ölgen", 28);
        kisi.bilgileriYazdir();
        kisi.setYas(-10);
        kisi.bilgileriYazdir();
    }
}