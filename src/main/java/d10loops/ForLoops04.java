package d10loops;

import java.util.Scanner;

public class ForLoops04 {
    public static void main(String[] args) {

        //Verilen bir tamsayinin rakamlari toplamini console yazdiriniz.
        //example 1: Print the sum of the digits of a given integer to the console
        //578 ==> 5+7+8=20 ==> Output 20 olmali

        Scanner scan = new Scanner(System.in);
        System.out.println("Sayi giriniz");
        int sayi = scan.nextInt();

        int sum = 0;

        for (int i = sayi; i > 0; i = i / 10) { // i /= 10
            sum = sum + i % 10;
        }
        System.out.println("Sum : " + sum);

        //Ornek 2: Bir String’teki tekrarsiz karakterleri veren kodu yaziniz.
        //Example 2: Write the code that returns the non-repeating characters in a String.
        // Yusuf ==> Ysf

        scan.nextLine();
        String str = scan.nextLine();

        for (int i = 0;i < str.length();i++) {
            if(str.indexOf(str.charAt(i)) == str.lastIndexOf(str.charAt(i))) {
                System.out.print(str.charAt(i));
            }

        }






    }
}
