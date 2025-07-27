package KareAlma;

import java.util.Scanner;

public class Kare {
    int kenar;

    public Kare(int kenar){
    this.kenar=kenar;
    }
    public int alan(){
        return kenar*kenar;
    }
    public int cevre(){
        return 4*kenar;
    }

}
