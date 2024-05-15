package d11loops;

public class ForLoops04 {
    public static void main(String[] args) {

        // Ornek 2: Verilen sayida ondalik kisimdaki rakamlarin toplamini bulunuz

        //         28.587 ==> 5+8+7=20

        double num = 28.587;
        String sNum = String.valueOf(num);
        sNum = sNum.split("\\.")[1];
        Integer num2 = Integer.valueOf(sNum);

        int ondalikToplam =0;

        for(int i = num2; i>0;i/=10){
            ondalikToplam+= i%10;
        }
        System.out.println("28.587 Sayisinin Ondalik kisim rakam toplami: "+ondalikToplam);

    }
}
