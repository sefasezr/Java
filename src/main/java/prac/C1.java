package prac;

import java.util.Random;

public class C1 {
    public static void main(String[] args) {
        /*
        0 ile 1000 arasında random bir sayı oluşturarak bu
        sayının rakamları toplamını veren java algoritma kodunu yazınız ?
         */

        Random rnd = new Random();
        int sayi = rnd.nextInt(0,1000);
        int rakTop =0;
        int rndSayi =sayi;
        for (int i = sayi; i>0; i/=10){
            rakTop += i%10;
        }
        System.out.println(rndSayi);
        System.out.println(rakTop);
    }
}
