package d29iterators_lambda;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

public class ConsumerInterface {
    public static void main(String[] args) {
        /*2- Consumer<T> Fonksiyonel arayüzünün tek soyut metodu void accept(T t) şeklindedir.
        Bu metod, bir T türünden nesne alır ve herhangi bir şey döndürmez.
        Örneğin, bir liste üzerinde işlem yapmak için kullanılabilir*/

        //Ornek: ConsumerInterface adinda bir class acarak, verilen listteki elemanlari
        // ayri satirlarda konsola yazdiralim.
        //Example: Let’s create a class called ConsumerInterface and write the
        // elements in the given list to the console in separate lines.

        List<Integer> numbers = Arrays.asList(1,2,3,4,5);
        Consumer<Integer> printConsumer = x -> System.out.println(x);
        numbers.forEach(printConsumer);
    }
}
