package d17constructors_datetime;

public class CarRunner {
    public static void main(String[] args) {

        //4-Car class'indan obje uretelim  //9-Default constructor icine parametre girelim
        Car c1 = new Car("BMW","3.20",2023,false);
        System.out.println(c1.brand);  //Honda  //BMW
        System.out.println(c1.model);  //Accord //3.20
        System.out.println(c1.year);   //2023   //2023
        System.out.println(c1.hybrid); //true   //false

        c1.action();  // Honda hizli hareket eder //BMW hizli hareket eder
        c1.stop();    // Honda guvenli bir sekilde durur //BMW guvenli bir sekilde durur

        // 5-Car class'a donelim

        //10-Car class'tan bir object daha uretelim
        Car c2 = new Car("Audi","A4",2018,false);
        System.out.println(c1);
        System.out.println(c2);

        //11-Car class'ta toString methodu olmayinca reference yazdirilir
        //Javada toString metodu genellikle bir nesnenin içeriğini okuabilir
        // bir String olarak yazmak icin kullanilir

        //14- Car class'tan bir object daha uretelim

        Car c3 = new Car("Tofaş","Şahin");
        System.out.println(c3);
    }
}
