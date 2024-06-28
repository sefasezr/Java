package d34lambda;

public class UniversiteLambda {
    private String fakulte;
    private String bolum;
    private int notOrtalama;
    private int ogrenciNo;

    public UniversiteLambda(String fakulte, String bolum, int notOrtalama, int ogrenciNo) {
        this.fakulte = fakulte;
        this.bolum = bolum;
        this.notOrtalama = notOrtalama;
        this.ogrenciNo = ogrenciNo;
    }

    public String getFakulte() {
        return fakulte;
    }

    public void setFakulte(String fakulte) {
        this.fakulte = fakulte;
    }

    public String getBolum() {
        return bolum;
    }

    public void setBolum(String bolum) {
        this.bolum = bolum;
    }

    public int getNotOrtalama() {
        return notOrtalama;
    }

    public void setNotOrtalama(int notOrtalama) {
        this.notOrtalama = notOrtalama;
    }

    public int getOgrenciNo() {
        return ogrenciNo;
    }

    public void setOgrenciNo(int ogrenciNo) {
        this.ogrenciNo = ogrenciNo;
    }

    @Override
    public String toString() {
        return "UniversiteLambda{" +
                "fakulte='" + fakulte + '\'' +
                ", bolum='" + bolum + '\'' +
                ", notOrtalama=" + notOrtalama +
                ", ogrenciNo=" + ogrenciNo +
                '}';
    }
}
