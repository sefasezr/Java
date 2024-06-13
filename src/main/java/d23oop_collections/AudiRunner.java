package d23oop_collections;

public class AudiRunner {
    public static void main(String[] args) {

        AudiA4 a4 = new AudiA4();
        a4.turbo();
        a4.analog();
        a4.esp();
        //a4.run();

        ((Engine)a4).run();
        //olusabilecek ambiguity problemini cozer
        //Engine interface'inden gelen run() methodu calisti

        //Engine.price = 5000; HATA cunku final

        System.out.println(AC.fiyat);
        System.out.println(Engine.fiyat);
        System.out.println(Brake.fiyat);

        Engine.speed();
        a4.power();











    }
}
