package d18datetime_stringbuilder;

import java.time.LocalDate;
import java.util.Scanner;

public class DateTime01 {
    public static void main(String[] args) {
        //ornek 1:  Kullanicindan dogum tarihini alan ve girdigi tarihin gun ismini bulan kodu yaziniz.
        //example 1: Write the code that takes the date of birth from the user and finds the day name of the date entered.

        Scanner scan  = new Scanner(System.in);
        System.out.println("Dogum tarihinizi yil ay gun olarak giriniz");
        System.out.println("Yil giriniz");
        int y = scan.nextInt();
        System.out.println("Ay giriniz");
        int m = scan.nextInt();
        System.out.println("Gun giriniz");
        int d = scan.nextInt();

        LocalDate date = LocalDate.of(y,m,d);
        System.out.println(date.getDayOfWeek());  // Girilen tarihin gununu aldik

    }
}
