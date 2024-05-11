package day02;

import java.util.Scanner;

public class C06_Switch {
    public static void main(String[] args) {

        /*
           Kullanicidan ay numarasini sisteme girmesini isteyiniz.
           Eger girilen ay 2 numarali ay ise kullanicidan yil da isteyin.
           Bu bilgilere gore ayin kac gun cektigini yazdiriniz.

           NOT : 1, 3, 5, 7, 8, 10, 12. aylar 31 gun ceker
                 4, 6, 9, 11. aylar 30 gun ceker
                 2. ay 4 yilda bir 29 gun ceker, diger yillarda 28 gun ceker
         */
        Scanner input=new Scanner(System.in);
        System.out.println("lutfen ay numarasini giriniz");
        byte ayNo= input.nextByte();

        switch (ayNo) {
            // case 1, 3, 5, 7, 8, 10, 12 fakat bu java 14'den sonra cıktı, bundan dolayı 14 surumunu ve daha
            case 1, 3, 5, 7, 8, 10, 12:
                System.out.println("Girdiginiz ay 31 gun ceker");
                break;
            case 4, 6, 9, 11:
                System.out.println("Girdiginiz ay 30 gün ceker");
                break;
            case 2:
                System.out.println("Lutfen bulundugunuz yili giriniz : ");
                int year = input.nextInt();
                if (year % 4 == 0) {
                    System.out.println("Girdiginiz ay 29 gun ceker");
                } else {
                    System.out.println("Girdiginiz ay 28 gun ceker");
                }
                break;
            default :
                System.out.println("Atanmadı, lutfen gecerli bir ay numarasi giriniz");
                break;
        }//switch sonu

    }
}
