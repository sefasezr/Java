package practice08;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class C08_Lambda {
    public static void main(String[] args) {
        List<Integer> mylist=new ArrayList<>(Arrays.asList(4,8,12,15,21,44,64,9,97,5,20));
        maxDegerBul1(mylist);
        maxDegerBul2(mylist);
        //8)Verilen List'teki "maksimum değeri" bulmak için bir method oluşturun
        //  int max=mylist.get(0);
        //  for (int a:mylist
        //  ) {
        //      if (max>a){
        //      }else {
        //          max=a;
        //      }
        //  }
        //   System.out.println("max = " + max);

    }

    private static void maxDegerBul2(List<Integer> mylist) {
        int max = mylist.stream().distinct().reduce(Math::max).get();
        System.out.println("max: "+max);
    }

    private static void maxDegerBul1(List<Integer> mylist) {
        int max = mylist.stream().distinct().reduce(mylist.get(0), (t,u)->t>u?t:u);
        System.out.println("max: "+max);
    }
}
