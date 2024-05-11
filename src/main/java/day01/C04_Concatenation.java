package day01;

public class C04_Concatenation {
    public static void main(String[] args) {

        String str1 = "Java";
        String str2 = "Guzel";
        int sayi1 = 5;
        int sayi2 = 3;

        // Java5
        System.out.println(str1+sayi1);

        // Java8Guzel
        System.out.println(str1+(sayi1+sayi2)+str2);

        // 2Guzel15
        System.out.println("sonuc : "+(sayi1-sayi2)+str2+sayi1*sayi2);//2Guzel15
        System.out.println(sayi1-sayi2+str2+sayi1*sayi2);//2Guzel15

        // Java22
        //1.yol
        System.out.println(str1+(sayi1*sayi1-sayi2));

        //2.yol
        System.out.println(str1+(sayi1-sayi2)+(sayi1-sayi2));
        //String str3="1234"; bu sayiyi bir sayiyla toplamak istiyorsam degerini degistirmem lazım yani data turunu int ya da double yapmam lazım

        String str3="Ali";
        String str4="Can";
        String str5="Javayı";
        String str6="bugun";
        String str7="tam";
        String str8="anlamıyla";
        String str9="ogrendi";
        //Ali Can Javayi bugun 8 yıl sonra tam anlamıyla ogrendi.
        System.out.println(str3+" "+str4+" "+str5+" "+str6+" "+(sayi1+sayi2)+
                " yıl sonra "+str7+" "+str8+" "+str9+".");
    }
}
