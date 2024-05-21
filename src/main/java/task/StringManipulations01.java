package task;

import java.util.Scanner;

public class StringManipulations01 {
    public static void main(String[] args) {

        /*  TASK :
        Kullanıcıdan alacağınız, 3 kelimedne oluşan ismi
         Örn. Ahmet Emin Yılmaz -> A.E.Y.  formatıyla yazdırınız.
        */

        Scanner scan = new Scanner(System.in);
        System.out.println("Uc Kelimeden olusan bir isim giriniz");
        String name = scan.nextLine();

        String firstName = name.trim().split(" ")[0].toUpperCase().substring(0,1);
        String secondName = name.trim().split(" ")[1].toUpperCase().substring(0,1);
        String thirdName = name.trim().split(" ")[2].toUpperCase().substring(0,1);


        System.out.println(firstName+"."+secondName+"."+thirdName+".");
    }
}
