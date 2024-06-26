package practice08;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class C13_Lambda {
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
        tekrarsizKucukTersYazdir(mylist);
    }

    //13) Bir List'teki elemanlari tekrarsiz olarak, kucuk harflerle, alfabetik sira'nin tersi olarak
    // console'a yazdiran method'u olusturunuz.

    public static void tekrarsizKucukTersYazdir(List<String>list){
        list.stream().distinct().sorted(Comparator.reverseOrder()).map(String::toLowerCase).forEach(t-> System.out.print(t+" "));
        //'a' ile 'A' arasinda fark var ascii deger farki var
    }
}
