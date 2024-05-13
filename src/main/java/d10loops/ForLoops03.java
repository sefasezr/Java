package d10loops;

public class ForLoops03 {
    public static void main(String[] args) {

        //ornek 3: Verilen bir String'i tersden yazan kodu yaziniz.
        //example 3: Write the code that reverses a given String

        //           String t = "Ali Can";  ==> "naC ilA"
        //Loop olustururken baslangic ve bitis degeri cok onemlidir

        //son index her zaman length()-1’tir

        System.out.println("------------------");

        String t = "Ali Can";
        String reverse = ""; //ters cevirince bunun icinde saklayacagiz

        for (int i = t.length() - 1; i >= 0; i--) {
            reverse = reverse + t.charAt(i);
        }
        System.out.println(reverse);


    }


}
