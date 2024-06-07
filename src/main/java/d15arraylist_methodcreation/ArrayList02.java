package d15arraylist_methodcreation;

import java.util.ArrayList;

public class ArrayList02 {
    public static void main(String[] args) {

        // Bir String ArrayList olusturun ve a iceren elemanlari silin.

        ArrayList<String> r = new ArrayList<>();

        r.add("Manisa");
        r.add("Nigde");
        r.add("Tokat");
        r.add("Van");
        System.out.println(r); //[Manisa, Nigde, Tokat, Van]

/*        for (String w : r) {
            if (w.contains("a")) {
                r.remove(w);
            }
        }
        System.out.println(r); HATA-calismaz*/

        for (int i = 0; i < r.size(); i++) {
            if(r.get(i).contains("a")){
                r.remove(i);
                i--;
            }
        }
        System.out.println(r);

        //ODEV: Bu soruyu i’yi son index’ten baslatarak ta cozebilirdik.i-- yazmaya
        // gerek kalmazdi. Nasil?

        ArrayList<String> a = new ArrayList<>();

        a.add("Manisa");
        a.add("Nigde");
        a.add("Tokat");
        a.add("Van");
        System.out.println(a);

        for (int i = a.size()-1; i>=0; i--){
            if (a.get(i).contains("a")){
                a.remove(i);
            }
        }
        System.out.println(a);


    }
}
