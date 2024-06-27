package d33lambda;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Lambda02 {
    public static void main(String[] args) {
        List<Integer> list=new ArrayList<>(Arrays.asList(7,12,14,4,9,2,4,12,16));
        ilkDortEleman(list);
        System.out.println();
        ilkDortElemaniAtla(list);
        System.out.println();
        araElemanYazdir(list);

    }

    //1)Kucukten buyuge sirala sonra ilk 4 elemani yazdir
    public static void ilkDortEleman(List<Integer> list){
        list.stream().sorted().limit(4).forEach(Utils::printInTheSameLineWithSpace);
    }

    //2)Kucukten buyuge sirala ilk 4 elemani atla
    public static void ilkDortElemaniAtla(List<Integer> list){
        list.stream().sorted().skip(4).forEach(Utils::printInTheSameLineWithSpace);
    }

    //limit(): listin ilk kaç elemanini yazdirmak istersek limit icine yazariz
    //skip(): listin ilk kaç elemanini atlamak istersek skip içine yazariz

    public static void araElemanYazdir(List<Integer> list){
        list.stream().sorted().skip(3).limit(3).forEach(Utils::printInTheSameLineWithSpace);
        System.out.println();
        list.stream().sorted().limit(6).skip(3).forEach(Utils::printInTheSameLineWithSpace);
        //ustteki iki yol da ayni sonuca cikiyor
    }
}
