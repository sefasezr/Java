package d6if_switch_ternary;

import java.util.Scanner;

public class IfStatements02 {
    public static void main(String[] args) {

        /*Ornek 1: Kullanicinin vermis oldugu gün isimlerine bakarak Hafta Sonu veya Hafta ici
        olduguna karar veren kodu yaziniz.

        Pazartesi ==> Hafta ici       Cumartesi ==> Hafta sonu*/

        /*Example 1: Write the code that decides whether it is Weekend or Weekday
         based on the day names given by the user.
        Monday ==> Weekday Saturday ==> Weekend*/

        //equals() iki String'in birbirinin aynisi olup olmadigini kontrol eder.
        //Bu method boolean return eder(true veya false).

        //equalsIgnoreCase() iki String'in birbirinin aynisi olup olmadigini
        //buyuk kucuk harfi dikkate almadan kontrol eder

        Scanner input = new Scanner(System.in);
        System.out.println("Enter day name");

        String dayName = input.next();

        boolean isWeekendDay = dayName.equalsIgnoreCase("Saturday") ||
                dayName.equalsIgnoreCase("Sunday");

        boolean isWeekDay = dayName.equalsIgnoreCase("Monday") ||
                dayName.equalsIgnoreCase("Tuesday") ||
                dayName.equalsIgnoreCase("Wednesday") ||
                dayName.equalsIgnoreCase("Thursday") ||
                dayName.equalsIgnoreCase("Friday");

        if (isWeekendDay) {
            System.out.println("Weekend");

        } else if (isWeekDay) {
            System.out.println("Weekday");
        } else {
            System.out.println("Enter a valid day name");
        }
    }
}
