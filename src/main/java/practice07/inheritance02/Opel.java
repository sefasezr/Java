package practice07.inheritance02;

public class Opel extends Araba{

    //hareket,hiz,yakit,marka ve motor,yakitTuketimi davranislari var
    protected String hiz="Opel arabalar max. 220KM hiz yapar";
    protected String marka="Opel";

    protected String sirketMerkezi="Almanya";

    @Override
    protected void motor() {
        System.out.println("Opel arabalar opel marka motora sahiptir");
    }

    @Override
    protected void yakitTuketimi() {
        System.out.println("Opel arabalar daha az yakıt tuketir");
    }

    protected void garanti(){
        System.out.println("Opel arabalar en az 2 yıl garantilidir.");
    }
}
