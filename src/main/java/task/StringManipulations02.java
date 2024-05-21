package task;

import java.util.Scanner;

public class StringManipulations02 {
    public static void main(String[] args) {

        /*
        TASK :
        kullanıcıdan bir e-posta adresi girmesini isteyin, ardından "hotmail" içeriyorsa, "gmail" ile değiştirin,
        örneğin: johnbrown@hotmail.com ==> johnbrown@gmail.com
        */

        Scanner scan = new Scanner(System.in);
        System.out.println("Mail Adresinizi girin");
        String mail = scan.nextLine();

        boolean check = mail.split("@")[1].startsWith("hotmail");
        if (check) {
            System.out.println(mail.replace("hotmail","gmail"));
        }
    }
}
