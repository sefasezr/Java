package practice08;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class C04_Lambda {
    public static void main(String[] args) {
        List<Integer> mylist=new ArrayList<>(Arrays.asList(4,8,12,15,21,44,64,9,97,5,20));
        uceBolunmeyenKupler(mylist);
        //4) Bir list'teki "3'e tam bolunmeyen" olan elemanlarin "kup"lerini "tekrarsiz" olarak ayni satirda
        //aralarina bosluk koyarak yazdiran method'u olusturunuz.
    }

    private static void uceBolunmeyenKupler(List<Integer> mylist) {
        mylist.stream().distinct().filter(t->t%3!=0).map(t->t*t*t).forEach(t-> System.out.print(t+" "));
    }
}
