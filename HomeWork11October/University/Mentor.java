package TekwillCourses.HomeWork11October.University;

public class Mentor {
    String name;
    String specialization;

    Mentor(String name, String specialization) {
        this.name = name;
        this.specialization = specialization;
    }

    public String getName() {
        return name;
    }

    public String getSpecialization() {
        return specialization;
    }

    @Override
    public String toString() {
        return "Mentor{" +
                "name='" + name + '\'' +
                ", specialization='" + specialization + '\'' +
                '}';
    }
}
