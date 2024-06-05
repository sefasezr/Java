
public class Espresso extends Kahve {
    @Override
    public String hazirla() {
        // Espressonun  hazırlandığını return ediyorum.
        return "Espresso hazırlanıyor...";
    }

    @Override
    public String getKahveTuru() {
        // Eğer seçtiyse kahvenin türünü espresso olarak döndürüyorum.
        return "Espresso";
    }
}
