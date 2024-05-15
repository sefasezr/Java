package d11loops;

import java.util.Scanner;

public class WhileLoops02 {
    public static void main(String[] args) {
        /* Ornek1: Kullanicinin verdigi sayi icin carpim tablosunu olusturup console'a yazdiran kodu yaziniz

         */
        Scanner scan  = new Scanner(System.in);
        System.out.println("Carpimin sabit tarafi icin sayi giriniz");
        int sabit = scan.nextInt();

        int degisken =0;
        while (degisken<11){
            System.out.println(sabit+"x"+degisken+"="+(sabit*degisken));
            degisken++;
        }

    }
}
