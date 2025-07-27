package OOP;


public class Araba {
    //Özellikler (Fields)
    String marka, model;
    int hiz;

    //Constructor
    public Araba(String marka, String model, int hiz) {
        this.marka = marka;
        this.model = model;
        this.hiz=hiz;
    }

    public void bilgileriYazdir() {
        System.out.println("Marka: " + marka + ", Model: " + model + ", Hız:" + hiz);

    }

    public void hizlan(int artis) {
        hiz += artis;
        System.out.println("Yeni Hız: " + hiz);
    }
}