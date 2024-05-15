package practice02;

import java.util.Scanner;

public class C03_Ternary {
    public static void main(String[] args) {

        /*
             Kullanicidan bir sayi sisteme girmesini isteyin
             Ternay kullanarak;
             Girilen sayi cift ise console a "Cift Sayi" yazdirin.
             Girilen sayi tek ise girilen sayiyi 3 artirarak console a yazdiriniz.
         */

        //condition(ders calisiyo musunuz)?  evet  :  hayır  ;

        Scanner input=new Scanner(System.in);
        System.out.println("Lutfen bir tam sayi giriniz");
        int sayi= input.nextInt();

        //System.out.println(sayi % 3);//2

        Object sonuc=  sayi%2 == 0 ? "Cift Sayi" : sayi + 3;
        //biz eger bunu bu sekilde yaparsak burada sonucta bir kontrol var
        //ben bunu sadece yazdirirsam sonuc sadece bir kere yazdilir ve ilerleyen kısımlarda
        //tekrar kontrol etmem gerekebilir
        System.out.println(sonuc);

        //2.yol---> Ancak bu şekilde yaparsak kontrol sonucunu herhangi
        //bir değişkene atamadığımız için başka yerde kullanamayız, sadece çıktı alırız.
        System.out.println(sayi % 2 == 0 ? "Cift Sayi" : sayi + 3);

        if (sayi%2==0){
            System.out.println("Cift Sayi");
        }else {
            System.out.println(sayi+3);
        }
    }
}
