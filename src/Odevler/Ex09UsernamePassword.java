package Odevler;

import java.util.Scanner;

public class Ex09UsernamePassword {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Kullanıcı adınızı giriniz:");
        String userName=scan.nextLine();
        System.out.println("Şifrenizi giriniz:");
        String password= scan.nextLine();

        if (userName.equals("patika123") && password.equals("12345")){
            System.out.println("Giriş Başarılı!");
        }else {
            System.out.println("Hatalı Giriş yaptınız.");
        }
    }
}


