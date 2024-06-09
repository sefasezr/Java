package d21oop;

public class Dog extends Mammal {
    public void Bark(){
        System.out.println("Dog barks...");
    }

    @Override
    public void eat(){
        System.out.println("Dogs eat...");
    }

    @Override
    public Animal create(){
        return new Dog();  //Child parent'in data tipini kullanabilir
    }

    @Override
    public int add(int a, int b){
        return a+b;
        //primitive'lerde override'da return type degistirilemez
        //cunku primitive'lerde parent-child iliskisi yok
    }
    @Override
    public Integer multiply(Integer a, Integer b){
        return a*b;
    }


}
