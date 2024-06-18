package practice07.inheritance02;

public class Corsa extends Opel{
    //hareket , hiz, yakit, marka, sirketMerkezi ve motor,yakitTuketimi,garanti

    public String hiz="Corsa arabalar max. hız 200 KM";

    public String yakit="Corsa arabalar benzinlidir";

    public String model="Corsa";


    @Override
    protected void motor() {
        System.out.println("Corsa arabalar çevreci motor kullanır.");
    }

    public void vitesSayisi(){
        System.out.println("Corsa arabalar 5 viteslidir.");
    }
}
