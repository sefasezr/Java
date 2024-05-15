package task;

import java.util.Scanner;

public class SwitchCase01 {
    public static void main(String[] args) {


        Scanner scan  = new Scanner(System.in);
        System.out.println("Notunuzu giriniz");
        int not = scan.nextInt();

        if (not <101 && not>-1){
            not/=10;
            switch (not){
                case 0,1,2,3,4:
                    System.out.println("Harf notunuz D");
                    break;
                case 5:
                    System.out.println("Harf notunuz C");
                    break;
                case 6,7:
                    System.out.println("Harf notunuz B");
                    break;
                case 8,9,10:
                    System.out.println("Harf notunuz A");
                    break;
            }
        }else{
            System.out.println("Girdiginiz Not Gecersiz!!!");
        }
    }
}
