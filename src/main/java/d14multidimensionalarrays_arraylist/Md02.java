package d14multidimensionalarrays_arraylist;

import java.util.Arrays;

public class Md02 {
    public static void main(String[] args) {
        //Ornek 1: Iki boyutlu bir Array'i tek boyutlu bir Array'e ceviriniz.
        //Example 1: Convert a two-dimensional Array to a one-dimensional Array.
        // int[][] numbers = {{5, 4}, {2, 3, 2}}; ==> { 5,4,2,3,2 }

        int [][] arr = {{5,4},{2,3,2}};

        int sayac =0;     //iki boyutlu dizideki eleman sayisini saydim

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                sayac++;   // for icinde artirarak
            }
        }

        int [] newArr = new int[sayac];   // iki boyutlu diziyi aktaracagim tek boyutlu dizimi olusturdum

        sayac =0;   // baska degisken olusturmadan sayaci tekrar kullanmak icin sifirladim

        for (int i = 0; i<arr.length;i++){
            for (int j = 0; j<arr[i].length;j++){
                newArr[sayac]= arr[i][j];    // bu kisim belki en karisik kisim ama anlasilinca gayet kolay
                sayac++;     // atamak icin 0'dan baslayan sayaci her atamada 1 artirdim
            }
        }
        System.out.println(Arrays.toString(newArr));  // [5,4,2,3,2]

    }
}
