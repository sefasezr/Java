package prac;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class PerfectNumber {
    public static void main(String[] args) {
        /* Perfect Number (Mukemmel sayi)
      Kullanici tarafindan bir sayiya kadar olan sayilarin,
      mukemmel olup olmadigini bulan method yaziniz.
      Mukemmel sayi : bir sayinin kendisi haric bolenlerinin toplami,
      kendisine esitse o sayi mukemmeldir. (1+2+3 = 6 = 6 (Mukemmel))
      ORNEK: (6, 28, 496, 8128)
      INPUT      : 6
      OUTPUT     :  1,2,3
    */
        
        Scanner scan  = new Scanner(System.in);
        System.out.println("Bir sayi giriniz");
        int number = scan.nextInt();
        int toplam = 0;
        List<Integer> mukemmelSayi = new ArrayList<>();
        
        for (int i = 2; i <= number; i++) {
            for (int j = 1; j < i; j++) {
                if (i % j == 0) {
                    toplam+=j;
                }
                }
            if (toplam==i){
                mukemmelSayi.add(i);
            }
            toplam=0;

        }
        System.out.println(mukemmelSayi);
    }
}
