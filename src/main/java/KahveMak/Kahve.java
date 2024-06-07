package KahveMak;

public abstract class Kahve {
    // Kahvenin nasıl hazırlanacağını belirten soyut metot.
    // Bu konuya hoca bugün geçiyor o yüzden çok basit düzeyde ekledim.
    //Soyut metot kullanarak, kahve türlerinin hazırlanma durumunu  alt sınıflara bıraktık.
    //  Kahve türleri tek bir yerde toplandı, farklı durumları ise alt sınıflarda belirtildi.
    public abstract String hazirla();
    // Kahvenin türünü döndüren soyut metot.
    public abstract String getKahveTuru();


}
