package day01;

public class C03_KimlikBilgileri {
    public static void main(String[] args) {

        String isim ="Ali";
        String soyIsim="Can";
        String tcNo="12345678901";
        int yas=14;
        char cinsiyet='E';
        String kutuk="Sivas";
        float boy=193.6f;
        double kilo=75.7;
        //1.yol
        System.out.println("isim = " + isim);
        System.out.println("soyIsim = " + soyIsim);
        System.out.println("tcNo = " + tcNo);
        System.out.println("yas = " + yas);
        System.out.println("cinsiyet = " + cinsiyet);
        System.out.println("kutuk = " + kutuk);
        System.out.println("boy = " + boy);
        System.out.println("kilo = " + kilo);
        System.out.println("-----------------------------------------");

        //2.yol
        System.out.println("isim : " + isim+
                "\nsoyIsim : " + soyIsim +
                "\ntcNo : " +tcNo +
                "\nyas : " +yas +
                "\ncinsiyet : " +cinsiyet +
                "\nkutuk : " +kutuk +
                "\nboy : " +boy +
                "\nkilo : "+kilo);
    }
}
