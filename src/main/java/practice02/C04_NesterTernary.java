package practice02;

import java.util.Scanner;

public class C04_NesterTernary {
    public static void main(String[] args) {

        /*
             Kullanicidan ayri ayri iki tamsayi sisteme girmesini isteyin.
             Ternary kullanarak;
             Sayilar birbirine esit ise console da "Sayilar Birbirine Esit" yazdirin.
             Sayilar birbirine esit degilse, buyuk olan sayinin karesini ekrana yazdirin.
         */
        //condition(ders calisiyo musunuz)?  evet  :  hayır  ;

        Scanner input=new Scanner(System.in);

        System.out.println("lutfen 1. tam sayiyi giriniz");
        int sayi1= input.nextInt();

        System.out.println("Lutfen 2. tam sayiyi giriniz");
        int sayi2= input.nextInt();

        Object sonuc=sayi1==sayi2?"Sayilar birbirine esit": (sayi1>sayi2 ? sayi1*sayi1:sayi2*sayi2);
        System.out.println(sonuc);

        System.out.println(sayi1 == sayi2 ? "Sayilar birbirine esit" : (sayi1 > sayi2 ? sayi1 * sayi1 : sayi2^2));//java ^ isareti us anlamına gelmez !! Math.pow methodu kullanılır

    }
}
