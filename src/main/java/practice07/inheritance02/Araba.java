package practice07.inheritance02;

public class Araba {
    // Araba, Opel, Corsa adinda farkli class'lar olusturunuz.

// Opel class'ı:Araba class'ina baglı olacak

// Corsa class'a Opel class'ina baglı olacak

// Araba class'ina genel bilgileri, variable ve method olarak yaziniz.

// Opel class'ina gerekli bilgileri, variable ve method olarak yaziniz.

// Corsa class'ına en spesifik bilgileri, variable ve method olarak yaziniz.
// Corsa class'indan obje olusturarak variablelara ve methodlara yazdiriniz.

    protected String hareket="Arabalar tekerlek ile hareket eder";
    protected String hiz="Arabalar motor gücüne göre hıza sahiptir";
    protected String yakit="Arabalar farklı türde yakıt tüketirler";
    protected String marka="Arabalar üretildikleri firmanın markasına sahiptir";

    protected void motor(){
        System.out.println("Arabalar farlı markalarda motorlara sahiptir.");
    }
    protected void yakitTuketimi(){
        System.out.println("Arabalar yakit tuketir.");
    }
}
