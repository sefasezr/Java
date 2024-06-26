package practice08;

import java.util.ArrayList;
import java.util.List;

public class C10_Lambda {
    public static void main(String[] args) {
        List<String> mylist=new ArrayList<>();
        mylist.add("Arda");
        mylist.add("ahmet");
        mylist.add("Beyza");
        mylist.add("Dogukan");
        mylist.add("Erhan");
        mylist.add("Erkan");
        mylist.add("Erol");
        mylist.add("Ersen");
        mylist.add("Esra");
        mylist.add("Mahinur");
        mylist.add("Mirayat");
        mylist.add("Zeynep");
        mylist.add("Murat");
        aHaric(mylist);
        //10) Bir List'teki A ile baslayanlar haric tum elemanlari
        //console'a yazdiran method'u olusturunuz.

    }

    private static void aHaric(List<String> mylist) {
        mylist.stream().filter(t->!t.startsWith("A")).forEach(t-> System.out.print(t+" "));
    }
}
