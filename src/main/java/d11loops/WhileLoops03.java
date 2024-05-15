package d11loops;

import java.util.Scanner;

public class WhileLoops03 {
    public static void main(String[] args) {
        // Ornek1: Belirli bir tamsayinin palindrome olup olmadigini kontrol eden kodu yazin. interview sorusu

        Scanner scan = new Scanner(System.in);
        System.out.println("Palindrom kontrolu icin sayi girin");
        int k = scan.nextInt();
        String kStr = String.valueOf(k);
        String reverse="";
        int index = kStr.length()-1;
        while(index>=0){
            reverse=reverse+kStr.charAt(index);
            index--;
        }
        if(reverse.equals(kStr)){
            System.out.println("Girdiginiz sayi palindrom");
        }else{
            System.out.println("Girdiginiz sayi palindrom degil");
        }

    }
}
