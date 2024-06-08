package d18datetime_stringbuilder;

import java.time.Duration;
import java.time.LocalDate;
import java.time.LocalTime;
import java.time.Period;
import java.time.temporal.ChronoUnit;
import java.util.Scanner;

public class DateTime02 {
    public static void main(String[] args) {

        //ornek 2: Verilen iki tarih arasindaki farki hesaplayan kodu yaziniz.
        //example 2: Write the code that calculates the difference between two given dates.

        //Java'da Period sınıfı, tarihler arasındaki yıl, ay ve gün farklarını temsil etmek için kullanılır.
        // Bu sınıf, iki LocalDate nesnesi arasındaki zaman farkını ifade eder ve java.time paketi içinde yer alır.
        // Period sınıfı, tarihler arasındaki farkları kolayca yönetmek ve manipüle etmek için çeşitli metodlar sağlar.

        //Kullanım Alanları
        //Period sınıfı, özellikle tarihler arasındaki uzun süreli farkları hesaplamak, tarihleri manipüle etmek
        // veya tarihler arası geçiş sürelerini yönetmek için kullanışlıdır. Finans, sağlık, eğitim gibi alanlarda
        // ve tarih ile ilgili işlemlerin sık yapıldığı her türlü yazılım geliştirme projelerinde etkili bir araçtır.

        //Period.between() metodu, iki tarih arasındaki farkı hesaplamak için kullanılır.
        // Bu metod, başlangıç ve bitiş tarihleri arasındaki tam yıl, ay ve gün farkını bir Period nesnesi olarak döndürür.

        Scanner scan  = new Scanner(System.in);
        System.out.println("Dogum tarihinizi yil ay gun olarak giriniz");
        System.out.println("Yil giriniz");
        int y = scan.nextInt();
        System.out.println("Ay giriniz");
        int m = scan.nextInt();
        System.out.println("Gun giriniz");
        int d = scan.nextInt();

        LocalDate date1 = LocalDate.of(y,m,d);
        LocalDate date2 = LocalDate.now();

        Period difference = Period.between(date1,date2);
        System.out.println(difference);  //P20Y4M6D ==> P:Period, 20Y:20 Yil 5M: 5 Ay, 4D

        int yearDifference = difference.getYears();
        int monthDifference = difference.getMonths();
        int dayDifference = difference.getDays();

        System.out.println(date1+" ve "+date2+" arasindaki fark: ");
        System.out.println("Yil : "+yearDifference);
        System.out.println("Ay : "+monthDifference);
        System.out.println("Gün : "+dayDifference);

        //Duration Class nedir?

        //https://www.oracle.com/technical-resources/articles/java/jf14-date-time.html

        LocalTime time = LocalTime.now();
        LocalTime futureTime = time.plus(120, ChronoUnit.MINUTES);

        Duration duration = Duration.between(time,futureTime);

        System.out.println(duration.toHours()+ " Hours");
        System.out.println(duration.toMinutes()+" Minutes");
        System.out.println(duration.toString());



    }
}
