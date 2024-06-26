package practice08;

import java.util.ArrayList;
import java.util.List;

public class C11_Lambda {
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
        yedidenAzTekrarsizBuyuk(mylist);
        List<String>yeniList=yedidenCokBuyuk(mylist);
        System.out.println(yeniList);
        //11) Bir List'te karakter sayisi 7’den az olan tum elemanlari
// tekrarsiz olarak console'a Buyuk harflerle yazdiran method'u olusturunuz.
    }

    private static void yedidenAzTekrarsizBuyuk(List<String> mylist) {
    }

    private static List<String> yedidenCokBuyuk(List<String> mylist) {
        return mylist;
        //Şimdilik böyle maçtan sonra devam...
    }


}
