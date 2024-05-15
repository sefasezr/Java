package practice03;

import java.util.Scanner;

public class C01_ForLoop {
    public static void main(String[] args) {
        /*
        Kullanicidan bir kelime sisteme girmesini isteyiniz kelimede
        ilk c harfi rastlanana kadar a harflerini sayınız

         */
        Scanner scan = new Scanner(System.in);
        System.out.println("Bir kelime giriniz");
        String str = scan.next();
        int count = 0;

        for (int i = 0; i < str.length(); i++) {

            if (str.charAt(i)=='c'){
                break;
            }else if (str.charAt(i)=='a'){
                count++;
            }
        }
        System.out.println("Kelime icindeki a harfi sayisi: "+count);


    }
}
