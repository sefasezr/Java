package d8stringmanipulations;

public class StringManipulations04 {
    public static void main(String[] args) {

        //Ornek 1: Asagida fiyatlari verilen urunlerin toplam fiyatini bulunuz.
        //String tv = "$456.99";   String laptop = "$875.99"; ==> 456.99 + 875.99 = 1332.98

        //Example 1: Find the total price of the following products.
        //String tv = "$456.99"; String laptop = "$875.99"; ==> 456.99 + 875.99 = 1332.98

        //valueOf() : Belirtilen String'i Double'a cevirir.

        String tv = "$456.99";
        String laptop = "$875.99";

        tv = tv.replace("$", "");
        laptop = laptop.replace("$", "");

        Double totalPrice = Double.valueOf(tv) + Double.valueOf(laptop);
        System.out.println(totalPrice); //1332.98
        //----------------------------------
        //Ornek 2: Kullanici isminin ilk harflerini alip buyuk hale getirerek console'a yazdiriniz.
        //           "   ali cAN   " ==> AC
        //Example 2: Take the first letters of the username, capitalize them and write them to the console.

        //trim() metodu bir String'deki bastaki ve sondaki bosluklari siler. Aradakileri silmez
        //split() String'i istediginiz karakterden parcalamaya yarar.
        //Not: Bir satirda, birden fazla methodu yanyana kullanirsaniz buna "method chain (zincir)" denir

        String name ="    aLi    cAN    ";
        char firstChar = name.trim().toUpperCase().charAt(0);
        char secondNameFirstChar = name.trim().toUpperCase().split("\\s+")[1].charAt(0);
        System.out.println("First char: " + firstChar);
        System.out.println("Second char: " + secondNameFirstChar);

        // Eger Ali Can isminin araasindaki bosluk sayisi 1 degil de daha fazla olsaydi
        // split() methodu sasirmasin diye splitin icini
        name.split("\\s+"); // gibi duzenledigimizde sasirmasini engelliyoruz ve
        // aradaki boslukları butun olarak goruyor
    }
}
