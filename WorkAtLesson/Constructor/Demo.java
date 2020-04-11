package TekwillCourses.WorkAtLesson.Constructor;

public class Demo {
    public static void main(String[] args) {
        Cat c = new Cat();
        Cat mike = new Cat(29,"Mike","Blue");
        Cat spike = new Cat(29,"Spike","Blue","Scottish");
        System.out.println(c);
        System.out.println(mike);
        System.out.println(spike);
    }
}
