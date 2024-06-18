package practice05;

import java.util.Arrays;

public class C01_MDA {
    public static void main(String[] args) {

        int [][] arr = {{3,5},{-8,6,9,-1},{14,10,3}};
        int [] toplanmis = new int[arr.length];
        int i = 0;
        for(int[] w :  arr){
            for(int v : w){
                toplanmis[i] += v;
            }
            i++;
        }
        System.out.println("Total toplanmis : "+ Arrays.toString(toplanmis));
    }
}
