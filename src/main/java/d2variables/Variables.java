package d2variables;

public class Variables {
    public static void main(String[] args) {
        //Java bu satiri okumaz. Kendimize veya baskasina aciklamadir

        /*
        1) Java dili Strongly Typed'dir, bu nedenle Java'daki her değişken(variable), belirli
        veri türü(data type) ile iliskilendirilmelidir.
        2) Kod yazanin değişkenlere uygun değerlerin atandığından emin olması her zaman gerekir.
        Aksi takdirde hata oluşur.
         */

        //Ornek 1: String data tipinde ismi hi olan bir variable olusturarak,
        // icine “Hello World” yukleyip console’a yazdiriniz.

        //Example 1: By creating a String data type variable with the name hi,
        // load “Hello World” into it and write it to the console.

        //Siralama nasil olacakti?

        //data type ==> variable name ==> atama operatoru ==>    data ==> noktali virgul

        String             hi                =              "Hello World"    ;
        System.out.println(hi);

        //Ornek 2 : Tamsayi(int) data tipinde ismi age olan bir variable olusturunuz
        // ve icine 15 yukleyip console’a yazdiriniz

        //Example 2: Create a variable with the name age of integer (int) data type
        // and load 15 into it and write it to the console

        int age = 25;
        System.out.println(age); //25

        /*Java Primitive Data Types:
        Not 1 : primitive data type’larini Java olusturmustur, biz olusturamayiz
        Not 2 : primitive data type’larinin isimlerinde sadece kucuk harf kullanilir
        Not 3 : primitive datalar, data type’larina gore memory’de farkli farkli yer kaplarlar
        Not 4 : primitive datalar, iclerinde sadece sizin atadiginiz degeri barindirirlar*/
        //--------------------------
        //1- byte data type:
        //tam sayilar icindir. Hafizada 1 byte(8 bit) yer kaplar
        //-128 den + 127’e tamsayi degerleri icin kullanilir

        //Ornek 1 : byte data tipinde ogrenci yasi icin bir variable olusturun ve deger atayin.
        //Example 1: Create a variable for student age in byte data type and assign a value.

        byte studentAge = 15;
        System.out.println(studentAge); //15
        //--------------------------
        //2- short data type:
        //Tam sayilar icindir. Hafizada 2 byte(16 bit) yer kaplar. Aralik (range) genisledi.
        //-32768 den + 32767’e tamsayi degerleri icin kullanilir

        //Ornek 1: Site nufusu icin bir variable olusturun ve 1200 degerini atayin.
        //Example 1: Create a variable for the site population and assign it the value 1200.

        short sitePopulation = 1200;
        System.out.println(sitePopulation); //1200
        //--------------------------
        //3- int data type:
        //tam sayilar icindir. Hafizada 4 byte (32 bit) yer kaplar
        //-2,147,483,648 ile 2,147,483,647’e tamsayi degerleri icin kullanilir

        //Ornek 1: Ulke nufusu icin bir variable olusturun ve deger atayin.
        //Example 1: Create a variable for the country population and assign a value.

        int countryPopulation = 84234657;
        System.out.println("Ulke Nufusu : " + countryPopulation); //Ulke Nufusu : 84234657
        //countryPopulation.soutv ile kisa yoldan etiket olusturabiliriz
        System.out.println("countryPopulation = " + countryPopulation); //countryPopulation = 84234657

        //Ornek 2: Iki tane int variable olusturun ve toplamlarini console’a yazdirin.
        //Example 2: Create two int variables and print their sums to the console

        int a = 12, b = 13;
        System.out.println(a + b);
        //--------------------------
        //4- long data type:
        //Tam sayilar icindir. Hafizada 8 byte (64 bit) yer kaplar
        //-9,223,372,036,854,775,808 ile 9,223,372,036,854,775,807 arasindaki sayilar icindir.(kentilyon)

        //Not: Long olustururken eger deger, Integer’larin maximum degerinden buyuk ise
        //sonuna "L" koymak zorundasiniz, yoksa "Integer number too large - Tam sayı çok büyük hatasi alirsiniz.

        //Ornek 1: Insan vucudundaki hucre sayisi icin variable olusturup deger atamasi yapiniz.
        //Example 1: Create a variable for the number of cells in the human body and assign a value

        long numberOfCells = 123456789012L;
        System.out.println(numberOfCells); //123456789012

        //Ornek 2: Iki tane Long variable olusturun ve toplamlarini bir etiketle console'a yazdirin.
        //Example 2: Create two Long variables and print their sums to the console with a label


        long c = 15, d = 20;
        System.out.println("Sum :" + (c + d)); //Sum :35
        //Java otomatik int kabul etti. Java memory'i korudu
    }
}
