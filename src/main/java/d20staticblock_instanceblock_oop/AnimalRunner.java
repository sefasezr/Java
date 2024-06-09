package d20staticblock_instanceblock_oop;

public class AnimalRunner {
    public static void main(String[] args) {
        Dog d = new Dog();
        d.Bark();         //dogs bark
        d.feedWithMilk(); //Mammals feed their babies with milk
        d.eat();          //Animals eat...
        d.drink();        //Animals drink...

        Bird b = new Bird();
        b.tweet();
        b.drink();



        //--------------------
        //a) Java ‘Multiple Inheritance' i desteklemez. ‘Single Inheritance’ i destekler.

        //b) Parent ve birden fazla child ile olusturulan inheritance yapilanmasina
        //   'Hierarchical Inheritance' denir ve Java bunu kabul eder.

        /*c) Ama coklu parent’lardan yararlanamamak iyi olmadi. Ozelliklerini inherit etmek istedigimiz
         class’lar birden fazla ise (parent’lar) o durumda Java bize, Apartman tarzi yapilanma olusturmustur.
         ( 'Multi Level Inheritance’) Java bunu kabul eder.*/

        // Java’da parent’tan child’a olan iliskilere HAS-A Relationship denir(yukaridan asagiya)
        // Java’da child’tan parent’a olan iliskilere IS-A Relationship denir (asagidan yukariya)


    }
}
