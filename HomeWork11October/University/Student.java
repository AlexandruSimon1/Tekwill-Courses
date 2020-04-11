package TekwillCourses.HomeWork11October.University;

public class Student {
    String name;
    double averageGrade;
    Mentor mentor;

    Student(String name, double averageGrade, Mentor mentor) {
        this.name = name;
        this.averageGrade = averageGrade;
        this.mentor = mentor;
    }

    public String getName() {
        return name;
    }

    public double getAverageGrade() {
        return averageGrade;
    }

    public Mentor getMentor() {
        return mentor;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", averageGrade=" + averageGrade +
                ", mentor=" + mentor +
                '}';
    }
}
