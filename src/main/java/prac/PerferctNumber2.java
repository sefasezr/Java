package prac;

import java.util.Scanner;

public class PerferctNumber2 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("bir sayi giriniz :");
        int sayi = scan.nextInt();

        int toplam = 0;
        for (int i = sayi -1; i > 0 ; i--) {

            if (sayi % i == 0){
                toplam += i;
            }
        }

        if (toplam == sayi){
            System.out.println("Mukemmel sayi");
        } else {
            System.out.println("Mukemmel sayi degil");
        }
    }
}
