package test.day05;

import com.day05.Student;

public class StudentTest {
    public static void main(String[] args) {
        Student s1 = new Student();
        Student s2 = new Student("Java");
        s1.print();
        s2.print();
    }
}
