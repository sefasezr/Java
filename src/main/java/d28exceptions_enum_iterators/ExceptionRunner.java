package d28exceptions_enum_iterators;

public class ExceptionRunner {
    public static void main(String[] args) {

        studentGrade(-45);


    } //main disi

    public static void studentGrade(int not){
        //System.out.println(not);

        if(not<0||not>100){
            try {
                throw new InvalidStudentGradeException("Ogrenci notu sifirdan kucuk veya yuzden buyuk girilemez");
            } catch (InvalidStudentGradeException e) {
                e.printStackTrace();
            }
        }else{
            System.out.println(not);
        }
        System.out.println("FALCAO");
    }

}
