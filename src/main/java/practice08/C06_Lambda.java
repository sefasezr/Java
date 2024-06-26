package practice08;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class C06_Lambda {
    public static void main(String[] args) {
        List<Integer> mylist=new ArrayList<>(Arrays.asList(4,8,12,15,21,44,64,9,97,5,20));
        ucebolunenKuplerinTop(mylist);
        /*
       6)bir listedeki elemanlardan 3'e bolunenlerin ilk once kupunu alıp sonra bunlarin toplamını bulan bir method olusturun
       */
    }

    private static void ucebolunenKuplerinTop(List<Integer> mylist) {
        int toplam = mylist.stream().filter(t->t%3==0).map(t->t*t*t).reduce(0,(t,u)->t+u);
        System.out.println(toplam);
    }
}
