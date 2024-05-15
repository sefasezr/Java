package practice03;

import java.util.Scanner;

public class C05_DoWhileLoop {
    public static void main(String[] args) {
        /*
            Kullanicidan toplanmak uzere pozitif tamsayilar isteyin
            Kullaniciya bitirmek istediginde 0'a basmasini soyleyin

            kullanici bitirmek istediginde
            toplam kac adet pozitif tam sayi girdigini
            ve bunlarin toplaminin kac oldugunu yazdirin

            kullanici negatif sayi girerse
            "negatif sayi kullanamazsiniz " yazdirin
            bu negatif sayiyi sayi adedine ve toplama eklemeyin
         */

        Scanner scan  = new Scanner(System.in);
        System.out.println("Toplanmak uzere pozitif tam sayilar girin \nEger negatif tam sayi girerseniz bu anlamsız olacaktir \nBitirmek istediginizde 0'a basin");
        int sayi ;
        int sayac =0,toplam=0;


        do{
            sayi = scan.nextInt();
            if(sayi>0){
                toplam+=sayi;
                sayac++;
            }
        }while(sayi!=0);
        System.out.println("Girdiginiz sayilar toplami: "+toplam+"\nGirdiginiz pozitif sayi adedi: "+sayac);

    }
}
