package KahveMak;

import java.util.InputMismatchException;
import java.util.Scanner;

public class KahveMakinesiApp {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        while (true) {
            // Kullanıcıya hangi kahveyi istediğini soruyorum.
            System.out.println("Hangi Kahveyi İstersiniz? (Çıkmak için 'çıkış' yazınız)");
            System.out.println("1. Türk kahvesi");
            System.out.println("2. Filtre Kahve");
            System.out.println("3. Espresso");

            // Kullanıcıdan kahve türünü alıyorum ve küçük harflerle normalize ediyorum.
            String hangiKahve = sc.nextLine().toLowerCase();

            if (hangiKahve.equals("çıkış")) {
                // Kullanıcı çıkış yapmak isterse döngüyü sonlandırıyorum.
                System.out.println("Çıkış yapılıyor...");
                break;
            }

            // Kahve sınıfının bir nesnesini oluşturuyorum.
            Kahve kahve;
            // Kullanıcının seçimine göre kahve türünü belirliyorum.
            switch (hangiKahve) {
                case "türk kahvesi":
                    kahve = new TurkKahvesi();
                    break;
                case "filtre kahve":
                    kahve = new FiltreKahve();
                    break;
                case "espresso":
                    kahve = new Espresso();
                    break;
                default:
                    // Geçersiz bir seçim yapıldığında kullanıcıya hata mesajı veriyorum.
                    System.out.println("Hatalı tuşlama yaptınız.");
                    continue;
            }
            int kacSeker=0;
            // Seçilen kahvenin hazırlanmasını sağlıyorum.
            System.out.println(kahve.hazirla());

            // Sipariş özelliklerini tutmak için SiparisOzellikleri sınıfını kullanıyorum.
            SiparisOzellikleri siparisOzellikleri = new SiparisOzellikleri();

            // Kullanıcıya süt eklemek isteyip istemediğini soruyorum.
            System.out.println("Süt eklememizi ister misiniz? (Evet veya Hayır olarak cevaplayınız):");
            String sut = sc.nextLine().toLowerCase();
            siparisOzellikleri.setSut(sut);

            // Kullanıcıya şeker eklemek isteyip istemediğini soruyorum.
            int sayac =0;
            System.out.println("Şeker ister misiniz? (Evet veya hayır cevabını veriniz):");
            String seker = sc.nextLine().toLowerCase();
            if (seker.equals("evet")) {
                // Kullanıcı şeker istiyorsa, kaç şeker eklemek istediğini soruyorum.

                while(sayac<1){
                    System.out.println("Kaç şeker olsun?");
                    sc.nextLine();
                try {
                    kacSeker = sc.nextInt();

                } catch (InputMismatchException e) {           // ArithmeticException problemin türüdür.
                    System.out.println("Sayi girilmesi gereken yere sayi dısında giris yapmayin");
                }
                if(kacSeker!=0){
                    sayac++;
                }
                }

                sc.nextLine();  // Bu özelliğe Dummy line - int girdisinden sonra string girdisi alabilmek için boş bir nextLine koyuyorum.
                                // Bunu koymazsak hata oluyor, direk diğer satırı okuyor.
                siparisOzellikleri.setSeker(seker, kacSeker);
            } else {
                siparisOzellikleri.setSeker(seker, 0);
            }

            // Kullanıcıya kahvenin boyutunu soruyorum.
            System.out.println("Hangi boyutta olsun? (Büyük boy - orta boy - küçük boy olarak giriniz):");
            String boyut = sc.nextLine().toLowerCase();
            siparisOzellikleri.setBoyut(boyut);

            // Kullanıcının sipariş özetini yazdırıyorum.
            System.out.println(kahve.getKahveTuru() + " " + siparisOzellikleri.getBoyut() + " hazırdır. Afiyet olsun!!!");
        }
    }
}
