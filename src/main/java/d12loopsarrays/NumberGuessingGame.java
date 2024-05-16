package d12loopsarrays;

import java.util.Random;
import java.util.Scanner;

public class NumberGuessingGame {
    public static void main(String[] args) {
        //Ornek 1: 0-100 arasi sayi tahmin etme oyununu do-while ile yaziniz

        Random rnd = new Random();
        Scanner scan  = new Scanner(System.in);

        // 0-100 arasinda rastgele bir sayi uretilecek
        int rastgeleSayi = rnd.nextInt(101);

        // Kullanicinin kac kere tahmin yaptigini tahmin etmek icin bir sayac olusturalim
        int denemeSayisi = 0;

        //Kullanicinin yaptigi tahmini saklamak icin bir degisken olusturalim
        int tahminEdilen;

        //Kullanicinin sayiyi dogru tahmin edip etmedigini kontrol etmek icin bir boolean degisken olusturalim

        System.out.println("Sayiyi tahmin etmek icin 0-100 dahil sayi giriniz");
        do{

            tahminEdilen= scan.nextInt();

            denemeSayisi++;
            if(tahminEdilen>rastgeleSayi){
                System.out.println("Daha dusuk bir sayi girerek deneyin");
            }else if(tahminEdilen<rastgeleSayi){
                System.out.println("Daha yuksek bir sayi girerek deneyin");
            }else{
                System.out.println("Tahmininiz Dogru Tebrikler... \n"+denemeSayisi+" tahminde dogru sayiya ulastiniz");
                break;
            }

        }while(true);
    }
}
