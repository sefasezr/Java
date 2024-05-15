package practice03;

import java.util.Scanner;

public class C05_DoWhileLoop02 {
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

        Scanner scan = new Scanner(System.in);

        int sayac = 0;
        int toplam = 0;

        do {

            System.out.println("Lutfen pozitif bir tamsayi giriniz \n Bitirmek için 0'a basiniz ");
            int sayi = scan.nextInt();

            if (sayi == 0){
                break;
            } else if (sayi < 0) {
                System.out.println("Negatif sayi kullanamazsiniz");
            } else { // kullanıcının pozitif tamsayi girme durumudur
                sayac++;
                toplam+=sayi;
            }


        } while (true);

        System.out.println("Girdiginiz " + sayac + " adet pozitif tamsayinin toplami : " + toplam);
    }
}
