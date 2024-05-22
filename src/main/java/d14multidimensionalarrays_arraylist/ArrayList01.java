package d14multidimensionalarrays_arraylist;

import java.util.ArrayList;

public class ArrayList01 {
    public static void main(String[] args) {

         /*ArrayList, dinamik bir array yapısıdır. Bu, ArrayList'in boyutunun, elemanlar ekleme veya çıkarma
         sırasında otomatik olarak ayarlanabileceği anlamına gelir.

        Gerçek hayattan bir örnek olarak, bir alışveriş listesi ArrayList olarak temsil edilebilir.
        Alışveriş listesi, ürünlere ait isimlerin bir listesini içerir. Ürünler, String referans türleridir.*/

        /*
        1)Array’ler primitive data type’lari ve reference’lari depolayabilir ama Arraylist’ler
        non-primitive’leri (reference’lari) depolar
        2)ArrayListler memory’de Array’lerden daha fazla yer kaplar
        3)Array’ler olusturulurken bastan eleman sayisini belirtmek zorundayiz
        4)ArrayList’ler eleman sayisinda esnektirler.
        5) Array’leri Java niye iptal etmedi?
            a) Array’ler cok daha hizlidir
            b) Array’ler memory’de cok az yer kaplarlar
            c) Bu nedenle eleman sayisi belli olan datalari depolamak icin Array’ler tercih edilir

        6) Java’da generic (kapsamli) türler (<> ile belirtilen türler) için yalnızca referans
        veri türleri kullanılabilir. Primitive veri türleri (örneğin int, char, boolean, double, vb.)
         doğrudan generic türlerin içine yerleştirilemez. Bu nedenle, özel bir durumla karşılaştığınızda,
         bu türleri ilgili sınıflarla sarmalamanız (wrapper) gerekir.
        */

        //ArrayList nasil olusturulur?

        //ArrayList<Integer> ages1 = new ArrayList<Integer>(); //Java 6 ve oncesi
        ArrayList<Integer> ages = new ArrayList<>(); // Java 7 ve sonrasi - type inference - tip cikarimi
        //---------------------
        //ArrayList'lere eleman nasil eklenir?

        //add() metodu, ArrayList'e yeni bir eleman eklemek için kullanılır ve
        // eklenen elemanı listenin sonuna yerleştirir.

        ages.add(9);
        ages.add(12);
        ages.add(5);
        System.out.println(ages); //[9, 12, 5]

        //List'te araya eleman eklemek icin index numarasini yazariz
        //add(int index, E element): Bu metot, belirtilen elemanı ArrayList'in belirtilen konumuna ekler.
        // Mevcut elemanlar sağa kaydırılır.

        ages.add(1, 28);
        System.out.println(ages); //[9, 28, 12, 5]

        //12 ile 5 arasina 7 ekleyin
        ages.add(3, 7);
        System.out.println(ages); //[9, 28, 12, 7, 5]

        //En sona 11 ekleyin
        ages.add(11);
        System.out.println(ages); //[9, 28, 12, 7, 5, 11]
        //------------------------
        //Ornek 1: Verilen Integer List’i, ages List'inin icine koyunuz.
        //Example 1: Put the given Integer List into the ages List

        //addAll() metodu, bir koleksiyondaki tüm öğeleri mevcut ArrayList'e eklemek için kullanılır.
        // Bu metod, genellikle bir ArrayList'i başka bir koleksiyonun öğeleriyle genişletmek istediğinizde kullanışlıdır.

        ArrayList<Integer> newAges = new ArrayList<>();

        newAges.add(1);
        newAges.add(2);
        newAges.add(3);
        ages.addAll(newAges);
        System.out.println(ages); //[9, 28, 12, 7, 5, 11, 1, 2, 3]
        //System.out.println(newAges); //[1, 2, 3]

        //addAll(int index, Collection<? extends E> c): Bu metod, belirtilen koleksiyondaki tüm öğeleri ArrayList'in
        // belirtilen indeksinden başlayarak ekler. Bu işlem sırasında, var olan öğeler sağa kaydırılır.

        ages.addAll(0, newAges);
        System.out.println(ages); //[1, 2, 3, 9, 28, 12, 7, 5, 11, 1, 2, 3]

        //-----------------------
        //size() metodu, ArrayList'teki öğelerin sayısını döndürür. (int return eder)
        int totalElement = ages.size();
        System.out.println(totalElement); //12

        //-----------------------
        //get(int index) metodu, ArrayList'te belirli bir konumdaki ogeye erismek icin kullanilir.

        int element = ages.get(3); //3.index'teki elemani getirdi
        System.out.println(element); //9

        //-----------------------
        //set(int index, E element) metodu, ArrayList'te belirtilen indeksteki öğeyi verilen yeni öğeyle değiştirir.
        // Bu metot, listedeki bir öğeyi güncellemek için kullanılır. Metot, eski öğeyi döndürür.

        Integer a = ages.set(1, 25); //1.index'teki elemani 25 yapar
        System.out.println(a); //2
        System.out.println(ages); //25
    }
}
