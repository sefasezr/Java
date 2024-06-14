package d24_collections;

import java.util.*;

public class Sets01 {
    public static void main(String[] args) {

        //Set’ler tekrarsiz(unique) datalari depolamak icin kullanilir. Ornegin; e-mail, tc kimlik no, il plaka no

        /*Java’da üç tür set vardır:

        1) HashSet: Bu set, elemanların hash kodlarına göre depolandığı bir settir. Elemanlar,
        her birinin benzersiz bir hash kodu (kimlik numarası) ile depolandığı bir yapıda tutulur.
        Bir eleman eklediğinizde, bu elemanın hash kodu hesaplanır ve o hash koduna karşılık gelen
        bir hücreye yerleştirilir.

        HashSet'ler, en hızlı performansı sunar.Ancak, elemanların sırasını korumazlar.
        null’i eleman olarak kabul ederler */

        //--------------------------
        //Hash Code gormek istersek;

        String a = "Aliye Canan";
        System.out.println(a.hashCode());  //-539282105

        //Hash çakişması olabilir - unique değiller ==> HashCode + equals()
        //----------------------------------------------

         /*2) LinkedHashSet: Bu set, elemanların eklenme sırasına göre(insertion order) depolandığı
        bir settir. LinkedHashSet class'i, HashSet class'inin child'idir.
        LinkedHashSet'ler, elemanların sırasını korumaya ihtiyaç duyulan uygulamalar için iyi bir seçimdir.
        Ancak, HashSet'lerden daha yavaş performans sunarlar. (orta)

        Ornegin; Okullarda kayit sirasina gore ogrenci bilgilerini tutmak isterseniz kullanabilirsiniz

        3) TreeSet: Bu set, elemanların doğal sırasına(natural order-kucukten buyuge) göre depolandığı bir settir.
        HashSet'ler ve LinkedHashSet'lerden daha yavaş performans sunarlar.
        Java'da TreeSet, SortedSet arayüzünü(interface) uygulayan bir class'tir.
        Bu nedenle, TreeSet bir Sorted Set’tir.*/

        //HashSet nasil olusturulur?

        HashSet<String>hs = new HashSet<>();
        System.out.println(hs);  //[] icinde hiclik var

        //HashSet'e nasıl eleman eklenir

        hs.add("Sinan");
        hs.add("Kerem");
        hs.add("Tuba");
        hs.add("Onur");
        System.out.println(hs);  //[Kerem, Sinan, Tuba, Onur]

        hs.add("Kerem"); //Tekrarli eleman hata vermez, tekrarlı elemanı uzerıne yazar
        System.out.println(hs);  //[Kerem, Sinan, Tuba, Onur]

        hs.add(null);
        System.out.println(hs);   //[Kerem, null, Sinan, Tuba, Onur]

        //--------Kisa yolla eleman ekleme
        HashSet<String>hs2 = new HashSet<>(Arrays.asList("Sinan","Kerem","Tuba","Onur"));
        System.out.println(hs2);   //[Kerem, Sinan, Tuba, Onur]

        Set<String>hs3 = Set.of("Sinan","Kerem","Tuba","Onur");  //Bu set degistirilemezdir.
        //Yeni eleman eklenemez ve mevcut elemanlar cikarilamaz
        System.out.println(hs3);  //[Onur, Sinan, Kerem, Tuba] - JVM  Kesinlikle sıralı olmak zorunda degil rastgele sıralanır yine
        //------------------------
        LinkedHashSet<Integer> lhs = new LinkedHashSet<>();

        //LinkedHashSet'e eleman nasıl eklenir?

        lhs.add(14);
        lhs.add(19);
        lhs.add(7);
        lhs.add(1);
        lhs.add(null);
        System.out.println(lhs);   //[14, 19, 7, 1, null] ==> insertion order - ekleme sirasi

        LinkedHashSet<Integer>ls = new LinkedHashSet<>();
        ls.add(14);
        ls.add(19);
        ls.add(17);
        ls.add(11);
        System.out.println(ls);  //[14, 19, 17, 11]

        //retainAll() metodu, bir koleksiyondaki öğelerin başka bir koleksiyonla kesişimini
        // (yani her iki koleksiyonda da bulunan öğeleri-ortak) bulmak için kullanılır.

        lhs.retainAll(ls);
        System.out.println(lhs);  //[14, 19]
        System.out.println(ls);   //[14, 19, 17, 11]

        //ODEV: Iki koleksiyon arasındaki farkları bulmak istiyorsak hangi methodu kullaniriz?
        //removeAll() ile yapılıyormuş

        //-------------------------------------
        //TreeSet nasil olusturulur

        TreeSet<Character> ts = new TreeSet<>();
        ts.add('G');
        ts.add('A');
        ts.add('Z');
        ts.add('R');
        ts.add('U');
        //ts.add(null); HATA, null kabul etmez, Kucukten buyuge siralama yaptigi icin null ' i hangi siraya koyacagini bilemez
        //null olsa dogal siralama olmazdi. Null degerlerinin dogal bir siralamasi yoktur
        System.out.println(ts);   // [A, G, R, U, Z] - natural order - (A-Z, sayilarda kucukten buyuge)

        //---------------------------
        //subset() belirli bir aralıktaki elemanları içeren yeni bir küme oluşturmak için kullanılır.
        //subSet() methodu, belirtilen aralıkta bulunan elemanlardan oluşan bir sorted set alt kümesi
        // oluşturur. Bu nedenle, subSet() yöntemini kullanmak için,
        // SortedSet türünden bir değişken oluşturmanız gerekir.

        SortedSet<Character> ss = new TreeSet<>(ts.subSet('G','U'));
        System.out.println(ss);   //[G, R]
        System.out.println(ts);   //[A, G, R, U, Z]

        SortedSet<Character> ss2 = new TreeSet<>(ts);
        System.out.println(ss2.subSet('A', 'R'));  //[A, G]

        //Hocanin notu:
        SortedSet<Character> ss3 = ts.subSet('B','H');
        System.out.println(ss3);  //[G]


    }
}
