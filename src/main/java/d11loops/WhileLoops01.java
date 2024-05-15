package d11loops;

public class WhileLoops01 {
    public static void main(String[] args) {
        // Ornek 1: 3'den 6'ya kadar tamsayilari console'a yazdiriniz ( 3 ve 6 dahil)

        for (int i = 3 ; i<7;i++){
            System.out.print(i+" ");
        }
        System.out.println();
        int sayi =3;
        while(sayi<7){
            System.out.print(sayi+" ");
            sayi++;
        }

        System.out.println("");
        // Ornek 2: 23'den 12'ye kadar cift tamsayilari console'a yazdiriniz (12 dahil).

        int k =23;
        while(k>11){
            if (k%2==0){
                System.out.print(k+" ");
            }
            k--;
        }

    }
}
