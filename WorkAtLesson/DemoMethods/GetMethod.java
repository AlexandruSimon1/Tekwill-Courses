package TekwillCourses.WorkAtLesson.DemoMethods;

public class GetMethod {
    public static void main(String[] args) {
        MethodDemo foo = new MethodDemo();
        foo.setFooName("Hello");
        System.out.println(foo.getFooName());
        MethodDemo.printHello();
    }
}
