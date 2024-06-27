package d33lambda;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class Lambda01 {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<Integer>(Arrays.asList(15,14,9,13,4,9,2,4,14));
        elemanYazdir(list);
        System.out.println("");
        ciftYazdir(list);
        System.out.println("");
        tekKareYazdir(list);
        System.out.println("");
        tekrarsizKupYazdir(list);
        System.out.println("");
        farkliCiftSayiKareToplam(list);
        farkliCiftSayiKupCarpim(list);
        farkliTersSirala(list);
        maxDeger(list);
    }

    //1)List'in elemanlarini aralarinda bosluk birakarak yanyana yazdır.
    private static void elemanYazdir(List<Integer>list) {
        list.stream().forEach(Utils::printInTheSameLineWithSpace);
    }

    //2)Listin elemanlarindan cift olanlari aralarinda bosluk birakarak yanyana yazidr
    private static void ciftYazdir(List<Integer>list) {
        list.stream().filter(Utils::ciftMi).forEach(Utils::printInTheSameLineWithSpace);
    }

    //3)Listteki tek sayilarin karelerini alip aralarinda bosluk birakarak yanyana yazdir
    private static void tekKareYazdir(List<Integer>list) {
        list.stream().filter(Utils::tekMi).map(Utils::kareAl).forEach(Utils::printInTheSameLineWithSpace);
    }
    //4)Listteki tekrarli olanlari silip tek sayilarin kuplerini alip aralarinda bosluk birakarak yanyan yazidr
    private static void tekrarsizKupYazdir(List<Integer>list) {
        list.stream().distinct().filter(Utils::tekMi).map(Utils::kupAl).forEach(Utils::printInTheSameLineWithSpace);
    }
    //5)Farkli cift sayilarin karelerinin toplamini yazdir

    private static void farkliCiftSayiKareToplam(List<Integer>list) {
        int toplam =list.stream().distinct().filter(Utils::ciftMi).map(Utils::kareAl).reduce(0,Math::addExact);
        System.out.println(toplam);
    }
    //6)Farkli cift sayilarin kuplerinin carpimini yazdir
    private static void farkliCiftSayiKupCarpim(List<Integer>list) {
        int carpim = list.stream().distinct().filter(Utils::ciftMi).map(Utils::kupAl).reduce(1,Math::multiplyExact);
        System.out.println(carpim);
    }
    //7)Listteki farklı ve 5ten buyuk ve cift elemanlarinin yarisini alip ters siralayarak list olarak yazdir
    private static void farkliTersSirala(List<Integer>list) {
        List<Double> a = list.stream().distinct().filter(t->t>5&&t%2==0).map(Utils::yarisiniAl).sorted(Comparator.reverseOrder()).collect(Collectors.toList());
        System.out.println(a);
    }

    //8)Listteki en buyuk elemani bul.
    private static void maxDeger(List<Integer>list) {
        int max = list.stream().reduce(Math::max).get();
        System.out.println(max);

        list.stream().sorted(Comparator.reverseOrder()).limit(1).forEach(Utils::printInTheSameLineWithSpace);
    }
}
