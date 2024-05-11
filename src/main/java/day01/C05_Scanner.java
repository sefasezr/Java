package day01;

import java.util.Scanner;

public class C05_Scanner {
    public static void main(String[] args) {

        // Kullanicidan bir sayi alin, karesini bulun.
        //1. kullanıcıdan dedigi anda scanner objesini olusturmamız gerekiyor
        Scanner input=new Scanner(System.in);
        //2.adım olarak kullanıcıya bilgi vermemiz gerekiyor kullanıcı bilgiyi ver kullanıcı bilgi girsin
        System.out.println("karesini almak istediginiz istediginiz sayiyi giriniz : ");
        double sayi= input.nextDouble();
        System.out.println("sayinin karesi : "+sayi*sayi);//cunku * işlemi + işleminden once gelir

        //next() ile nextLine() farki
        //System.out.println("isminizi giriniz");//mesaj vermezsem bilgi alamam
        //String str1= input.next();
        //System.out.println("str1 = " + str1);//next() sadece tek kelime almayi saglar
        //String str2= input.nextLine();//birden fazla kelime
        //System.out.println("str2 = " + str2);
    }
}
