package practice06;

public class C03_StaticKeyword {

        /*
            scope: Etki Alanı/Kapsam -> Değişken ve Method'ların nerede geçerli olduklarını belirtir.

            1: static variable
            2: instance variable
            3: local variable
            4: loop variable
            //1: static variable //herkes icin ayni olan deger diyebiliriz
            //2: instance variable //herkese/kisiye ait olan ozel deger
            //3: local variable //ihtiyac halinde kullanılan kullan at variable'lar
            //4: loop variable //loop parantezlerinin icinde bulunan variable'lar
     */
    /*
            - Bir class'ta instance, static değişkenler oluşturunuz.
            - Instance ve static 2 method oluşturunuz.
            - Bir main method, içerisinde 2 adet obje oluşturunuz, yazdırınız.
            - static variable değerini arttırınız.
            - obj1 instance variable'ını güncelleyiniz.
            - obj2'nin instance ve static değerini arttırınız.
            - obj1 ve obj 2'nin instance değerlerini yazdırınız.
     */

        int instanceVar =5;
        static int staticVar =10;

    public static void main(String[] args) {
        C03_StaticKeyword.staticVar =15;
        C03_StaticKeyword obj = new C03_StaticKeyword();
        obj.instanceVar =20;
        C03_StaticKeyword obj2 = new C03_StaticKeyword();
        obj2.instanceVar = 25;
        obj2.staticVar = 35;

        System.out.println(obj.instanceVar);
        System.out.println(obj2.instanceVar);
    }
    public void method1(){
        String str= "Instance method"; // local variable
        System.out.println(str);
    }
    public static void method2(){
        System.out.println("Statik metod");
    }


}
