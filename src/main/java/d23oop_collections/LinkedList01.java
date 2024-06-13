package d23oop_collections;

import java.util.*;

public class LinkedList01 {

    public static void main(String[] args) {

        /*Collections (koleksiyonlar), Object’leri depolamak ve işlemek için kullanılan
        bir class’lar ve interface'ler kümesidir.

        —Collections, çeşitli Object (nesne) işleme yöntemlerini de destekler:
                Ekleme: Bir nesneyi bir koleksiyona eklemek için kullanılır.
                Silme: Bir nesneyi bir koleksiyondan silmek için kullanılır.
                Arama: Bir koleksiyonda bir nesneyi bulmak için kullanılır.
                Döngüleme: Bir koleksiyonun tüm nesnelerini işlemek için kullanılır.

        —Collections, Java programcılarının aşağıdakileri yapmasına olanak tanır:
                Verileri verimli bir şekilde depolamak
                Verileri hızlı bir şekilde işlemek(verileri aramak, sıralamak, filtrelemek)
                Verileri güvenli bir şekilde depolamak*/
        //-----------------------------
        /*Java da Array’ler neden eksik kaldi da Collection’lar gelistirildi?

        Java’da array'ler eksik kaldı çünkü:

        Boyutları statiktir: Bu, array'lerin dinamik olarak büyüyemediği veya küçülemediği anlamına gelir.
        İç içe geçmiş array'ler karmaşıktır: Bu, array'lerin birbirleriyle ilişkili olduğu durumlarda karmaşık ve hata yapmaya müsaittir.
        Array'ler genel olarak verimli değildir: Bu, ekleme, silme ve arama gibi işlemler için genellikle daha yavaştır.

        Collections, bu dezavantajları çözmek için tasarlanmıştır.*/

        ArrayList<String> list1 = new ArrayList<>();
        List<String> list2 = new ArrayList<>();
        // List<String> list3 = new List<>();  HATA

        //-------------------------
        /*LinkedList: Bağlı bir listedir.

        LinkedList’ler de, bir dizi index'e sahiptir. Ancak, bu index'ler,
        LinkedList'in içinde bulunan node'ların konumunu temsil eder.

        ArrayList'lerde, bir elemana erişmek için, o elemanın index'ine doğrudan erişilebilir.
        Ancak, LinkedList'lerde, bir elemana erişmek için, o elemanın bulunduğu node'a erişmek gerekir.
        Bu, LinkedList'lerde bir elemana erişmenin daha yavaş olmasına neden olabilir.

        1)Her eleman, bir önceki ve bir sonraki elemanı işaret eden (pointer) bağlantılara sahiptir.
        Bu nedenle, ekleme ve silme işlemleri hızlıdır, ancak elemanlara erişim, başka bir elemandan
        başlayarak ilerlemeyi gerektirir. Yani ArrayList’e gore erisim yavastir.
        ArrayList’lerde get(index) ile hizli erisiriz. Ama LinkedList’ler en bastan istenen eleman mi diye
        tek tek bakar.

        2) Başka bir elemanın başından veya sonundan eleman eklemek veya silmek, hızlı bir şekilde yapılabilir.

        3) Bağlantılar ve düğümler (node) nedeniyle LinkedList, genellikle daha fazla bellek kullanır.*/

        //-----------------
        /*Sonuc:
        LinkedList’in bu hızlı ekleme ve silme işlemleri, bazı senaryolarda tercih edilmesine neden olurken,
        veriye doğrudan erişim gerektiren durumlarda ArrayList daha uygundur.

        Bu nedenle, hangi liste türünün kullanılacağı, uygulamanın gereksinimlerine ve
        yapılacak işlemlerin türüne bağlıdır.
        Eleman ekleme ve silme islemleri listenin sonundan yapildiginda ArrayList daha uygundur.
        Eleman ekleme ve silme islemleri listenin basinda veya ortasinda sikca yapildiginda LinkedList daha uygundur.
        */

        //ODEV: Ekstra - O(1) zaman karmasikligi nedir?

        LinkedList<String> myList = new LinkedList<>();

        //1-add() : listeye bir eleman ekler

        myList.add("Ali");
        myList.add("Veli");
        myList.add("Ayşe");
        myList.add("Fatma");

        System.out.println(myList); //[Ali, Veli, Ayşe, Fatma] - insertion order - ekleme süresi
        //Bir degisiklik yaptigimizde LinkedList'in orjinali degisir ArrayListte de boyle aslında


        //------------------------------------------LinkedList'e eleman eklemenin kisa yollari
        LinkedList<String> linkedList = new LinkedList<>(Arrays.asList("Eleman1","Eleman2","Eleman3"));
        System.out.println(linkedList);
        linkedList.addAll(Arrays.asList("kameni","volkan"));
        //System.out.println(linkedList);

        LinkedList<String> linkedList1 = new LinkedList<>(List.of("Eleman4","Eleman5"));
        //System.out.println(linkedList1);

        //-----------------------------
        List<String> immutableList = List.of("Eleman6","Eleman7");  //Kurucudan degilde, dogrrudan elemanlar eklenince sabit
        //bir list olusur ve yeni eleman eklenemez
        //immutableList.add("Eleman8");
        // System.out.println(immutableList); HATA verecek
        //---------------------------------------------------------------------
        //2-add(int index, E element); belirtilen konuma bir oge ekler

        myList.add(1,"Zeynep");
        System.out.println(myList);  //[Ali, Zeynep, Veli, Ayşe, Fatma]
        //-----------------------------------------------
        // 3- addFirst(E e): Listenin basina oge ekler
        myList.addFirst("Hasan");
        System.out.println(myList);

        //-----------------------------------------------
        // 4- addLast(E e): Listenin sonuna bir oge ekler
        myList.addLast("Huseyin");
        System.out.println(myList);

        //--------------------------------
        //5) remove(Object o): Belirtilen öğeyi listeden kaldırır ve boolean dondurur
        boolean m1 =myList.remove("Ali");  //true
        System.out.println(myList);        //[Hasan, Zeynep, Veli, Ayşe, Fatma, Huseyin]
        System.out.println(m1);

        //--------------------------------
        //6)removeFirstOccurrence() metodu,
        // belirtilen bir öğeyi LinkedList içinde
        //bastan başlayarak arar ve bu öğeyi bulduğunda onu listeden kaldırır.
        //Eğer bu öğe birden fazla kez bulunuyorsa, en bastaki öğe kaldırılır.
        //Eğer belirtilen öğe listede bulunmuyorsa, herhangi bir değişiklik yapmaz ve liste aynı kalır.

        myList.add("Yusuf");  // en sona ekledi
        myList.add(3,"Yusuf");
        System.out.println(myList);   //[Hasan, Zeynep, Veli, Yusuf, Ayşe, Fatma, Huseyin, Yusuf]

        //myList.removeFirstOccurrence("Yusuf");
        //System.out.println(myList);   //[Hasan, Zeynep, Veli, Ayşe, Fatma, Huseyin, Yusuf]

        //myList.removeAll(Collections.singleton("Yusuf"));  // Tum yusuflari sildirdi Collections.singleton() ile
        //System.out.println(myList);  //[Hasan, Zeynep, Veli, Ayşe, Fatma, Huseyin]















    }
}
