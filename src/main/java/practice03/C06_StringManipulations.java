package practice03;

import java.util.Scanner;

public class C06_StringManipulations {
    public static void main(String[] args) {

        /*
        toLowerCase:harfleri kucultmeyi saglar
        toUpperCase:harfleri buyultmeyi saglar
        length:karakter sayisini yani uzunlugunu verir
        equals:esit mi diye kontrol eder (peki == farki nedir =='hem adrese hem degere bakar fakat equals methodu sadece degere bakar)
        equalsIgnoreCase:buyuk kucuk harf farketmeksizin esit mi diye kontrol eder
        indexOf:girilen karakterin ilk indexini dondurur
        lastIndexOf:girilen karakterin son indexini dondurur
        charAt:girilen indexteki karakteri dondurur
        trim:bastaki ve sondaki bosluklari siler
        split:icine girilen degerden boler sag ve sol olmak uzere secim yaptırır(0 sol/1 sag)
        replace:icindeki datayi degistirmeyi saglar
        replaceAll:icindeki datyi gruplar halinde(regex) degistirmeyi saglar
        concat:birlestirme islemi yapar
        subString:ilk girilen indexten ikinci indexe kadar(ikinci index dahil degildir) olan degeri bize dondurur
        valueOf:String'i baska dataya baska datalari String'e cevirmeyi saglar.
        contains:icerme durumunu kontrol eder
        endsWith:ne ile bittigini kontrol eder
        startsWith:ne ile basladigini kontrol eder
        isBlank:hem bos mu diye kontrol eder bos degilse sadece bosluk karakter var mi diye kontrol eder
        isEmpty:bos mu diye kontrol eder
         */

         /*
            oKullanicidan ad ve soyadini aralarinda bir bsluk olacak sekilde sisteme girmesini isteyiniz.
            NOT : Yalnizca bir ad bir soyad girilmeli
            Ad v                                                                                                                                                                                                                                   i ilk harfleri buyuk olacak sekilde alt alta yazdirin
            Ad : Canan
            Soyad : Can
        */

        Scanner scan  = new Scanner(System.in);
        System.out.println("Adinizi ve Soyadinizi aralarinda 1 bosluk olacak sekilde giriniz \nSadece 1 isim ve soyisim yaziniz");
        String name_surname = scan.nextLine();



        boolean boslukTekMi = name_surname.trim().indexOf("\\ ")==name_surname.trim().lastIndexOf("\\ ");
        int bolumNoktasi = name_surname.trim().indexOf(" ");

        if(name_surname.trim().indexOf(" ")==-1){
            System.out.println("Isim ve soyisim arasina bosluk koyunuz");
        }else if (boslukTekMi){
            String name = name_surname.trim().substring(0,bolumNoktasi);
            String nameEdited =name.substring(0,1).toUpperCase()+name.substring(1).toLowerCase();
            String surname = name_surname.trim().substring(bolumNoktasi+1);
            String surnameEdited = surname.substring(0,1).toUpperCase() + surname.substring(1).toLowerCase();
            System.out.println("Ad: "+nameEdited);
            System.out.println("Soyad: "+surnameEdited);
        }else{
            System.out.println("Tek isim ve soyisim giriniz");
        }


    }
}
