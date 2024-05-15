package practice02;

import java.util.Scanner;

public class C05_Switch {
    public static void main(String[] args) {

        /*
             Kullanicidan 0-4 arasi sinav puanini sisteme girmesini isteyiniz.

             Eger puani 0,0 - 1,0 arasinda ise KALDI seviyesi veriniz
                  puani 1,0 - 2,0 arasinda ise GECTİ seviyesi veriniz
                  puani 2,0 - 2,5 arasinda ise İYİ seviyesi veriniz
                  puani 2,5 - 3,5 arasinda ise UST seviyesi veriniz
                  puani 3,5 - 4,0 arasinda ise HARİKA seviyesi veriniz

              switch case kullanarak KALDI seviyesine F harf notu veriniz
                                     GECTİ seviyesine D harf notu veriniz
                                     IYI seviyesine C harf notu veriniz
                                     UST seviyesine B harf notu veriniz
                                     HARİKA seviyesine A harf notu veriniz
         */

        Scanner input=new Scanner(System.in);
        System.out.println("Lutfen 0-4 arasi sinav puaninizi sisteme giriniz");
        double not= input.nextDouble();
        String str=" ";

        if (not>=0&&not<1){
            str="KALDI";
        } else if (not>=1&&not<2) {
            str="GECTİ";
        } else if (not>=2&&not<2.5) {
            str="IYI";
        } else if (not>=2.5&&not<3.5) {
            str="UST";
        } else if (not>=3.5&&not<=4) {
            str="HARİKA";
        }else {
            str="ATANMADI,sinav puani 0-4 arasinda olmalidir";
        }

        switch (str){//str'i biz anahtar olarak dusunebiliriz
            case "KALDI":
                System.out.println("F");
                break;
            case "GECTİ":
                System.out.println("D");
                break;
            case "IYI":
                System.out.println("C");
                break;
            case "UST":
                System.out.println("B");
                break;
            case "HARİKA":
                System.out.println("A");
                break;
            default:
                System.out.println(str);
                break;
        }//switch sonu

    }
}
