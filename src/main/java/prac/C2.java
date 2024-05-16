package prac;

import java.util.Scanner;

public class C2 {
    public static void main(String[] args) {
        /*
        Konsoldan girilen sayıyı 1 e kadar yazdırıp,aynı satırda tekrardan verilen sayıya
        kadar yazdıran ve alt alt 1’er azaltıp aynı işlemi üçgen gibi devam ettiren java algoritma kodunu yazınız.
         */
        Scanner scan = new Scanner(System.in);
        System.out.println("Sayi girin");
        int sira = scan.nextInt();

        for (int i = sira ; i>0 ;i--){
            for (int j = i ; j>0 ;j--){
                System.out.print(j+" ");
            }
            for (int k =2 ; k<=i ;k++){
                System.out.print(k+" ");
            }
            System.out.println("");

        }
    }
}
