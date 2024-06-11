package d23oop_collections;

public class AudiA4 implements Engine, AC, Brake {

    /*
    a) interface’leri parent yapmak icin ‘implements’ keyword’u child icinde kullanilir

    b) extends kullanilmaz cunku bu iki class arasinda kullanilir

    c) AudiA4 Class’i, Engine interface’i icindeki tum methodlari override etmek zorundadir.

    d) AudiA4 Class’i, Engine interface’i icindeki tum methodlari override etmek zorunda
    oldugundan method’larin bas kismina ‘override’ yazmak gerekmez ama tavsiye edilir.

    e) Class icinde access modifier yazilmazsa default kabul edildiginden, mecbur public yazariz
    */

    //Engine interface'inden override edilenler

    @Override
    public void eco(){
        System.out.println("AudiA4 ekonomik motor kullanir");
    }

    public void turbo(){
        System.out.println("AudiA4 turbo motor kullanir");
    }

    public void gas(){
        System.out.println("AudiA4 benzinli motor kullanir");
    }

    public void analog(){
        System.out.println("AudiA4 analog klima kullanir");
    }
    public void dijital(){
        System.out.println("AudiA4 dijital klima kullanir");
    }

    public void abs(){
        System.out.println("AudiA4 abs fren kullanir");
    }
    public void esp(){
        System.out.println("AudiA4 esp fren kullanir");
    }












}
