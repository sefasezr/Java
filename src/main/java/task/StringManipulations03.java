package task;

import java.util.Scanner;

public class StringManipulations03 {
    public static void main(String[] args) {

        /*  TASK :
				StringMethods:
				cift uzunlukta bir degiskenin ilk yarisini konsolda yazdirmak icin bir Java programi yaziniz.
	    	    ORNEK:
		     	INPUT      :  Python
				OUTPUT :   Pyt
	    */

        Scanner scan = new Scanner(System.in);
        System.out.println("String bir deger giriniz");
        String input = scan.next();

        if(input.length()%2==0){
            for(int i = 0; i<input.length()/2; i++){
                System.out.print(input.charAt(i)+"");
            }
        }else{
            System.out.println("Input cift uzunlukta degil");
        }
    }
}
