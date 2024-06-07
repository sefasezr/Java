package d17constructors_datetime;

import java.time.LocalDate;
import java.util.Scanner;

public class DateTime02 {
    public static void main(String[] args) {

        //ornek 8: Kullanicidan aldiginiz tarih gecmise ait ise "Gecersiz tarih girdiniz" mesaji veriniz.
        //Kullanicidan aldiginiz tarih gelecege ait ise "Zamani girebilirsiniz" deyiniz.//

        //Example 8: If the date you have received from the user is in the past,
        // give the message "You have entered an invalid date".
        //If the date you have received from the user is in the future, say "You can enter the time".

        Scanner scan = new Scanner(System.in);

        /*
        System.out.println("Lutfen verilen sirada tarih bilgisini giriniz. yil-ay-gun");

        System.out.println("Lutfen yil giriniz.");
        int yil = scan.nextInt();
        System.out.println("Lutfen ay giriniz.");
        int ay = scan.nextInt();
        System.out.println("Lutfen gun giriniz");
        int gun = scan.nextInt();
        LocalDate yourTime ;

        if(yil> LocalDate.now().getYear()){
            yourTime = LocalDate.of(yil,ay,gun);
            System.out.println("Your time = "+yourTime);
        }else if (yil < LocalDate.now().getYear()){
            System.out.println("Lutfen guncel tarihten ileri bir yil girin");
        }else{
            if(ay>LocalDate.now().getMonthValue()){
                yourTime = LocalDate.of(yil,ay,gun);
                System.out.println("Your time = "+yourTime);
            }else if (ay<LocalDate.now().getMonthValue()){
                System.out.println("Lutfen guncel tarihten ileri bir ay girin");
            }else{
                if(gun>LocalDate.now().getDayOfMonth()){
                    yourTime = LocalDate.of(yil,ay,gun);
                    System.out.println("Your time = "+yourTime);
                }else if (gun < LocalDate.now().getDayOfMonth()){
                    System.out.println("Lutfen guncel tarihten ileri bir gun girin");
                }else{
                    System.out.println("Guncel tarihi girdiniz");
                }
            }
        } */
        // Ustteki YONTEM BENIM ILK YAPTIGIM

        System.out.println("Lutfen verilen sirada tarih bilgisini giriniz. yil-ay-gun");

        System.out.println("Lutfen yili giriniz");
        int year = scan.nextInt();

        System.out.println("Lutfen ayi giriniz");
        int month = scan.nextInt();

        System.out.println("Lutfen gunu giriniz");
        int day = scan.nextInt();

        //Kullanicidan alinan verilerle bir tarih olusturalim
        LocalDate givenDate = LocalDate.of(year, month, day);

        if (givenDate.isBefore(LocalDate.now())) { //Girilen tarih su andan onceyse
            System.out.println("Gecersiz tarih girdiniz");
        } else {
            System.out.println("Zamani girebilirsiniz");
        }



    }
}
