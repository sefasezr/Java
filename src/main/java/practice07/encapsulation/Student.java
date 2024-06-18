package practice07.encapsulation;
//Encapsulation: data hiding

/*
bir class oluşturalım.
private access modifiera sahip variablelar oluşturun: isim, soyisim, yas seklinde
parametreli ve parametresiz constructor oluşturun
toString metodunu oluşturun
*/

public class Student {

    private String isim;
    private String soyisim;
    private int yas;

    //default const

    public Student(){

    }

    //paramli const

    public Student(String isim, String soyisim, int yas) {
        this.isim = isim;
        this.soyisim = soyisim;
        this.yas = yas;
    }

    //getter:okuma,goruntuleme


    public String getIsim() {
        return isim;
    }

    public String getSoyisim() {
        return soyisim;
    }

    public int getYas() {
        return yas;
    }

    //setter:degistirme,guncelleme

    public void setIsim(String isim) {
        this.isim = isim;
    }

    public void setSoyisim(String soyisim) {
        this.soyisim = soyisim;
    }

    public void setYas(int yas) {
        this.yas = yas+5;
    }

    @Override
    public String toString() {
        return "Student{" +
                "isim='" + isim + '\'' +
                ", soyisim='" + soyisim + '\'' +
                ", yas=" + yas +
                '}';
    }
    /*
    POJO:Plain Old Java Object
    1-private : fields
    2-paramli/default const
    3-getter-setter
    4-toString
     */
}
