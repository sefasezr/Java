package d30lambda;

import java.util.function.Supplier;

public class SupplierInterface {
    public static void main(String[] args) {

        /*3- Supplier<T> arayüzü, parametre almaz ve bir değer döndürür.
        Rastgele veya sabit bir değer döndürmek için kullanılabilir.*/

        //Ornek: SupplierInterface adinda bir class acarak rastgele sayi ureten bir method olusturalim.
        //Example: Let's create a class called SupplierInterface and create a method that generates a random number

        Supplier <Double> randomSupplier = () -> Math.random();
        System.out.println("Random number : "+randomSupplier.get());

    }
}
