package d25maps;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Scanner;

public class Maps03 {
    public static void main(String[] args) {
        //meshur bir interview sorusu
        //ornek 1: Size verilen bir String'deki her kelimenin, o String'de kac defa kullanildigini
        //           gosteren kodu yaziniz.(Case insensitive (Büyük/küçük harfe duyarsız)olsun)

        //example 1: Given a String, count the number of times each word is used in that String
        // write the code that displays.(Case insensitive)

        String s = "Ali nasilsin Ali.";
        s=s.replaceAll("\\p{Punct}","").toLowerCase();
        System.out.println(s);

        String[] words = s.split(" ");
        System.out.println(Arrays.toString(words));

        HashMap<String,Integer> myMap = new HashMap<>();
        System.out.println(myMap); //{}

        for(String w : words){
            Integer isThere = myMap.get(w);
            if(isThere == null){
                myMap.put(w, 1);
            }else{
                myMap.put(w, myMap.get(w)+1);
            }
        }
        System.out.println(myMap);  //{nasilsin=1, ali=2}

        ////ornek 2: Size verilen bir String'deki her harfin o String'de kac defa kullanildigini gosteren kodu yaziniz.
        //        //example 2: Write the code that shows how many times each letter in a given String is used in that String.
        //        //           “Hello” ==> H=1, e=1, l=2, o=1

        Scanner scan  = new Scanner(System.in);
        System.out.println("String bir deger giriniz");
        String input = scan.nextLine();

        input = input.replaceAll("\\p{Punct}","");
        input = input.replaceAll(" ","");
        String[]inputArr = input.split("");

        HashMap <String,Integer> myMap2 = new HashMap<>();
        for (String c : inputArr) {
            Integer isThere = myMap2.get(c);
            if(isThere == null){
                myMap2.put(c, 1);
            }else{
                myMap2.put(c,isThere+1);
            }

        }
        System.out.println(myMap2);
        System.out.println(input.length());


    }
}
