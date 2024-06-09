package d21oop;

public class Car extends Vehicle {

    public String model = "Accord";
    public int year = 2024;

    public Car() {
        this("Sport");  //2-
        System.out.println("Sedan");
    }
    public Car(String tip){
        super();
        System.out.println("Sport");
    }

}
