package d30lambda;

import java.util.ArrayList;
import java.util.List;

public class Lambda03 {
    public static void main(String[] args) {
        List<String> myList = new ArrayList<String>();
        myList.add("Ali");
        myList.add("Elif");
        myList.add("Yusuf");
        myList.add("Elif");
        myList.add("Zeynep");
        myList.add("Mustafa");

        notStartsWithE(myList);

    }

    //ODEV:
    //ornek 9: Bir listedeki "E" harfiyle başlamayan tüm öğeleri konsola yazdıran bir yöntem oluşturun.
    //example 9: Create a method that prints to the console all items in a list that do not start with the letter "E".

    public static void notStartsWithE(List<String> myList) {
        //myList.stream().filter(t->!t.startsWith("E")).forEach(System.out::println);
        myList.stream().filter(t->!t.startsWith("E")).forEach(t-> System.out.print(t+" "));
        //Ustteki alt alta alttaki yanyana yazdırıyor..
    }

}
