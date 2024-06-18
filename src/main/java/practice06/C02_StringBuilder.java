package practice06;

public class C02_StringBuilder {
    public static void main(String[] args) {
        /*
                - Kapasitesi 7 olan bir StringBuilder objesi oluşturun.
                - Capacity ve Length değerlerini yazdırın.
                - Bu objeye "hava güzel" verisini ekleyin ve yazdırın.
                - Aradaki boşluğu siliniz.
                - Veriyi ters çeviriniz.
                - Verinin son 4 karakterini siliniz.
                - Veriyi tekrar ters çevirin.
                - Verinin başına "Java " verisini ekleyin.
         */

        //- Kapasitesi 7 olan bir StringBuilder objesi oluşturun.
        StringBuilder sb=new StringBuilder(7);

        //- Capacity ve Length değerlerini yazdırın.
        System.out.println(sb.length());//0
        System.out.println(sb.capacity());//7

        //- Bu objeye "hava güzel" verisini ekleyin ve yazdırın.
        sb.append("hava güzel");//10
        System.out.println(sb);//hava güzel

        //- Aradaki boşluğu siliniz.
        int boslukIndex= sb.indexOf(" ");
        sb.deleteCharAt(boslukIndex);
        System.out.println(sb);//havagüzel

        //- Veriyi ters çeviriniz.
        sb.reverse();
        System.out.println(sb);//lezügavah

        //- Verinin son 4 karakterini siliniz.
        sb.delete(sb.length()-4,sb.length());
        System.out.println(sb);//lezüg

        // - Veriyi tekrar ters çevirin.
        sb.reverse();
        System.out.println(sb);//güzel

        //- Verinin başına "Java " verisini ekleyin.
        sb.insert(0,"Java");
        System.out.println(sb);//Java güzel

        sb.insert(4," ");
        System.out.println(sb);
        //sb.insert(sb.length()-1,"di bugun");

        System.out.println(sb.length());//10
        System.out.println(sb.capacity());//16
    }
}
