package TekwillCourses.HomeWork11October.University;

import java.util.ArrayList;
import java.util.function.Predicate;

public class Demo {
    public static void main(String[] args) {
        Mentor mathMentor = new Mentor("Pythagoras", "Maths");
        Mentor geographyMentor = new Mentor("Columb", "Geography");

        ArrayList<Student> students = new ArrayList<>();
        students.add(new Student("John", 7.8, mathMentor));
        students.add(new Student("Joshua", 5.7, mathMentor));
        students.add(new Student("George", 9.9, geographyMentor));
        students.add(new Student("Neils", 8.7, geographyMentor));
        students.add(new Student("Alex", 8.1, mathMentor));
        students.add(new Student("Abraham", 6.3, geographyMentor));
        students.add(new Student("Lincoln", 5.2, mathMentor));
        System.out.println("Students with mark more then 8");
        filter(students, student -> student.averageGrade > 8);
        System.out.println("Students with marks less then 8");
        filter(students, student -> student.averageGrade < 8);
        System.out.println("Students with name longer then 5 ");
        filter(students, student -> student.name.length() > 5);
        System.out.println("Students with J in they names");
        filter(students, student -> student.name.startsWith("J"));
        System.out.println("Students with marks at mathMentor");
        filter(students, student -> student.mentor.equals(mathMentor));
        System.out.println("Students with marks at geography Mentor");
        filter(students, student -> student.mentor.equals(geographyMentor));

    }

    private static void filter(ArrayList<Student> students, Predicate<Student> validator) {
        for (Student student : students) {
            if (validator.test(student))
                System.out.println(student);
        }
    }
}
