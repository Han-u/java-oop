import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class StudentTest {
    public static void main(String[] args){
        List<Student> students = new ArrayList<>();

        Student s1 = new Student(1, "sdafsd");
        students.add(s1);


        students.add(new Student(2, "gdfa2"));
        students.add(new Student(3, "gdfa3"));
        students.add(new Student(4, "gdfa4"));
        students.add(new Student(5, "gdfa5"));
        students.add(new Student(6, "gdfa6"));

        Collections.sort(students);
    }
}
