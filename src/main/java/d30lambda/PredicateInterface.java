package d30lambda;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class PredicateInterface {
    public static void main(String[] args) {

        /*4- Predicate<T> arayüzü, bir parametre alır ve bir boolean değer döndürür.
        Filtreleme işlemleri için kullanışlıdır*/

        //Ornek: PredicateInterface adinda bir class acarak, verilen listteki cift sayilari
        // yazdiran bir method olusturalim.
        //Example: Let's create a method that prints even numbers in the given list by opening
        // a class called PredicateInterface.

        //collect(Collectors.toList()) ifadesi, Java Stream API'de bir Stream'i bir
        // Liste dönüştürmek için kullanılır.

        List<Integer> numbers = Arrays.asList(1,2,3,4,5,6);
        Predicate<Integer> isEven = x -> x % 2 == 0;

        List<Integer> evens = numbers.stream().filter(isEven).collect(Collectors.toList());
        System.out.println(evens);
    }
}
