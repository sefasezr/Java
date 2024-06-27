package d33lambda;

import KahveMak.SiparisOzellikleri;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Arrays;

public class Lambda03 {
    public static void main(String[] args) {
        List<String> list = new ArrayList<String>(Arrays.asList("Ali","Ali","Aysima","Abdurrahman","Mehmet","Mustafa","Bedirhan","Yüksel","Süleyman"));
        yazdirBuyuk1(list);
        System.out.println();
        uzunlugaGoreSirala(list);
        System.out.println();
        farkliSonHarfSirala(list);
        System.out.println();
        uzunlukSiralaIlkEleman(list);
        System.out.println();
        yazdirAIleBaslayan(list);
        System.out.println();
        uzunlukBuyukHarf(list);
        System.out.println();
        isimUzunlukSirala(list);
        System.out.println();
        karesiniAlSiralaSil(list);
        System.out.println();
        sondanIkinciSiralaIlk(list);
        terstenSiralaIlk(list);
    }

    //1)List'in elemanlarini buyuk harfle yazdir
    private static void yazdirBuyuk1(List<String> list){
        list.stream().map(String::toUpperCase).forEach(Utils::printInTheSameLineWithSpace);
    }
    //2)Elemanları uzunluklarına gore sırala ve yazdır

    private static void uzunlugaGoreSirala(List<String> list){
        list.stream().sorted(Comparator.comparing(String::length)).forEach(Utils::printInTheSameLineWithSpace);
        //tersten siralamak icin ise;
        System.out.println();
        list.stream().sorted(Comparator.comparing(String::length).reversed()).forEach(Utils::printInTheSameLineWithSpace);
    }

    //3)Farklı elemanlarını son harflerine gore siralayip yazdir

    private static void farkliSonHarfSirala(List<String> list){
        list.stream().distinct().sorted(Comparator.comparing(t->t.substring(t.length()-1))).forEach(Utils::printInTheSameLineWithSpace);
    }
    //4)Elemanlari uzunluklarina ve ardindan (ayni uzunlukta olanlari) ilk karakterlerine gore siralamak icin bir yontem olsuturun

    private static void uzunlukSiralaIlkEleman(List<String> list){
        list.add("Ahu");
        list.add("Ala");
        list.add("Ata");
        list.stream().sorted(Comparator.comparing(String::length).thenComparing(t->t.substring(0,1)).thenComparing(t->t.substring(1,2)).thenComparing(t->t.substring(2,3))).forEach(Utils::printInTheSameLineWithSpace);
    }

    //Buyuk harflerle "A" ile baslayan liste ogelerini yazdirmak icin bir yontem

    private static void yazdirAIleBaslayan(List<String> list){
        list.stream().map(String::toUpperCase).filter(t->t.startsWith("A")).forEach(Utils::printInTheSameLineWithSpace);
    }

    //Öğeleri uzunluklarına gore siraladiktan sonra buyuk harfle yazdirmak icin bir yontem olusturun

    private static void uzunlukBuyukHarf(List<String> list){
        list.stream().sorted(Comparator.comparing(String::length)).map(String::toUpperCase).forEach(Utils::printInTheSameLineWithSpace);
    }

    //Elemanları uzunluklarına gore siralayin once elemani sonra uzunlugunu yazdirin

    private static void isimUzunlukSirala(List<String> list){
        list.stream().sorted(Comparator.comparing(String::length)).forEach(t-> System.out.print(t+" : "+t.length()+" "));
    }

    //her elemanın uzunlugunun karesini alip tekrarlilari sil, bunlarin 20den buyuk olanlarini ters sirada yazdirin

    private static void karesiniAlSiralaSil(List<String> list){
        list.stream().map(t->t.length()*t.length()).distinct().filter(t->t>20).sorted(Comparator.reverseOrder()).forEach(Utils::printInTheSameLineWithSpace);
    }

    //elemanlari sondan 2.elemanlarina gore siralayip ilk elemani yazdir

    private static void sondanIkinciSiralaIlk(List<String> list){
        String ilk = list.stream().sorted(Comparator.comparing(t->t.charAt(t.length()-2))).findFirst().get();
        System.out.println(ilk);
    }

    //elemanlari uzunluklarina gore tersten siralayip ilk elemani yazdir

    private static void terstenSiralaIlk(List<String> list){
        System.out.println(list.stream().sorted(Comparator.comparing(String::length).reversed()).findFirst().get());
    }

}
