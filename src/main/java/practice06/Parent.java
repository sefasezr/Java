package practice06;

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
    static String name;
    static String surname;
    int age;
    public Parent(String name, String surname, int age) {
        this.name = name;
        this.surname = surname;
        this.age = age;
    }

    public static String getName() {
        return name;
    }

    public static void setName(String name) {
        Parent.name = name;
    }

    public static String getSurname() {
        return surname;
    }

    public static void setSurname(String surname) {
        Parent.surname = surname;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public static void method1(){
        System.out.println(name);
    }
    public static void method2(){
        System.out.println(surname);
    }
    public void method3(){
        System.out.println(age);
    }
    public void method4(){
        System.out.println("methodd4 calisti");
    }
}
