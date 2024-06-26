package d31lambda;

import java.util.ArrayList;
import java.util.List;

public class CourseRunner {
    public static void main(String[] args) {

        Course courseTurkishDay = new Course("Summer", "Turkish Day", 97, 128);
        Course courseTurkishNight = new Course("Winter", "Turkish Night", 98, 154);
        Course courseEnglishDay = new Course("Spring", "English Day", 95, 132);
        Course courseEnglishNight = new Course("Winter", "English Night", 93, 144);

        List<Course> coursesList  = new ArrayList<Course>();
        coursesList.add(courseTurkishDay);
        coursesList.add(courseTurkishNight);
        coursesList.add(courseEnglishDay);
        coursesList.add(courseEnglishNight);
        System.out.println(coursesList);

        //------------------------
        //1)Tum "averageScore" larin 91’den buyuk olup olmadigini kontrol eden kodu yaziniz.
        //1)Write the code that checks whether all "averageScore" is greater than 91

        //allMatch metodu, akıştaki (stream) tüm öğelerin belirli bir koşulu karşılayıp karşılamadığını
        // kontrol eder. Eğer akıştaki tüm öğeler bu koşulu sağlarsa true döndürür,
        // aksi takdirde false döndürür.(VE gibi)

        boolean result1 = coursesList.stream().allMatch(t->t.getAverageScore()>91);
        System.out.println(result1);

        //------------------------
        //2)Tum kurslardaki ögrenci sayilarinin 100’den buyuk olup olmadigini kontrol eden kodu yaziniz.
        //2)Write the code that checks whether the number of students in all courses is greater than 100.

        boolean result2 = coursesList.stream().allMatch(t->t.getNumberOfStudents()>100);
        System.out.println(result2);

        //------------------------
        //3)Kurs isimlerinden en az birinin "Turkish" kelimesini icerip icermedigini kontrol eden kodu yaziniz.
        //3)Write the code that checks whether at least one of the course names contains the word "Turkish".

        //anyMatch,Akıştaki herhangi bir elemanın belirli bir koşulu karşılayıp karşılamadığını kontrol eder.
        //Eğer akıştaki elemanlardan en az biri koşulu karşılıyorsa true döndürür, yoksa false döndürür.(VEYA gibi)

        boolean result3 = coursesList.stream().anyMatch(t->t.getCourseName().contains("Turkish"));
        System.out.println(result3);

        //------------------------
        //4) Sezon isimlerinden en az birinin "Summer" kelimesini icerip icermedigini kontrol eden kodu yaziniz.
        //4) Write the code that checks whether at least one of the season names contains the word "Summer".

        boolean result4 = coursesList.stream().anyMatch(t->t.getSeason().contains("Summer"));
        System.out.println(result4);

        //------------------------
        //5) Kurs donemleri icinde "Fall" doneminin hic bulunmadigini kontrol eden kodu yaziniz.
        //5) Write the code that checks that there is no "Fall" period among the course periods.

        //noneMatch, Akıştaki hiçbir elemanın belirli bir koşulu karşılamadığını kontrol eder.
        //Eğer akıştaki hiçbir eleman koşulu karşılamıyorsa true döndürür, aksi takdirde false döndürür.

        boolean result5 = coursesList.stream().noneMatch(t->t.getSeason().contains("Fall"));
        System.out.println(result5);

        //------------------------
        //6) Kurs isimleri icinde "German" isminin hic bulunmadigini kontrol eden kodu yaziniz.
        //6) Write the code that checks that the name "German" is not included in the course names.

        boolean result6 = coursesList.stream().noneMatch(t->t.getCourseName().contains("German"));
        System.out.println(result6);
    }
}
