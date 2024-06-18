package practice07.inheritance02;

public class Runner {
    public static void main(String[] args) {

        Corsa araba1 = new Corsa();
        System.out.println(araba1.hareket);  //araba
        System.out.println("araba1.marka = " + araba1.marka);  //opel
        System.out.println("araba1.hiz = " + araba1.hiz);   //corsa

        //!!! fieldlarda referance data tipinden başlar
        //yoksa parentlara bakar, ilk buldugu degeri getirir

        araba1.motor();  //Corsa arabalar çevreci motor kullanır. Corsa class'indan
        araba1.yakitTuketimi(); //Opel class'indan

        Opel araba2 = new Corsa();
        System.out.println("araba2.hareket = " + araba2.hareket); //Araba class'indan
        System.out.println("araba2.hiz = " + araba2.hiz);//Opel class'indan
        araba2.motor(); //Corsa

        Opel araba3 = new Astra();
        System.out.println("araba3.hiz = " + araba3.hiz);//Opel class'indan
        System.out.println("araba3.marka = " + araba3.marka); //Opel
        System.out.println("araba3.yakit = " + araba3.yakit); //Araba


        araba3.motor(); //opel cunku astrada motor() uretmedik

        //methodlarda referans data tipine bakılır
        //metod varsa constructor data tipine kadar
        //child classlarda override edilmişse
        //en son hali çağırılır.Override edilmediyse
        //mevcut metod çağrılır.

        Araba araba4 = new Corsa();
        System.out.println("araba4.hareket = " + araba4.hareket); //Araba
        //araba4.model-->arabada yok
        araba4.motor();  //Corsa
        araba4.yakitTuketimi(); //Opel
        //araba4.garanti();-->yok dedenin kendinde özellik yoksa evladının geliştirdigi ozelligi kullanamaz

        araba4=new Opel();
        araba4=new Astra();


    }
}
