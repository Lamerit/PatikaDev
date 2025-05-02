package Odevler;

import java.util.Scanner;

public class Ex24ATM {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String username, password;
        int right=3;
        int balance=1500;
        int select;
        while(right>0) {
            System.out.println("Kullanıcı Adınız");
            username = scan.nextLine();
            System.out.println("Parolanız:");
            password = scan.nextLine();
            if (username.equals("patika") && password.equals("dev123")){
                System.out.println("Giriş Başarılı.Patika Bankasına Hoşgeldiniz.");
                do {
                    System.out.println("Lütfen yapmak istediğiniz işlemi seçiniz.");
                    System.out.println
                            (
                                    "1.Para Yatırma\n" +
                                            "2.Para Çekme\n" +
                                            "3.Bakiye Sorgulama\n" +
                                            "4.Çıkış Yap"
                            );
                    select= scan.nextInt();
                    if (select==1){
                        System.out.println("Güncel Bakiyeniz: " + balance);
                        System.out.print("Yatırılacak Para Miktarı: ");
                        int price=scan.nextInt();
                        balance+=price;
                        System.out.print("Güncel Bakiyeniz: " + balance);
                    }else if(select==2){
                        System.out.println("Çekilecek Para Miktarı: ");
                        int price= scan.nextInt();
                        if (price>balance){
                            System.out.println("Bakiye Yetersiz");
                        }else {
                            balance -= price;
                            System.out.println("Güncel Bakiyeniz: " + balance + "\n");
                        }
                    }
                }while (select!=4);
                System.out.println("Tekrar Görüşmek Üzere");
                break;
            }else{
                System.out.println("Hatalı Kullanıcı Adı veya Şifre!");
                right--;
                System.out.println("Kalan deneme: " + right);
            }if (right==0){
                System.out.println("Hesabınız Bloke Olmuştur. Lütfen Bankanız İle İletişime Geçiniz");
            }
        }
    }
}
