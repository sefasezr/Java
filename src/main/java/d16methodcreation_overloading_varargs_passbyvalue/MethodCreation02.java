package d16methodcreation_overloading_varargs_passbyvalue;

public class MethodCreation02 {
    //ornek 1: Iki sayiyi carpan bir method olusturunuz.
    //example 1: Create a method that multiplies two numbers

    //protected: Bu class'tan erisilebilir.
    //Bir de sadece miras alinan class’lardan erisilebilir(extends)
    public static void main(String[] args) {
        int result1 = multiply(12,4);
        int result2 = firstTwoMultiplyThirdAdd(11,4,6);
        System.out.println("1.method: "+result1);
        System.out.println("2.method: "+result2);

        print("Ali Can");


    }
    protected static int multiply(int sayi1,int sayi2){
        return sayi1*sayi2;
    }

    //ornek 2: Verilen 3 sayidan ilk ikisini carpan ve sonucu ucuncu sayi ile toplayan method olusturunuz.
    //example 2: Create a method that multiplies the first two of the given 3 numbers and adds the result with the third number.

    //private : Buraya sadece ayni class icerisinden erisilebilir.Diger class'lar erisemez

    private static int firstTwoMultiplyThirdAdd(int a,int b,int c){
        return a*b+c;
    }
    //ornek 3: Girilen bir kelimeyi konsola yazdiran bir method olusturunuz (void yani return yok)
    //example 3: Create a method that prints an entered word to the console

    //Eger bir method yeni bir data uretmiyor ise return type'i void olur.void ise return yazilmaz

    public static void print(String str){
        System.out.println(str);
    }
}
