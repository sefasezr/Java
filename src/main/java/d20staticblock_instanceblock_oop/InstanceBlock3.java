package d20staticblock_instanceblock_oop;

public class InstanceBlock3 {

    public String color;
    public String fuelType;

    {
        color = "siyah";
        fuelType = "benzinli";
    }

    public InstanceBlock3(){
        System.out.println("Araba rengi: "+color);
        System.out.println("Yakıt türü: "+fuelType);
    }
    public InstanceBlock3(String color, String fuelType){
        this.color = color;
        this.fuelType = fuelType;
    }


}
