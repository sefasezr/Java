package d22oop;

public class StudentRunner {
    public static void main(String[] args) {
        Student s = new Student();
        System.out.println(s.getAge());
        System.out.println(s.isSuccesfull());

        s.setAge(25);
        s.setSuccesfull(false);
        System.out.println(s.getAge());
        System.out.println(s.isSuccesfull());

        //Kullanici bazinda erisim kontrolu;
        //RBAC , AOP

        //Encapsulation'da bir object olusturup,iki object gibi kullaniyoruz.
        //Kaliptan istedigimiz kadar boyle olusturabiliriz.
        //Memory problemini onler. Bircok object memoryi doldururdu.

        //getter ve setter metodlarına sahip class’lar sıkça JavaBeans olarak da adlandırılır.
        // (Java bean aslinda ozel bir class turudur.)

        //Soru 1:  encapsulation’da set ile verileri degistirebiliyoruz. constructorlar ile de degistirebiliyoruz. Farki nedir?
        //Soru 2: set method birkac parametre alir mi?
        //Soru 3: encapsulation da private ile gizlenen bir veri baska package'dan set method ile degistirilebilir mi?



    }

}
