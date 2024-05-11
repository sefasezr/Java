package day01;

public class C01_Variables {
    public static void main(String[] args) {

        /*primitive
        8 adetti
        byte short int long , float double ,char ,boolean
         */

        //non-primitive
        /*
        String Scanner Object Wrapper classlar ve su anda olusturdugumuz class dahil olmak uzere tum classlar
         */

        // Bir yas variable'i olustur ve yazdir
        //data type           //variable ismi  //assignment operator //data(deger value)   //eger biz bunu koymazsak hata alırız bu bizim cumlemizin bittigi gosterir
        byte                  age              =                     21                    ;
        System.out.println(age);
        System.out.println("age = " + age);//age.soutv variable ismi ile yazdırmayi saglar
        System.out.println("Yas : "+age);//kendimde sonradan etiket ekleyebilirim
        //(int) bir variable(sayi)  olustur ve (deger olarakta 50 verelim) yazdır
        int            sayi              =                   50                ;
        System.out.println(sayi);
        System.out.println("sayi = " + sayi);//burada etiket ile birlikte yazdırdık
        System.out.println("Number : "+sayi);//burada etiket ile birlikte yazdırdık

        // Bir benimYasim variable'i olustur, mevcut yas degiskenini kendisine ata
        byte myAge=age;
        System.out.println("benim yasim : "+myAge);

        // Birkac isim variable'i olustur, yazdir
        String isim1="Zekeriya",isim2="Asiye",isim3="Gözde",isim4="Ömer";
        System.out.println("isim1 = " + isim1);//ctrl+d
        System.out.println("isim2 = " + isim2);
        System.out.println("isim3 = " + isim3);
        System.out.println("isim4 = " + isim4);

        // Bir benimIsmim variable'i olustur, mevcut isim degiskenlerinden birini kendisine ata
        String myName=isim1;
        System.out.println("myName = " + myName);


    }
}
