package practice08;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class C03_Lambda {
    public static void main(String[] args) {
        //3) Bir list'teki "10'dan kucuk" olan elemanlarin "kare"lerini ayni satirda  aralarina bosluk
        //koyarak yazdiran method'u olusturunuz.
        List<Integer> mylist=new ArrayList<>(Arrays.asList(4,8,12,15,21,44,64,9,97,5,20));
        ondanKucukKare(mylist);
    }

    private static void ondanKucukKare(List<Integer> mylist) {
        mylist.stream().filter(t->t<10).map(t->t*t).forEach(t-> System.out.print(t+" "));
    }
}
