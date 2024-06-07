package KahveMak;

public class SiparisOzellikleri {
    private String sut;
    private String seker;
    private int kacSeker;
    private String boyut;


    // Süt eklenip eklenmediğini ayarlayan metot.
    public void setSut(String sut) {
        if (sut.equals("evet")) {
            // Kullanıcı süt eklenmesini istiyorsa.
            System.out.println("Süt ekleniyor...");
        } else if (sut.equals("hayır")) {
            // Kullanıcı süt eklenmesini istemiyorsa.
            System.out.println("Süt eklenmiyor...");
        }
        this.sut = sut;
    }

    // Şeker eklenip eklenmediğini ve miktarını ayarlayan metot.
    public void setSeker(String seker, int kacSeker) {
        if (seker.equals("evet")) {
            // Kullanıcı şeker eklenmesini istiyorsa.
            System.out.println(kacSeker + " şeker ekleniyor.");
        } else if (seker.equals("hayır")) {
            // Kullanıcı şeker eklenmesini istemiyorsa.
            System.out.println("Şeker eklenmiyor...");
        }
        this.seker = seker;
        this.kacSeker = kacSeker;
    }

    // Kahvenin boyutunu ayarlayan metot.
    public void setBoyut(String boyut) {
        switch (boyut) {
            case "büyük boy":
                // Kullanıcı büyük boy seçtiyse.
                System.out.println("Kahveniz büyük boy hazırlanıyor.");
                break;
            case "orta boy":
                // Kullanıcı orta boy seçtiyse.
                System.out.println("Kahveniz orta boy hazırlanıyor.");
                break;
            case "küçük boy":
                // Kullanıcı küçük boy seçtiyse.
                System.out.println("Kahveniz küçük boy hazırlanıyor.");
                break;
            default:
                // Geçersiz bir boyut seçildiyse.
                System.out.println("Hatalı tuşlama yaptınız.");
                return;
        }
        this.boyut = boyut;
    }

    // Kahvenin boyutunu döndüren metot.
    public String getBoyut() {
        return this.boyut;
    }
}
