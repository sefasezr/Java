package d15arraylist_methodcreation;

import java.util.ArrayList;
import java.util.List;

public class ArrayList01 {
    public static void main(String[] args) {

        // Tekrarli elemanlari olan bir listten tekrarsiz elemanlari olan bir list elde ediniz

        ArrayList<Integer> list = new ArrayList<>();
        list.add(2);
        list.add(3);
        list.add(2);
        list.add(5);
        list.add(3);

        for (int i = 0; i < list.size(); i++) {
            for (int j = i+1; j < list.size(); j++) {
                if(list.get(i).equals(list.get(j))){
                    list.remove(j);
                }
            }
        }
        System.out.println(list);
        List<Character> a = new ArrayList<>();
        a.add('J');
        a.add('a');
        a.add('v');
        a.add('a');
        a.add('v');
        System.out.println(a); //[J, a, v, a, v]

        List<Character> b = new ArrayList<>();

        //[J, a, v, a, v]
        for (Character w : a) {

            if (!b.contains(w)) { //b listinde donguden gelen eleman yoksa
                b.add(w); //b listine gelen elemani ekler
            }
        }
        System.out.println(b); //[J, a, v]

    }
}
