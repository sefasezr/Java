package practice03;

import java.util.Scanner;

public class C02_ForLoop {
    public static void main(String[] args) {
        Scanner scan  = new Scanner(System.in);
        System.out.println("5 adet sayi giriniz");
        int toplam =0;

        for (int i = 0; i < 6; i++) {
            int sayi = scan.nextInt();

            if(sayi%10==7||sayi%10==9){
                continue;
            }
            toplam += sayi;
        }
        System.out.println("Sarta uyan sayilar toplami: "+toplam);
    }
}
