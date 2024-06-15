package d26maps_exceptions;

public class Maps01 {
    public static void main(String[] args) {

        //Thread Safe, Multi Thread, Synchronized kavramlarini inceleyelim

        /*
        Thread Safe: Aynı anda birçok iş parçacığı tarafından güvenli bir şekilde erişilebilen yapılar.
        Veri yarışlarını ve tutarsızlıkları önler.

        Multi Thread: Aynı anda birden fazla iş parçacığı tarafından çalıştırılabilen programlar.
        Paralel işleme ve performans artışı sağlar.

        Synchronized: Aynı anda sadece bir iş parçacığı tarafından erişilebilen metodlar veya kod blokları.
        Eşzamanlılık sorunlarını ve veri tutarsızlıklarını önler.
        */

        /*HashMap, HashTable ve ConcurrentHashMap arasindaki fark nedir?

        1- HashMap
        a) Thread Safety:
            Thread-safe değildir.
            Çok iş parçacıklı (multi-threaded) ortamda veri tutarsızlıkları olabilir.
        b) Multi Thread:
            Tek iş parçacıklı (single-threaded) ortamlar için idealdir.
            Çok iş parçacıklı ortamlar için harici senkronizasyon gerektirir.
        c) Synchronized:
            Synchronized değildir, yani aynı anda birden fazla iş parçacığı tarafından erişilebilir.
        d) Null Key/Value:
            Bir null key ve birden fazla null value kabul eder.
        e) Performans:
            En hızlısıdır çünkü synchronized değildir.
         */
        //---------------------
        /*
        2- Hashtable
        a) Thread Safety:
            Thread-safe'tir.
            Synchronized yapısı nedeniyle aynı anda sadece bir iş parçacığı tarafından kullanılabilir.
        b) Multi Thread:
            Çok iş parçacıklı (multi-threaded) ortamlar için uygundur.
        c) Synchronized:
            Synchronized'dir, yani tüm metotlar synchronized olarak işaretlenmiştir ve aynı anda sadece bir iş parçacığı tarafından erişilebilir.
        d) Null Key/Value:
            Ne null key ne de null value kabul eder. NullPointerException atar.
        e) Performans:
            HashMap'ten daha yavaştır çünkü synchronized'dir ve her erişim için kilitlenir.
        */

        /*
        3- ConcurrentHashMap
        a) Thread Safety:
            Thread-safe'tir.
            Segment-based locking kullanarak senkronizasyon sağlar.
        b) Multi Thread:
            Çok iş parçacıklı (multi-threaded) ortamlar için idealdir.
            Aynı anda birden fazla iş parçacığı tarafından güvenli bir şekilde kullanılabilir.
        c) Synchronized:
            Synchronized'dir, ancak segment-based locking sayesinde daha iyi performans sunar.
        d) Null Key/Value:
            Ne null key ne de null value kabul eder. NullPointerException atar.
        e) Performans:
            HashTable'dan daha hızlıdır çünkü segment-based locking kullanır.
            Çok iş parçacıklı ortamlar için optimize edilmiştir.

        Not:HashMap, Hashtable ve ConcurrentHashMap'teki entry'ler, hash kodlarına göre bucket’lara yerleştirilir.
         Bu nedenle, eklenme sırasına göre erişemeyeceğiniz gibi rastgele bir sıralama da garanti edilmez.
        */
        //---------------------------
        /*HashMap, Hashtable ve ConcurrentHashMap ne zaman kullanılir?

        1- HashMap:
        Tek iş parçacıklı uygulamalar için idealdir  çünkü synchronized değildir(ek bir işlem ve zaman gerektirmez)
        Çok iş parçacıklı ortamda kullanılacaksa, dış senkronizasyon mekanizmaları ile korunmalıdır.

        2- Hashtable:
        Eski kod tabanları ve miras uygulamalar için uygundur(Varolan bir kod tabanını korumak veya mevcut bir projeyi
        güncellemek zorunda olduğunuz durumlar)
        Yeni projeler için genellikle önerilmez çünkü daha modern ve performanslı alternatifler vardır.

        3- ConcurrentHashMap:
        Modern ve yüksek performanslı çok iş parçacıklı uygulamalar için en iyi seçenektir.
        (Web sunucuları, veri işlem sistemleri, yüksek trafikli uygulamalar)
        Thread safety ve performansın önemli olduğu her durumda tercih edilir.*/
        //---------------------
    }
}
