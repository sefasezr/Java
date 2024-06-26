package practice08;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class C01_Lambda {
    public static void main(String[] args) {

        //1) Bir list'teki tek elemanlari ayni satirda aralarina bosluk koyarak
        // yazdiran method'u olusturunuz.
        List<Integer> mylist=new ArrayList<>(Arrays.asList(4,8,12,15,21,44,64,9,97));
        tekYazdiran1(mylist);
        System.out.println();
        tekYazdiran2(mylist);
    }
    public static void tekYazdiran1(List<Integer>list){
        for (int a:list)
         {
            if (a%2!=0) {
                System.out.print(a + " ");
            }
        }
    }
    public static void tekYazdiran2(List<Integer>list){
        list.stream().filter(t->t%2!=0).forEach(t-> System.out.print(t+" "));
    }
}
