package d28exceptions_enum_iterators;



public class ExceptionRunnerDeneme {
    public static void main(String[] args) throws InvalidStudentGradeException {

        studentGrade(-45);
    }

    public static void studentGrade(int grade) throws InvalidStudentGradeException{
        if (grade <0 || grade > 100) {
            throw new InvalidStudentGradeException("Gecersiz Not Girisi");
        }else{
            System.out.println(grade);
        }
        System.out.println("Messi");  // sadece throw ile burayı yazdırmadı
    }
}
