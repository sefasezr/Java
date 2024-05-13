package d10loops;

public class ForLoops01 {
    public static void main(String[] args) {
        //Ornek 2: 20(dahil) den 3(dahil) e kadar tum tamsayilari console’a yazdiriniz.
        //Example 2: Write all integers from 20(inclusive) to 3(inclusive) to console

        for (int i = 20; i > 2; i--) {
            System.out.println(i);
        }

        //Ornek 3: 3'den 20'ye kadar tum cift sayilari console’a yazdiriniz(20 dahil)
        //Example 3: Write all even numbers from 3 to 20 to the console (including 20)

        System.out.println("-------------------");

        for (int i = 4; i < 21; i+=2) {
            System.out.println(i);
        } //Boyle de cozebilirdik


    }
}
