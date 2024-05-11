package d3_datatypes_concat_operators;

public class Variables01 {
    public static void main(String[] args) {
        //5- float data type: Hafizada 32 bit - 4 byte yer kaplar
        //(Decimal Numbers ==> ondalikli sayilar) icin kullanilir.
        //Ozellikle fiyat degerleri icin "float" kullanilir. App'inizde bu data tipini secmelisiniz.

        //Dikkat :Java ondalikli sayilari otomatik olarak double kabul eder.
        // (trigonometrik işlemler, logaritmalar vb.) çok hassas sonuçlar gerektiğinde,
        // double'ın daha yüksek hassasiyeti faydalı olabilir. O yuzden default double dir.
        //float olmasina israr ediyorsaniz sonuna "F" veya "f" koymalisiniz

        // Ornek 1: 2 tane float data tipinde variable olusturunuz ve bunlarin toplamini bir etiket ile console'a yazdiriniz.
        // Example 1: Create 2 float data type variables and write their sum to the console with a label.
        //1.yol:

        float sockPrice1 = 12.99f;
        float shirtPrice1 = 25.99f;
        System.out.println("Total Price1: " + (sockPrice1 + shirtPrice1)); //Total Price1: 38.98

        //2.yol:

        float sockPrice2 = 12.99f, shirtPrice2 = 25.99f;
        System.out.println("Total Price2: " + (sockPrice2 + shirtPrice2)); //Total Price2: 38.98

        //3 corap, 2 gomlek olsaydi?
        //What if there were 3 socks and 2 shirts?

        System.out.println("Total Price: " + (3 * sockPrice1 + 2 * shirtPrice1)); //Total Price: 90.95

        //------------------------
        //6- double data type :
        //double memory de 8 byte (64 bit) yer kaplar, ondalikli kisim icin daha fazla rakam alir.
        // Ondalikli sayilar icin kullanilir. Daha hassas hesaplamalar icin kullanilir.


        //Ornek 1: Hucre agirligi icin bir variable olusturup console'a yazdiriniz.
        //Example 1: Create a variable for cell weight and print it to the console

        double cellWeight = 0.0000000000000028;
        System.out.println(cellWeight); //2.8E-15 ==> 2.8 carpi 10 uzeri -15 demektir
        //------------------------
        //7- char 2 byte’tir (16 bit). Tek karakterler icin kullanilir.
        // Sayi, sembol, harf farketmez. Data tek tirnak icine yazilir.
        // SD seklinde iki karakter koyamazsiniz.
        // Ornegin ‘A’, ‘x’, ‘?’, ‘5’ koyabilirsiniz.

        //Ornek 1: char data tipinde bir variable olusturunuz ve icine isminizin ilk harfini yukleyiniz.
        //Example 1: Create a variable of char data type and insert the first letter of your name into it.

        char firstLetterOfTheName = 'S';
        System.out.println(firstLetterOfTheName); //S
        //------------------------
        //8- Boolean Data Type: Sadece true (dogru) ve false (yanlis) olmak uzere 2 farkli deger alirlar.

        //Ornek 1: boolean data tipinde, emekli mi sorusu icin bir degisken olusturun ve false atayin.
        //Example 1: Create a variable of boolean data type for the question "Is he/she retired?"
        // and assign it to false.

        boolean isRetired = false;
        System.out.println(isRetired); //false

        boolean b1 = true;
        boolean b2 = false;
        boolean b3 = true;
        boolean b4 = false;
        System.out.println("---------------");
        System.out.println(b1 && b2); //false
        System.out.println(b2 || b3); //true
        System.out.println(b2 && b4); //false
        System.out.println(b3 || b4); //true

        /*System.out.println() ve System.out.print() fonksiyonları arasındaki temel fark,
        System.out.println()'in bir satır atlayarak çıktı vermesi,
        System.out.print()'in ise aynı satırda çıktı vermeye devam etmesidir*/

        System.out.println("Hello");
        System.out.println("World");
        //Hello
        //World

        System.out.print("Hello ");
        System.out.print("World");
        //Hello World
    }
}
