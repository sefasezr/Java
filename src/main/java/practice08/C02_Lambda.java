package practice08;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class C02_Lambda {
    public static void main(String[] args) {
        List<Integer> mylist=new ArrayList<>(Arrays.asList(4,8,12,15,21,44,64,9,97,5,20));
        beseBolunen(mylist);

        //2) bir listedeki elemanlardan 5'e tam bolunenleri yazdiran bir method olusturun
    }

    private static void beseBolunen(List<Integer> mylist) {
        mylist.stream().filter(t->t%5==0).forEach(System.out::println);
    }
}
