package d22oop;

public class HondaRunner {
    public static void main(String[] args) {

        //Honda h = new Honda(); //HATA- 'Honda' is abstract; cannot be instantiated
        //Abstract class'lardan object uretemezsiniz

        Civic c = new Civic();
        c.engine();
        c.music();

        Accord a = new Accord();
        a.engine();
        a.music();

        Honda car;
        car = new Civic();

    }
}
