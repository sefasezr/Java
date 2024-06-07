package d16methodcreation_overloading_varargs_passbyvalue;

public class MethodCreation01 {
    /*Java da Method Olusturma: Java’da bir metot (örneğin main metodu) içinde başka bir metot tanımlanamaz.
        Ancak bir metod içinde (mesela main), bir iç Class (nested class veya inner class) tanımlanabilir
        ve bu iç class’in içinde metotlar tanımlanabilir. Ancak LocalInnerClass yalnızca main metodu içinde
        geçerli ve erişilebilir olduğu için, main dışında bir yerde kullanılamaz. */

        /* Method Creation - Metot Olusturma
        Java'da method nasil olusturulur?

        1- main method'un disinda, class'in icinde olusturulur
        2- Syntax'i: Access Modifier + Return Type + Method ismi + () + {}
        3- Olusturulan method nasil kullanilir?
            Main icinden method cagrisi yapilmalidir. Buna Method Call denir.*/

    //1- main metodunda sum(3, 5) çağrısında 3 ve 5 değerleri argümanlardır.
    //2- sum metodunun tanımında a ve b parametrelerdir.
    public static int sum(int a, int b) {
        return a + b;
    }

    public static void main(String[] args) {
        int result = sum(3, 5);
        System.out.println(result);




    }
}
