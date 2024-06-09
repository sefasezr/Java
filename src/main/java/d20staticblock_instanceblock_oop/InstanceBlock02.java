package d20staticblock_instanceblock_oop;

public class InstanceBlock02 {

    public int year;

    //Instance Block
    {
        System.out.println("Herkese Merhaba");
    }

    public InstanceBlock02() {
        //Buradaki kodu instance block icine aldik       Herkese Merhaba
    }
    public InstanceBlock02(int year) {
        //Buradaki kodu instance block icine aldik       Herkese Merhaba
        this.year = year;
    }


}
