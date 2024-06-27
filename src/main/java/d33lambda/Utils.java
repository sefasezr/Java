package d33lambda;

public class Utils {

    /*Java'da "Utils" (fayda-araclar-utilities) class’i oluşturmanın temel mantığı,
    belirli bir konsept veya işlevsellikle ilgili yardımcı (helper) metotları bir araya toplamaktır.
    Bu class’lar genellikle static metotlardan oluşur ve doğrudan class adı üzerinden çağrılırlar.
    Buraya  Java’da olmayan ama bizim surekli projemizde kullandigimiz bir islevi method olarak ekleriz
    ve onu cagirip kullaniriz. Amaca uygun yeni methodlar olusturabiliriz.*/

    public static void printInTheSameLineWithSpace(Object obj){
        System.out.print(obj+" ");
    }
    public static boolean ciftMi(int num){
        return num % 2 == 0;
    }
    public static boolean tekMi(int num){
        return num % 2 == 1;
    }
    public static Integer kareAl(int num){
        return num*num;
    }

    public static Integer kupAl(int num){
        return num*num*num;
    }
    public static Double kokAl(double num){
        return Math.sqrt(num);
    }
    public static int rakamlarToplami(int x){
        int toplam = 0;
        for(int i = x; i>0; i/=10){
            toplam += i%10;
        }
        return toplam;

    }
    public static boolean bestenBuyukMu(int num){
        return num > 5;
    }
    public static Double yarisiniAl(int num){
        return (double)num/2;
    }

}
