package d22oop;

public class Accord extends Honda {

    //1- extends ile Honda'nin child'i yapildi.Accord parent'indaki
    //engine() abstract methodunu override etmek etmek zorundadir
    //2- @Override yazildi.Parent'taki engine methodu override edilecek
    //3- Abstract silindi
    //4- Body eklendi

    @Override
    public void engine(){
        System.out.println("Gas 2.0 Turbo");
    }

}
