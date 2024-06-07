package KahveMak;

public class TurkKahvesi extends Kahve {
    @Override
    public String hazirla() {
        // seçtiyse, türk kahvesinin  hazırlandığını belirtiyorum.
        return "Türk kahvesi hazırlanıyor...";
    }

    @Override
    public String getKahveTuru() {
        // Seçtiyse,kahvenin türünü Türk kahvesi olarak döndürüyorum.
        return "Türk kahvesi";
    }
}
