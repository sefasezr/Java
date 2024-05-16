package prac;

public class C3 {
    public static void main(String[] args) {
        // ilk 50 asal sayıyı 10’ar 10’ar alt alta gösterecek java algoritma kodunu yazınız.
        int asalSayac =0;
        int sayi = 2;


        while(asalSayac<50){
            boolean asalMi = true;
            for (int i = 2; i < sayi; i++){
                if (sayi%i==0){
                    asalMi = false;
                }
            }
            if(asalMi){
                asalSayac++;
                if(asalSayac%10==0){
                    System.out.println(sayi);
                }else{
                    System.out.print(sayi+" ");
                }
            }
            sayi++;
        }
    }
}
