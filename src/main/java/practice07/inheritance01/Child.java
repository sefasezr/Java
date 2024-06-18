package practice07.inheritance01;

public class Child extends Parent {

    public int age = 5;

    @Override
    protected void method4(){
        System.out.println("Child method4 yas : "+this.age);
    }

    public static void main(String[] args) {

        System.out.println(Parent.name);
        System.out.println(name);
        Parent.method1();
        method1();

        Parent p = new Parent();
        System.out.println(p.age);

        Child c = new Child();
        System.out.println(c.age);;

        Parent parent = new Child();
        System.out.println(parent.age);

        parent.method3();

        c.method4();
        parent.method4();


    }

}
