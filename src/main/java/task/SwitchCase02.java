package task;

import java.util.Scanner;

public class SwitchCase02 {
    public static void main(String[] args) {
        /*
    Bakıye (başlangıç bakıyesi 1000 tl) öğrenme, para yatırma ve cekme, çıkış işlemlerinin yapıldıgı bie ATM app. code create ediniz
     */

        int butce =1000;
        Scanner scan = new Scanner(System.in);
        System.out.println("Yapmak islediginiz islemi seciniz : \nPara Cekmek icin (1) " +
                        "\nPara Yatırmak icin (2) \nBakiye ogrenmek icin (3) \nCikis Yapmak icin (4) tuslayiniz ");
        int secim = scan.nextInt();
        int yatirma,cekme;
        switch (secim) {
            case 1:
                System.out.println("Cekmek istediginiz miktari giriniz \nBakiyeniz 1000 Turk Lirasi");
                cekme = scan.nextInt();
                if (cekme<1001&&cekme>0){
                    System.out.println("Cektiginiz para miktari :"+cekme
                    +"\nKalan Bakiyeniz: "+(butce-cekme));
                }else if(cekme>1000){
                    System.out.println("Yetersiz Bakiye");
                }else if(cekme==0){
                    System.out.println("Para cekmeyi tercih etmediniz iyi gunler");
                }
                break;
            case 2:
                System.out.println("Yatirmak istediginiz miktari giriniz \nBakiyeniz 1000 Turk Lirasi");
                yatirma = scan.nextInt();
                if(yatirma>0){
                    System.out.println("Para yatirma islemi basarili. \nGuncel bakiyeniz: "+(yatirma + butce));
                }else{
                    System.out.println("Lutfen gecerli bir miktar yatirmaya calis");
                }
                break;
            case 3:
                System.out.println("Bakiyeniz :"+butce);
                break;
            case 4:
                System.out.println("Cikisiniz yapildi... Iyi gunler dileriz");
                break;
            default:
                System.out.println("Gecersiz Islem..");

        }
    }
}
