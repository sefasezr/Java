package KahveMak;

import java.util.Scanner;

public class KahveMakinesi {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        String hangiKahve=null;
        String sut =null;
        String seker = null;
        int sekerSayisi=0;
        String boyut = null;


        while(true){
            System.out.println("Hangi kahveyi istersiniz? \n1.Turk Kahvesi\n2.Filtre Kahve\n3.Espresso");
            hangiKahve = scan.nextLine();
            if(hangiKahve.equalsIgnoreCase("Turk Kahvesi")){
                System.out.print(hangiKahve+" hazirlaniyor..\nSüt eklememizi ister misiniz? ");
                sut = scan.next();
                if(sut.equalsIgnoreCase("Evet")){
                    System.out.println("Sut ekleniyor...");
                }else if(sut.equalsIgnoreCase("Hayır")){
                    System.out.println("Sut eklenmiyor...");
                }
                System.out.println("Şeker ister misiniz?");
                seker = scan.next();
                if(seker.equalsIgnoreCase("Evet")){
                    System.out.print("Kac seker olsun ");
                    sekerSayisi = scan.nextInt();
                    scan.nextLine();
                    System.out.println(sekerSayisi+" şeker ekleniyor...");
                    System.out.print("Hangi boyutta olsun? ");
                    boyut = scan.nextLine();
                    if(boyut.equalsIgnoreCase("Büyük Boy")){
                        System.out.println("Kahveniz "+boyut+" hazırlanıyor...");
                        break;
                    }else if(boyut.equalsIgnoreCase("Orta Boy")){
                        System.out.println("Kahveniz "+boyut+" hazırlanıyor...");
                        break;
                    }else if(boyut.equalsIgnoreCase("Küçük Boy")){
                        System.out.println("Kahveniz "+boyut+" hazırlanıyor...");
                        break;
                    }

                }else if(seker.equalsIgnoreCase("Hayır")){
                    System.out.println("Şeker eklenmiyor...");
                    System.out.print("Hangi boyutta olsun? ");
                    scan.nextLine();
                    boyut = scan.nextLine();
                    if(boyut.equalsIgnoreCase("Büyük Boy")){
                        System.out.println("Kahveniz "+boyut+" hazırlanıyor...");
                        break;
                    }else if(boyut.equalsIgnoreCase("Orta Boy")){
                        System.out.println("Kahveniz "+boyut+" hazırlanıyor...");
                        break;
                    }else if(boyut.equalsIgnoreCase("Küçük Boy")){
                        System.out.println("Kahveniz "+boyut+" hazırlanıyor...");
                        break;
                    }
                }
                break;


            }else if(hangiKahve.equalsIgnoreCase("Filtre Kahve")){
                System.out.println(hangiKahve+" hazirlaniyor..\nSüt eklememizi ister misiniz?");
                sut = scan.next();
                if(sut.equalsIgnoreCase("Evet")){
                    System.out.println("Sut ekleniyor...");
                }else if(sut.equalsIgnoreCase("Hayır")){
                    System.out.println("Sut eklenmiyor...");
                }
                System.out.println("Şeker ister misiniz?");
                seker = scan.next();
                if(seker.equalsIgnoreCase("Evet")){
                    System.out.print("Kac seker olsun ");
                    sekerSayisi = scan.nextInt();
                    scan.nextLine();
                    System.out.println(sekerSayisi+" şeker ekleniyor...");
                    System.out.print("Hangi boyutta olsun? ");
                    boyut = scan.nextLine();
                    if(boyut.equalsIgnoreCase("Büyük Boy")){
                        System.out.println("Kahveniz "+boyut+" hazırlanıyor...");
                        break;
                    }else if(boyut.equalsIgnoreCase("Orta Boy")){
                        System.out.println("Kahveniz "+boyut+" hazırlanıyor...");
                        break;
                    }else if(boyut.equalsIgnoreCase("Küçük Boy")){
                        System.out.println("Kahveniz "+boyut+" hazırlanıyor...");
                        break;
                    }

                }else if(seker.equalsIgnoreCase("Hayır")){
                    System.out.println("Şeker eklenmiyor...");
                    System.out.print("Hangi boyutta olsun? ");
                    scan.nextLine();
                    boyut = scan.nextLine();
                    if(boyut.equalsIgnoreCase("Büyük Boy")){
                        System.out.println("Kahveniz "+boyut+" hazırlanıyor...");
                        break;
                    }else if(boyut.equalsIgnoreCase("Orta Boy")){
                        System.out.println("Kahveniz "+boyut+" hazırlanıyor...");
                        break;
                    }else if(boyut.equalsIgnoreCase("Küçük Boy")){
                        System.out.println("Kahveniz "+boyut+" hazırlanıyor...");
                        break;
                    }
                }
                break;
            }else if (hangiKahve.equalsIgnoreCase("Espresso")){
                System.out.println(hangiKahve+" hazirlaniyor..\nSüt eklememizi ister misiniz?");
                sut = scan.next();
                if(sut.equalsIgnoreCase("Evet")){
                    System.out.println("Sut ekleniyor...");
                }else if(sut.equalsIgnoreCase("Hayır")){
                    System.out.println("Sut eklenmiyor...");
                }
                System.out.println("Şeker ister misiniz?");
                seker = scan.next();
                if(seker.equalsIgnoreCase("Evet")){
                    System.out.print("Kac seker olsun ");
                    sekerSayisi = scan.nextInt();
                    scan.nextLine();
                    System.out.println(sekerSayisi+" şeker ekleniyor...");
                    System.out.print("Hangi boyutta olsun? ");
                    boyut = scan.nextLine();
                    if(boyut.equalsIgnoreCase("Büyük Boy")){
                        System.out.println("Kahveniz "+boyut+" hazırlanıyor...");
                        break;
                    }else if(boyut.equalsIgnoreCase("Orta Boy")){
                        System.out.println("Kahveniz "+boyut+" hazırlanıyor...");
                        break;
                    }else if(boyut.equalsIgnoreCase("Küçük Boy")){
                        System.out.println("Kahveniz "+boyut+" hazırlanıyor...");
                        break;
                    }

                }else if(seker.equalsIgnoreCase("Hayır")){
                    System.out.println("Şeker eklenmiyor...");
                    System.out.print("Hangi boyutta olsun? ");
                    scan.nextLine();
                    boyut = scan.nextLine();
                    if(boyut.equalsIgnoreCase("Büyük Boy")){
                        System.out.println("Kahveniz "+boyut+" hazırlanıyor...");
                        break;
                    }else if(boyut.equalsIgnoreCase("Orta Boy")){
                        System.out.println("Kahveniz "+boyut+" hazırlanıyor...");
                        break;
                    }else if(boyut.equalsIgnoreCase("Küçük Boy")){
                        System.out.println("Kahveniz "+boyut+" hazırlanıyor...");
                        break;
                    }
                }
                break;
            }else{
                System.out.println("Hatali Tuslama Yaptiniz..");
            }
        }
        System.out.println(hangiKahve+" "+boyut+" hazırdır. Afiyet olsun!");

    }
}
