package Encapsulation;

public class Kisi {
    private String isim;
    private String soyİsim;
    private int yas;

    public Kisi(String isim, String soyİsim, int yas){
        this.isim=isim;
        this.soyİsim=soyİsim;
        this.yas=yas;
    }


    public String getIsim() {
        return isim;
    }
    public String getSoyİsim() {
        return soyİsim;
    }
    public int getyas(){
        return yas;
    }
    public void setYas(int yas){
        if (yas>0){
           this.yas=yas;
        }else {
            System.out.println("Yaş Negatif Olamaz");
        }
    }
    public void bilgileriYazdir(){
        System.out.println("İsim Soy İsim: " + isim + " " + soyİsim + " Yaş: " + yas );
    }
}
