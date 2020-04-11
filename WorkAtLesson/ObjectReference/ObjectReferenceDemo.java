package TekwillCourses.WorkAtLesson.ObjectReference;

public class ObjectReferenceDemo {
//    public static void swap(Person p1, Person p2) {
//        Person temp = p1;
//        p1 = p2;
//        p2 = temp;
//        System.out.println("swap " + p1.getName() + "  " + p2.getName());
//    }

    public static void swap(Person p1, Person p2) {
        Person temp = p1;
        p1 = p2;
        p2 = temp;
        System.out.println("swap " + p1.getName() + "  " + p2.getName());
    }

    public static void main(String[] args) {
        Person p1 = new Person("John");
        Person p2 = new Person("Paul");
        System.out.println(p1.getName() + " " + p2.getName());
        swap(p1, p2);
        System.out.println(p1.getName() + "  " + p2.getName());
    }
}
