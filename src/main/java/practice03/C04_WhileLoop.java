package practice03;

import java.util.Scanner;

public class C04_WhileLoop {
    public static void main(String[] args) {
        // Kullanicidan sisteme bir sayi girmesini isteyiniz,
        // kullanicinin girdigi sayidan baslayarak, 10'un katina gelene kadar ardisik yazdiriniz.

        // Orn: Sayı: 41
        //      Çıktı: 41, 42, 43, 44, 45, 46, 47, 48, 49


        // baslangic degeri
        // kosul
        // artis azalis

        Scanner scan  = new Scanner(System.in);
        System.out.println("Bir sayi giriniz");
        int deger = scan.nextInt();

        while (deger%10!=0){
            System.out.print(deger+" ");
            deger++;
        }
    }
}
