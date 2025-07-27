package OOP;

public class Kisi {
    //Fields
    private String isim, soyİsim;

    private int yas;
    //Constructor
    public Kisi(String isim, String soyİsim, int yas){
        this.isim=isim;
        this.soyİsim=soyİsim;
        this.yas=yas;
    }
    public void bilgiYazdir(){
        System.out.println("İsim: " + isim + ", Soy İsim: " + soyİsim + ", Yaş: " + yas);
    }
}
