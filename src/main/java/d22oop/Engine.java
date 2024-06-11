package d22oop;

public interface Engine {

    //Java Multiple Inheritance'i desteklemediginden ikinci yapi class'lar arasinda olusturulamaz
    //Ama bizim bu yapilanmaya ihtiyacimiz var. Bu yuzden Java Interface adli yeni bir yapi olusturdu.
    //ve bu yapiyi Multiple Inheritance'a acik hale getirdi. Yani; parent'lari class degil interface
    //yaparsak bir child icin birden fazla parent kullanabiliriz

    /*Interface (arayüz), class'larin uygulayabileceği bir "sözleşme" olarak düşünülebilir.
     Bir interface, bir veya daha fazla abstract method içerir ve
    bu methodların imzalarını (adlarını ve parametrelerini) belirtir,
    ancak bu methodların nasıl uygulanacağını tanımlamaz.
    Class'lar, bu interface'leri uygulayarak (implement ederek) bu methodları
    kendi ihtiyaçlarına göre tanımlarlar.*/

    //i) interface icindeki method’lar otomatik olarak ‘public’ dir,
    // bu yuzden interface’lerde method olustururken access modifier yazmayiz.(static degillerdir)

    //ii) interface icindeki method’lar otomatik olarak ‘abstract’ dir, bu yuzden interface’lerde
    // abstract method olustururken ‘abstract’ keyword’unu ve ‘method body’ sini yazmayiz.

    void eco();
    void turbo();
    void gas();


}
