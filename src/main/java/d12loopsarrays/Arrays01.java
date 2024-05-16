package d12loopsarrays;

import java.util.Arrays;

public class Arrays01 {
    public static void main(String[] args) {
         /*
            1)Coklu data saklamaya izin veren yapilardir. Ornegin sinifinizdaki ogrencilerin isimleri.
            2)Array'ler tek data tipi depolayabilirler.Yani bir int dizisi sadece int değerler,
            bir String dizisi sadece String değerler saklayabilir.
            3)Array olusturmak icin i)Data Tipi ii)Data sayisi (Dizi boyutu için belirtilebilecek maksimum değer,
            Integer.MAX_VALUE (yaklaşık 2 milyar) olarak sınırlıdır) soylenmelidir.

            4)Array'ler diger Collectionlardan hizlidir çünkü boyutları sabittir
            5)Array'ler diger Collectionlardan daha az memory kullanirlar cünkü ekstra metadata veya işlevselliği yoktur.
            6)Array’ler hem primitive veri tiplerini (int, char, double vb.) hem de Object referanslarını
            (örneğin, String, Integer yani wrapper turleri gibi) saklayabilir.
        */

        //Array olusturmak

        String[] stdNames1 = new String[3];
        //String stdNames2[] = new String[4];
        //System.out.println(stdNames1);
        //Arrays, Java da Array'lerle calismak icin kullanilan yardimci bir class'tir
        System.out.println(Arrays.toString(stdNames1)); //[null, null, null]

        //--------------------
        //ornek 1: 5 elemanli notes adinda, int bir arrray olusturunuz ve console’a yazdiriniz
        int[] notes = new int[5];
        System.out.println(Arrays.toString(notes)); //[0, 0, 0, 0, 0]

        //-----------------------
        //ornek 2: 10 elemanli integers adinda, Integer  bir array olusturunuz ve console’a yazdiriniz
        //Array’ler de non primitive (reference) veri tipleri de saklanabilir.

        Integer[] integers = new Integer[10];
        System.out.println(Arrays.toString(integers)); //[null, null, null, null, null, null, null, null, null, null]
        //-----------------------

        //ornek 3: 3 elemanli names adinda, String bir array olusturunuz ve console’a yazdiriniz
        String[] names = new String[3];
        System.out.println(Arrays.toString(names)); //[null, null, null]

        char[]chars = new char[5];
        System.out.println(Arrays.toString(chars));

        //-----------------------
        //Array'e eleman eklemek
        //index mantigiyla eklenir. 0 ilk index demektir

        names[0] = "Ali Can";
        names[2] = "Veli Han";
        names[1] = "Ayse Hanim";
        //names[3] = "Hasan Kaya"; HATA,3.index yok
        //names[0] = "Omer Can"; Olan bir index'e yeni eleman ekleyebilirsiniz. Hata vermez

        System.out.println(Arrays.toString(names));

        //Bir veriyi gormek icin ise;
        System.out.println(names[1]); //Ayse Hanim
        //--------------------------------------
        //Ornek 1: String array olusturun, icine 5 tane eleman ekleyin, tum elemanlarin
        //           icerdigi karakter sayilari toplamini ekrana yazdirin.

        //Example 1: Create a String array, add 5 elements to it, all elements have
        // display the sum of the number of characters it contains.

        String[] cities = new String[5];


        cities[0] = "Bayburt";
        cities[1] = "Sivas";
        cities[2] = "Denizli";
        cities[3] = "Adana";
        cities[4] = "Ankara";

        System.out.println(Arrays.toString(cities));

        //1.yol: for loop
        int totalChar = 0;

        for (int i = 0; i < cities.length; i++) { //length, field'dir ve alan okumasi yapar.Method degildir.Koseli parantez icindeki alani okur

            totalChar = totalChar + cities[i].length(); //length() bir method'dur

        }
        System.out.println(totalChar); //30

        //2.yol: for each loop (enhanced loop)

        //for-each loop, Array, yani coklu veri iceren yapilarda kullanilir.
        //for loop'taki baslangic, bitis, artirma, azaltma olaylarini dusunmeyiz
        //variable ismi olarak da genel kabul w’nun kullanilmasidir. (whatever)

        //Kalibini olusturalim
/*        for (DataType variable : Array yada collections){
            //calisacak kodlar
        }*/

        int sum = 0;
        //[Bayburt, Sivas, Denizli, Adana, Ankara]
        for (String w : cities) {

            sum = sum + w.length();

        }
        System.out.println(sum);


    }
}
