package practice03;

import java.util.Scanner;

public class C03_NestedForLoop {
    public static void main(String[] args) {


        /*
         *
         * *
         * * *
         * * * *
         * * * * *
         * * * *
         * * *
         * *
         *
         */
        // Bu sekli cizdir

        Scanner scan  = new Scanner(System.in);
        System.out.println("Sutun sayisini belirleyin");
        int sutun = scan.nextInt();

        for(int i = 0 ; i<sutun;i++){
            for (int j = 0 ; j<=i ; j++){
                System.out.print("* ");
            }
            System.out.println("");
        }
        sutun--;
        for (int i = sutun;i>0;i--){
            for (int j = i; j>0 ; j--){
                System.out.print("* ");
            }
            System.out.println("");
        }

    }
}
