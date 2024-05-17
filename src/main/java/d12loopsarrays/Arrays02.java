package d12loopsarrays;

import java.util.Scanner;

public class Arrays02 {
    public static void main(String[] args) {

        //Ornek 1: int turunde ages isminde bir Array olusturunuz, icine 6 tane eleman yerlestiriniz,
        //           bu elemanlarin en kucugu ile en buyugunun toplamini ekrana yazdiriniz.

        //Example 1: Create an Array of type int called ages and place 6 elements in it,
        // display the sum of the smallest and the largest of these elements
        Scanner scan = new Scanner(System.in);
        int [] ages = new int[6];

        System.out.println("6 adet sayi giriniz");
        for (int i = 0; i < ages.length; i++) {
            ages[i]=scan.nextInt();
        }
        int max = Integer.MIN_VALUE;   // Max degere minimum deger vererek kullanicidan alacagim en kucuk
                                           // degeri bile daha buyuk gostererek max degere hep daha buyuk deger bulacagim
        int min = Integer.MAX_VALUE;

        for(int i = 0; i < ages.length; i++){
            if(ages[i]<min){
                min = ages[i];            // dizideki deger min degerden kucukse artik yeni min degeri dizideki degere esitlerim
            }
            if(ages[i]>max){
                max = ages[i];
            }
        }
        System.out.println("Max + Min: "+(max+min));
    }
}
