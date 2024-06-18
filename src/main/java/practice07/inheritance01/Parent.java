package practice07.inheritance01;

public class Parent {
     /*
            1 - Variable/Field
            2 - Constructor
            3 - Method (Opsiyonel)
            4 - Getter & Setter
            5 - toString (Opsiyonel)
         */
        /*
            - isim ve soyisim static değişkenleri oluşturalım.
            - method1 ve method2 static method'ları oluşturalım.
            - yas isimli bir instance variable oluşturalım.
            - method3 ve method4 isimli instance method'lar oluşturalım.
            - Oluşturduğumuz değişken ve method'ları, Child class'tan inheritance yaparak çağıralım.
        */
    protected static String name ="Ali";
    protected static String surname ="Can";
    protected int age=30;

    public Parent(int age) {
        this.age = age;
    }
    public Parent(){

    }


    protected static void method1(){
        System.out.println("parent class static method1");
    }
    protected static void method2(){
        System.out.println("parent class static method2");
    }
    protected void method3(){
        System.out.println("Parent class'in instance method3 yas: "+this.age);
    }
    protected void method4(){
        System.out.println("Parent class'in instance method4 yas: "+this.age);
    }
}
