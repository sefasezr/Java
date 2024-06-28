package d34lambda;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class UniversiteLambdaRunner {
    public static void main(String[] args) {
        UniversiteLambda edebiyatBolum = new UniversiteLambda("FenEdebiyat","Edebiyat",97,128);
        UniversiteLambda iktisatBolum = new UniversiteLambda("IIBF","Iktisat",98,134);
        UniversiteLambda matematikBolum = new UniversiteLambda("FenEdebiyat","Matematik",95,142);
        UniversiteLambda ingilizceBolum = new UniversiteLambda("IngilizDili","Ingilizce",93,154);

        List<UniversiteLambda> uniList = new ArrayList<>();
        uniList.add(edebiyatBolum);
        uniList.add(iktisatBolum);
        uniList.add(matematikBolum);
        uniList.add(ingilizceBolum);

        //3) Ortalama puanı en yüksek olan kursu yazdırmak için bir yöntem oluşturun
        System.out.println(uniList.stream().sorted(Comparator.comparing(UniversiteLambda::getNotOrtalama).reversed()).findFirst().get());
        System.out.println("-----------------------");
        //4)Not ortalamasına gore artan sıralama yapıp ilk elemanı atla ve list olarak yazdir
        List<UniversiteLambda> yeniList = uniList.stream().sorted(Comparator.comparing(UniversiteLambda::getNotOrtalama)).skip(1).collect(Collectors.toList());
        System.out.println(yeniList);

    }
}
