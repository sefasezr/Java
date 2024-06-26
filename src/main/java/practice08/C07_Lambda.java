package practice08;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class C07_Lambda {
    public static void main(String[] args) {
        List<Integer> mylist=new ArrayList<>(Arrays.asList(4,8,16,64));
        dorteTamBulunenTekrarsiElKarekokCrapimi(mylist);
      /*
    7)bir listedeki tekrarsiz elemanlardan 4'e tam bolunenlerin karekoklerinin carpimini yazdirin
     */
    }

    private static void dorteTamBulunenTekrarsiElKarekokCrapimi(List<Integer> mylist) {
        double carpim = mylist.stream().distinct().filter(t->t%4==0).map(Math::sqrt).reduce(1.0,(t,u)->t*u);
        System.out.println(carpim);
    }
}
