package practice08;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class C09_Lambda {
    public static void main(String[] args) {
        List<Integer> mylist=new ArrayList<>(Arrays.asList(2,4,6,10,12,14,16));
        enKucukKaresi(mylist);
        //9)Verilen List'ten 12’den buyuk en kucuk sayiyin karesini bulmak için bir method oluşturun
    }

    private static void enKucukKaresi(List<Integer> mylist) {
        int kare = mylist.stream().filter(t->t>12).sorted().findFirst().map(t->t*t).get();
        System.out.println(kare);
    }
}
