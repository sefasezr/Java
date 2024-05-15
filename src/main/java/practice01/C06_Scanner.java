package practice01;

import java.util.Scanner;

public class C06_Scanner {
    public static void main(String[] args) {

        // Kullanicidan kilosunu ve boyunu alin, vucut kitle indeksini gosterin.
        // kilo/(boy*boy)

        //1. adım scanner objesini olustur
        Scanner input=new Scanner(System.in);

        //2. adım bilgi ver
        System.out.println("lutfen kilonuzu giriniz");
        double kilo= input.nextDouble();
        System.out.println("lutfen boyunuzu giriniz");
        double boy= input.nextDouble();

        //3. olarak sonucu yazdir
        System.out.println("vucut kitle indexiniz : "+kilo/(boy*boy));
    }
}
