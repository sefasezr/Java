package d19stringbuilder_buffer_accessmodifier_static;

public class Student1Runner {
    public static void main(String[] args) {

        System.out.println(Student1.stdName);
        Student1.staticMethod();

        Student1 ali = new Student1();
        System.out.println(ali.age);
        ali.nonStaticMethod();
    }
}
