package practice06;

public class Child extends Parent {

    public Child(String name, String surname, int age) {
        super(name, surname, age);
    }

    public static void main(String[] args) {
        Child obj = new Child("Sefa","Sezer",20);
        obj.method1();
        obj.method2(); //bunlari class ile de cagiririz
        obj.method3();
        obj.method4();



    }

}
