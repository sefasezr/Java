package d11loops;

public class ForLoops01 {
    public static void main(String[] args) {

        int sum = 0;

        for (int i =6; i<11;i++){
            sum+=i;
        }

        System.out.println("sum: "+sum);

        int multiply =1;

        for (int i =10; i>6;i--){
            multiply*=i;
        }
        System.out.println("multiply: "+multiply);
    }
}
