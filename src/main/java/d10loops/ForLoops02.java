package d10loops;

public class ForLoops02 {
    public static void main(String[] args) {

        /*Ornek 1: Verilen bir String'de ilk 'a' harfinden onceki tum character'leri console'a yazdiriniz
                ==> "Tramvay"==> "Tr"*/
        /*Example 1: Write all characters before the first letter 'a' in a given String to the console*/

        String s = "Tramvay";

        //charAt() methoduna index verince size karakteri getirir.
        //break keyword'u, bir döngüyü veya bir switch ifadesini erken bir şekilde sonlandırmak için kullanılır.

        for (int i = 0; i < s.length(); i++) { //i <= s.length() - 1' de yazabilirdik




            if (s.charAt(i) == 'a'){

                break; // a'yi gorunce dongu kiralacak
            }

            System.out.print(s.charAt(i)); //Tr
        }

        //-------------------------
        //Ornek 2: Verilen bir String'de kucuk harfleri console'a yazdirmayan kodu yaziniz.
        //"Pwd12?Ab" ==> P12?A

        System.out.println("---------------");
        String s1 = "Pwd12?Ab";

        for (int i = 0; i < s1.length(); i++) {
            char ch = s1.charAt(i);

            if (ch >= 'a' && ch <= 'z') {
                continue; //Geri kalan kodlari yurutme, artirma/eksiltmeye git
            } else {
                System.out.print(ch);
            }
        }

    }
}
