package d27exceptions;

public class E05 {
    public static void main(String[] args) {

        //try blogundan sonra birden fazla catch blogu kullanabilir miyiz? Evet

        int a = 12;
        int b = 1;
        String s = "My Java";
        getCharFromString(s,a,b);
        getCharFromString2(s,a,b);
    }

    public static void getCharFromString(String s,int a, int b){
        try{

            int idx = a/b;
            char ch = s.charAt(idx);
            System.out.println(ch);

        }catch (ArithmeticException e){
            System.out.println("Sifira bolme yapmayiniz "+e.getMessage());
        }catch (Exception e){
            System.out.println("Olmayan index kullandiniz "+e.getCause());  //Hatanin sebebini verir
        }
    }

    //2.yol: Tum exception turlerini tek bir catch’te yakalamak icin “Exception” adli parent kullanilir

    public static void getCharFromString2(String s,int a, int b){

        try{
            int idx = a / b;
            char ch = s.charAt(idx);
            System.out.println(ch);
        }catch (Exception e){
            System.out.println("Bir istisna olustu "+e.getMessage());
        }

    }
}
