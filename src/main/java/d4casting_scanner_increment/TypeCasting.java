package d4casting_scanner_increment;

public class TypeCasting {
    public static void main(String[] args) {

        /*Sayisal primitive data tiplerinin birbirine donusturulmesine Type Casting denir
        Numeric (sayisal) Data Type ==> byte -      short -       int -         long -          float -        double */

        /*Not 1: Kucuk data type’larini buyuk data type’larina cevirmeyi Java otomatik olarak yapabilir.
        Bu isleme “AutoWidening“ (Otomatik genisletme) denir*/

        /*Not 2: Buyuk data type’larini kucuk data type’larina cevirmek riskli bir istir. Veri kaybi olusabilir.
        Java bu isi otomatik olarak yapmaz. Bu islemi kod yazanlar yapar.
        Bu isleme "Explicit Narrowing“(Aciktan Daraltma)denir.*/

        //Ornek 1: byte data type' ini int data type'ina ceviriniz. ==> AutoWidening
        //Example 1: Convert byte data type to int data type.

        byte age = 13;

        int ageInt = age;

        //Ornek 2: int data type' ini short data type' ina ceviriniz.
        //Example 2: Convert int data type to short data type.

        int weight = 313;

        short weightShort = (short) weight;

        /*Java’da tip dönüşümü (Type Casting) genellikle soyle senaryolar için gereklidir:

        1- Daha Büyük bir Türden Daha Küçüğe İhtiyaç Duyulduğunda:
        Örneğin, double bir değeri int türüne dönüştürmek isteyebilirsiniz.
        Bu tür dönüşümleri genellikle bilgi kaybı riskini taşır.

        2-Farklı Türler Arasında Uyumluluk Sağlamak için: Farklı türlerdeki değişkenleri veya nesneleri
        bir araya getirmek gerektiğinde tip dönüşümü yapılır.

        3-Polimorfizmde Child Class’lar ve Parent Class’lar Arasında Dönüşüm: OOP'da (Nesne Yönelimli Programlama),
        bir child class objesini, parent class türüne dönüştürmek ya da tam tersi bir işlem yapılabilir.

        4-API Kullanımında: Bazı Java API'leri belirli türlerde veri bekler. Örneğin, bir metod sadece
        int türünde bir parametre kabul ediyorsa, fakat sizin float tipinde bir değişkeniniz varsa,
        tip dönüşümü yapmanız gerekecektir.

        5-Matematiksel Hesaplamalarda: Farklı türden sayıları matematiksel bir işlemde bir araya getirmek
         gerektiğinde, tip dönüşümüne ihtiyaç duyulabilir.*/

    }
}
