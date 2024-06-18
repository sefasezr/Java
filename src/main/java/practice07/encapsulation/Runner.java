package practice07.encapsulation;
//Mete, Han, 25 ozelliklerine sahip bir obje olusturunuz ve yazdiriniz
//objenin yasinı 30 olarak guncelleyin
//paranetresiz cons kullanarak 2. bir gbie elusturun
//Ayse, Yilmaz, 40 degerlerini atayin
//yas’ı -5 olarek guncelleyin
//yas negatif deger olamayacak sekilde set methodunu quncelleyin
//isim ve soyismin sadece ilk harfi okunsun diğerleri * olsun,
//getter metodunda gerekli düzeltmeyi yapınız.
public class Runner {
    public static void main(String[] args) {
        Student student = new Student();//isim:null, soyisim:null, yas:0
        // student.isim="Ali";

        Student student2 = new Student("Ali","Can",25);//isim:Ali, soyismi:Can, yas:25
        //student2.isim
        System.out.println(student2.getIsim());

        student2.setIsim("Veli");

        System.out.println(student2.getIsim());

        System.out.println(student2);
        student2.setYas(10);
        System.out.println(student2.getYas());

    }
}
