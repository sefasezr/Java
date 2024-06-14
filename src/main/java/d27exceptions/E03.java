package d27exceptions;

public class E03 {
    public static void main(String[] args) {
        //3) StringIndexOutOfBoundsException, bir String nesnesinin, karakter dizisindeki
        // geçersiz bir indekse erişmeye çalışıldığında ortaya çıkan bir istisna türüdür.

        String s = "Java";
        //selectChar(s,2);
        selectChar(s,4);

    }

    public static void selectChar(String s,int idx){
        try{
            char ch = s.charAt(idx);
            System.out.println(ch);
        }catch (StringIndexOutOfBoundsException e){
            System.err.println("Olmayan indexleri kullanmayiniz : "+e.getMessage());
            e.printStackTrace();  //Kod yazan hatalari gormek isterse kullanir. exception firlatilmaz.
            // Calismayi durdurmaz
        }
        System.out.println("App calisiyor");

    }


}
