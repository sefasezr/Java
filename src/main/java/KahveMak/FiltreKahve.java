package KahveMak;

public class FiltreKahve extends Kahve {
    @Override
    public String hazirla() {
        // Filtre kahvenin  hazırlandığını return ediyorum.
        return "Filtre kahve hazırlanıyor...";
    }

    @Override
    public String getKahveTuru() {
        // Eğer seçtiyse, kahvenin türünü filtre kahve olarak döndürüyorum.
        return "Filtre kahve";
    }
}
