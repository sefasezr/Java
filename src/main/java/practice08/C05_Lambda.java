package practice08;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class C05_Lambda {
    public static void main(String[] args) {
        List<Integer> mylist=new ArrayList<>(Arrays.asList(4,8,12,15,21,44,64,9,97,5,20));
        method(mylist);

        //5)Bir list'teki “tekrarsiz","7'den buyuk" elemanlarin "karelerinin"
        // "toplamını" hesaplayan method oluşturun
    }

    private static void method(List<Integer> mylist) {
        int toplam = mylist.stream().distinct().filter(t->t<7).map(t->t*t).reduce(0,(t,u)->t+u);
        System.out.println(toplam);
    }
}
