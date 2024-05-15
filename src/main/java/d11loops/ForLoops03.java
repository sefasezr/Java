package d11loops;

import java.util.Scanner;

public class ForLoops03 {
    public static void main(String[] args) {

        for (int i = 1; i <4; i++) {
            for (int j = 1; j < 6; j++) {
                System.out.print("X ");
            }
            System.out.println("");



        }
        /* Odev:Asagidaki sekli for loop kullanarak cizdiriniz
         *
         * *
         * * *
         * * * *

         */
        Scanner scan = new Scanner(System.in);
        System.out.println("Yildizlarin kac satir devam etmesini istediginizi girin");
        int input = scan.nextInt();

        for (int i = 1; i <=input; i++){
            for (int j = 1; j <= i; j++ ){
                System.out.print("* ");
            }
            System.out.println("");
        }

    }
}
