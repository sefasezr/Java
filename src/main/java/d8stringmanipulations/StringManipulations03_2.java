package d8stringmanipulations;

import java.util.Scanner;

public class StringManipulations03_2 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter Password");
        String password = scan.nextLine();

        boolean karakter = password.length()>7;
        boolean bosluk = password.replaceAll("[^ ]","").length()==0;
        boolean buyukHarf = password.replaceAll("[^A-Z]","").length()>0;
        boolean kucukHarf = password.replaceAll("[^a-z]","").length()>0;
        boolean rakam = password.replaceAll("[^1-9]","").length()>0;

        boolean SifreKontrol = karakter&&bosluk&&buyukHarf&&kucukHarf&&rakam;
        if (SifreKontrol){
            System.out.println("Sifreniz Alinmistir...!");
        }else{
            System.out.println("Lutfen sifre olusturma kurallarina uyun!!");
        }
    }
}
