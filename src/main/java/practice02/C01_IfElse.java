package practice02;

import java.util.Scanner;

public class C01_IfElse {
    public static void main(String[] args) {

        // kullanicidan iki sayi isteyin
        // sayilarin ikisi de pozitif ise sayilarin toplamini yazdirin
        // ikisi de negatif ise sayilarin carpimini yazdirin
        // ikisi farkli isaretlere sahip ise farkli isaretlerde sayilarla islem yapamazsin yazdirin
        // sayilardan sifira esit olan varsa sifir carmaya gore yutan elemandir yazdirin

        Scanner input=new Scanner(System.in);
        //double alabiliriz ama tercihen int olarak alıcam
        System.out.println("Lutfen bir tam sayi giriniz");
        int sayi1= input.nextInt();
        System.out.println("Lutfen 2. bir tam sayi giriniz");
        int sayi2= input.nextInt();


        //eger
        if (sayi1>0&&sayi2>0){//&& : ve anlamına gelen baglac amaci iki degerde pozitif oldugu durumları almasi
            System.out.println(sayi1+sayi2);
        }
        //degilse eger
        else if (sayi1<0&&sayi2<0) {
            System.out.println(sayi1 * sayi2);
        }
        //degilse eger
        else if (sayi1*sayi2<0) {//bu kısımda iki farkli turde kontrol saglayabiliriz
            // 1. yol  (sayi1>0&&sayi2<0)||(sayi1<0&&sayi2>0)
            // 2. yol (sayi1*sayi2<0)
            System.out.println("Farkli isaretlerde sayilarla islem yapamazsin");
            //yukardakilerin hicbiri degilse kalan kısım
        }else {
            System.out.println("sifir carpmaya gore yutan elemandir ");
        }

    }
}
