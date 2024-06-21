package d28exceptions_enum_iterators;

import java.util.Arrays;
import java.util.Scanner;

public class EnumRunner {
    public static void main(String[] args) {

        //Cities c = new Cities();  Enum yapisindan object olusturamazsiniz




        //1-Enumdaki bir sabite nasil ulasabiliriz?
        Cities il = Cities.GİRESUN;
        System.out.println(il);

        //2- BURSA sabitinin ismine ulasalim

        String ilIsmi = Cities.BURSA.getCityName();
        System.out.println(ilIsmi);

        //3- Ankaranın posta koduna ulasalim
        String postaCode = Cities.ANKARA.getPostalCode();
        System.out.println(postaCode);

        //4- Antalyanın plaka koduna ulasalim
        int plateCode = Cities.ANTALYA.getPlateCode();
        System.out.println(plateCode);

        //Kullanicidan bir ilin plaka kodunu larak bunun hangi il oldugunu console a yazdirin

        Scanner scan = new Scanner(System.in);
        int plaka = scan.nextInt();
        Cities [] sehirler = Cities.values();
        //System.out.println(Arrays.toString(sehirler)); //[ADANA, ADIYAMAN, AFYONKARAHİSAR, AĞRI, AMASYA
        if(plaka<1 || plaka >81){
            System.out.println("Lutfen 1 ile 81 arasi bir plaka kodu giriniz");
        }else{
            for (Cities cities : sehirler) {
                if(cities.getPlateCode() == plaka){
                    System.out.println("Girmis oldugunuz plaka " + cities.getCityName() + " iline aittir");
                    break; //break olmasa Java'nın iş yuku artardı, dongu sona kadar çalisirdi
                }

            }
        }

    }



}
