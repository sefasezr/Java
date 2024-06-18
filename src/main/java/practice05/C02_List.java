package practice05;

import java.util.ArrayList;
import java.util.List;

public class C02_List {
    public static void main(String[] args) {
        /*
            Bir list oluşturunuz. 1'den 15'e kadar sayıları bu liste ekleyiniz.
            Daha sonra 10'dan buyuk olan tum elemanları 2 katına çıkarınız
        */
        //1.liste ekleme yolu

        List<Integer> liste = new ArrayList<Integer>();
        liste.add(1);
        liste.add(2);
        liste.add(3);
        liste.add(4);
        liste.add(5);
        liste.add(6);
        liste.add(7);
        liste.add(8);
        liste.add(9);
        liste.add(10);
        liste.add(11);
        liste.add(12);
        liste.add(13);
        liste.add(14);
        liste.add(15);

        /*for(int i = 0; i<liste.size();i++){
            if(liste.get(i)>10){
                liste.set(i,liste.get(i)*2);
            }
        }*/
        System.out.println(liste);

        for(int i : liste){
            if(i>10){
                liste.set(liste.indexOf(i),i*2);
            }
        }
        System.out.println(liste);
    }
}
