package d30lambda;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class Lambda02 {
    public static void main(String[] args) {
        List<Integer> nums = new ArrayList<>(Arrays.asList(2,2,4,5,11,10));
        //printCubeOfDistinctOddElements(nums);
        //printSumOfSquaresOfDistinctEvenElements(nums);
        //print(nums);
        //maksimum1(nums);
        //maksimum3(nums);
        //maksimum4(nums);
        //minimum1(nums);
        minimum2(nums);

    }
    //-----------------------------
    //ornek 2: Bir tamsayı listesi alan ve listedeki tek sayıların karelerini, aynı satırda,
    // aralarına boşluk koyarak yazdıran bir method oluşturunuz.(Functional)
    //example 2: Create a method that takes a list of integers and prints the squares of
    // the odd numbers in the list on the same line with a space between them.(Functional)

    //map(): Elemanları dönüştürmek için kullanılır.

    public static void printSquareOfOddElements(List<Integer> nums) {


        nums.stream().filter(t -> t % 2 != 0).map(t -> t*t).forEach(t -> System.out.print(t + " "));



    }

    //3) Bir tamsayı listesindeki tek sayıların küplerini, tekrarlanmadan, aynı satırda, aralarına boşluk koyarak yazdıran bir method oluşturunuz.(Functional)
    //3) Create a method that prints the cubes of odd numbers in a list of integers, without repeating, on the same line, with spaces between them. (Functional)
    //distinct() metodu, bir akistaki tekrar eden ogeleri kaldirmak icin kullanilir

    //ornegin 1,2,2,3,3,3,4,4,5 olani 1,2,3,4,5

    public static void printCubeOfDistinctOddElements(List<Integer> nums){
        nums.
                stream().
                distinct().
                filter(t -> t%2 !=0).
                map(t ->t*t*t).
                forEach(t -> System.out.print(t + " "));
    }

    //4)Bir listedeki tekrarlanmayan çift sayıların karelerinin toplamını hesaplayan bir method oluşturunuz.
    //4)Create a method that calculates the sum of squares of non-repeating even numbers in a list.

    //reduce()azaltmak: Koleksiyon elemanlarını tek bir değere indirger.
    //ornegin iki sayiyi toplayibca tek bir sonuc elde ederiz. 3+5 = 8;

    public static void printSumOfSquaresOfDistinctEvenElements(List<Integer> nums){
        //int toplam = nums.stream().distinct().filter(t -> t % 2 == 0).map(t -> t*t).reduce(0,(t,u) -> t+u);
        int toplam = nums.stream().distinct().filter(t -> t % 2 == 0).map(t -> t*t).reduce(0,Integer::sum);
        System.out.println(toplam);

        //reduce(0, (t,u) -> t+u); deki 0 etkisiz elemandir. carpma olsa 1 koyardik
        //t: Şu ana kadar hesaplanmış olan ara toplam. İlk iterasyonda, bu değer başlangıç değeri olan 0’dır.
        //u: Ilk elemandir
        //(t,u) -> t+u: İki girdi alarak tek bir çıktı üreten bir lambda ifadesidir.

        //İlk iterasyonda:
        //t=0 (başlangıç değeri olarak belirtildiği için)
        //u=4 (ilk eleman)
        //t+u = 4

        //İkinci iterasyonda:
        //t=4 (önceki adımdan gelen sonuç)
        //u=100 (ikinci eleman)
        //t+u = 104

        /*Java'da method reference, lambda ifadelerine bir alternatif olarak sunulan bir özelliktir.
    Method reference, zaten tanımlanmış bir metodu doğrudan bir fonksiyonel arayüze atamak için kullanılır.
    Bu, bazen bir lambda ifadesinden daha okunabilir bir kod yazmamıza olanak tanır.*/


    }

    //5) Bir listedeki tüm tekrarlanmayan çift sayıların karelerinin çarpımını hesaplayan bir method oluşturunuz.
    //5) Create a method that calculates the product of the squares of all non-repeating even numbers in a list.

    public static void print(List<Integer> nums){
        int carpim = nums.stream().distinct().filter(t -> t % 2 == 0).map(t-> t*t).reduce(1,(t,u) -> t*u);
        System.out.println(carpim);
    }

    //6)Verilen List’teki maksimum değeri bulmak için bir method oluşturun.
    //6)Create a method to find the maximum value in the given List

    //1.Yol:
    //Integer.MIN_VALUE: Bu, int tipinin alabileceği en küçük değeri verir (-2^31 dir)

    public static void maksimum1(List<Integer> nums){
        int max = nums.stream().distinct().reduce(Integer.MIN_VALUE,(t,u) -> t>u? t : u);
        System.out.println(max);
    }

    //2.yol:
    public static void maksimum2(List<Integer> nums) {

        //2, 2, 4, 5, 11, 10
        int max = nums.stream().distinct().reduce(nums.get(0), (t, u) -> t > u ? t : u);
        System.out.println(max);

    }

    //3.yol
    //sorted(): Koleksiyonu belirli bir kritere göre sıralar.(naturel order. kucukten buyuge)
    public static void maksimum3(List<Integer> nums) {
        //reduce bir Optional döndürür. Bu, sonucun var olabileceği veya olmayabileceği anlamına gelir.
        //Bu nedenle sonucu almak için get() metodu kullanılır.

        Integer max = nums.stream().distinct().sorted().reduce((t,u) -> u).get();
        System.out.println(max);
    }

    //4.yol best practice

    public static void maksimum4(List<Integer> nums) {
        //Java’da :: işareti, “Method Reference” olarak adlandırılır.
        // Bir metodun doğrudan referansını alarak lambda ifadeleri yazmadan kullanmanızı sağlar.

        Integer max = nums.stream().distinct().reduce(Math::max).get();
        System.out.println(max);
    }

    //7)Verilen List’teki minimum değeri bulmak için bir method oluşturun.
    //7)Create a method to find the minimum value in the given List

    public static void minimum1(List<Integer> nums) {
        Integer min = nums.stream().distinct().sorted().reduce((t,u)->t).get();
        System.out.println(min);
    }

    public static void minimum2(List<Integer> nums) {
        Integer min = nums.stream().distinct().reduce((t,u)->t>u?u:t).get();
        System.out.println(min);
    }

    //sorted(Comparator.reverseOrder()) ifadesi,
    // Java Stream API’si içinde bir koleksiyonu ters sıralamak için kullanılır.
    //Comparator class, reverseOrder() methoddur.

    public static void minimum3(List<Integer> nums) {
        //2,3,4,5,11,10 //reverse => 11,10,5,4,3,2
        Integer min = nums.stream().distinct().sorted(Comparator.reverseOrder()).reduce((t,u)->u).get();
        System.out.println(min);
    }




}
