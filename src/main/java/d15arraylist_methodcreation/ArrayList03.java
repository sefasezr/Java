package d15arraylist_methodcreation;

import java.util.ArrayList;
import java.util.List;

public class ArrayList03 {
    public static void main(String[] args) {
        //Ornek 1: Bir tane Integer List olusturunuz.Bu List'te birbirine en yakin iki tamsayiyi yaziniz.
        // Example 1: Create an Integer List.Write the two closest integers in this List.
        //           [12, 23, 10, 19] ==> 12 ve 10

        ArrayList <Integer> a = new ArrayList<>();
        a.add(12);
        a.add(23);
        a.add(10);
        a.add(19);
        System.out.println(a);


        int ey1 =0;
        int ey2 =0;
        double minFark = Double.MAX_VALUE;
        double fark = 0;
        for (int i = 0; i < a.size(); i++) {
            for (int j = i+1; j < a.size(); j++) {
                fark = a.get(i)-a.get(j);
                fark = Math.sqrt(fark);
                if(fark<minFark) {
                    minFark = fark;
                    ey1 = i;
                    ey2 = j;
                }
            }
        }
        System.out.println(a.get(ey1)+","+a.get(ey2));

        // Ustteki benim belki de uzun cozumum

        List<Integer> nums = new ArrayList<>();
        nums.add(12);
        nums.add(23);
        nums.add(10);
        nums.add(19);

        //Collections.sort(nums);
        nums.sort(null); //Daha modern bir yontem

        System.out.println(nums); //[10, 12, 19, 23]

        //TimSort Algoritmasi

        int minDiff = nums.get(1)-nums.get(0);

        for (int i= 1; i <nums.size();i++){
            minDiff = Math.min(minDiff,nums.get(i)-nums.get(i-1));
        }
        for (int i= 1; i <nums.size();i++){
            if(nums.get(i)-nums.get(i-1)==minDiff){
                System.out.println(nums.get(i)+ " ve "+nums.get(i-1));
            }
        }

    }
}
