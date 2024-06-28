package d34lambda;

import d31lambda.Utils;

import java.util.stream.IntStream;

public class Lambda01 {
    public static void main(String[] args) {
        //1) 1'den 20ye kadar olan sayilari yazdirin

        IntStream.rangeClosed(1,20).forEach(Utils::printInTheSameLineWithSpace);
        System.out.println();
        //2) functional programlamayi kullanarak 3den 98e kadar olan cift tam sayilarin toplamini bulu

        int toplam = IntStream.rangeClosed(3,98).filter(t->t%2==0).reduce(Math::addExact).getAsInt();
        int toplam2 = IntStream.rangeClosed(3,98).filter(Utils::ciftMi).sum();
        System.out.println(toplam);
        System.out.println(toplam2);

        //3) 9! i bul

        int faktoriyelCarpim = IntStream.rangeClosed(1,9).reduce(Math::multiplyExact).getAsInt();
        System.out.println(faktoriyelCarpim);

        //4) ilk 7 çift sayma sayısının çarpımını bulun

        int yediCiftCarpim= IntStream.rangeClosed(2,2*7).filter(Utils::ciftMi).reduce(1,Math::multiplyExact);
        System.out.println(yediCiftCarpim);

        //5) 6'dan buyuk ilk 15 tek sayma sayisinin toplamini bulun
         int onBesToplam = IntStream.iterate(7,t->t+2).limit(15).sum();
        System.out.println(onBesToplam);
        //6) ilk 23 tek sayma sayisinin toplamini bulunuz
        int yirmiUcToplam = IntStream.iterate(2,t->t+2).limit(23).sum();
        System.out.println(yirmiUcToplam);

        //7) (11,33) arasındaki her tam sayının rakamlarının toplamını hesaplamak için bir metod oluşturun
        int rakamlarTop = IntStream.rangeClosed(11,22).map(Utils::rakamlarToplami).sum();
        System.out.println(rakamlarTop);
        IntStream.rangeClosed(11,33).map(Utils::rakamlarToplami).forEach(Utils::printInTheSameLineWithSpace);




    }
}
