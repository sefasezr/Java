package practice02;

import java.util.Scanner;

public class C02_NestedIf {
    public static void main(String[] args) {

        /*
            Kullanicidan sisteme bir numara girmesini isteyin.
            Eger numara sifirdan kucukse, console da "Negatif Sayi" yazdirin.
            Degilse, 10'dan kucuk olup olmadigina bakin. 10'dan kucukse console a "Rakam" yazdirin,
            10'dan buyuk veya esitse console a "Pozitif Sayi" yazdirin.
        */
        Scanner input=new Scanner(System.in);
        System.out.println("lutfen bir tam sayi giriniz");
        int sayi= input.nextInt();
        //eger
        if (sayi<0){
            System.out.println("Negatif Sayi");
        }
        //degilse
        else {
            //eger
            if (sayi<10){
                System.out.println("Rakam");
                //degilse
            }else {
                System.out.println("pozitif Sayi");
            }
        }

        if (sayi<0){
            System.out.println("Negatif Sayi");
        } else if (sayi<10) {
            System.out.println("Rakam");
        }else {
            System.out.println("Pozitif Sayi");
        }


    }

}
