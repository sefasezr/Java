package d12loopsarrays;

import java.util.Scanner;

public class DoWhileLoops02 {
    public static void main(String[] args) {
        /*Ornek 1:
       Gecerli Username="admin" ve Password="pwd123" dur.
       Kullanicidan username ve password'u alin.
       Username ve password dogru ise console'a "Hesabiniza hosgeldiniz!" yazdirin.
       Username veya password yanlis ise 4 kere "Username ve password'unuzu giriniz" mesaji versin.
       Username veya password 4. kere yanlis girilirse "Hesabiniz bloke olmustur" mesaji vererek islemi tamamlayiniz.

        Example 1:
        Valid Username="admin" and Password="pwd123".
        Get the username and password from the user.
        If the username and password are correct, print "Welcome to your account!" to the console.
        If the username or password is incorrect, prompt "Enter your username and password" 4 times.
        If the username or password is entered incorrectly for the 4th time, complete the process with the message "Your account is blocked".
        */

        Scanner scan  = new Scanner(System.in);


        int tryCount = 0;
        int maxTries = 4;

        do{
            System.out.println("Enter Username.");
            String username = scan.nextLine();
            System.out.println("Enter Password.");
            String password = scan.nextLine();
            tryCount++;
            if (username.contains("admin")&&password.contains("pwd123")){
                System.out.println("Welcome to your account!");
                break;
            }else if(tryCount==3){
                System.out.println("Your account is blocked");
            }else{
                maxTries--;
                System.out.println("Username ve password'unuzu giriniz. \nKalan Deneme hakkiniz: "+maxTries);
            }
        }while(tryCount<4);
    }
}
