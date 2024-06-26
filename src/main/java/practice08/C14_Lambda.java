package practice08;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class C14_Lambda {
    public static void main(String[] args) {
        List<String> mylist=new ArrayList<>();
        mylist.add("Bayram");
        mylist.add("Berkhan");
        mylist.add("Emine");
        mylist.add("Faruk");
        mylist.add("Feyza");
        mylist.add("Hulika");
        //mylist.add("İlay");
        mylist.add("Mustafa");
        mylist.add("Levent");
        mylist.add("Kubilay");
        mylist.add("Nesibe");
        mylist.add("Ahmet");
        mylist.add("arda");
        //tekrarsizUzunlukSiraliYazdir(mylist);
        buyukHarfDisindakiler(mylist);
    }
    //14) Bir List'teki elemanlari tekrarsiz olarak, uzunluklarina gore
    // kucukten buyuge siralayarak console'a yazdiran method'u olusturunuz.
    public static void tekrarsizUzunlukSiraliYazdir(List<String >list){
        list.stream().distinct().sorted(Comparator.comparing(String::length)).forEach(System.out::println);
    }

    /*
    15)verilen listedeki ifadelerden buyuk harf iceren kelimeler disindakileri yazdırın
     */
    public static void buyukHarfDisindakiler(List<String> list){
        list.stream().filter(t->t.charAt(0)<'A'||t.charAt(0)>'Z').forEach(System.out::println);
    }
}
