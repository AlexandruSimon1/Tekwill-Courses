package TekwillCourses.WorkAtLesson.decision.TestMethod;

public class Test {
    public static void main(String[] args) {
        System.out.println(TestMethod.reverse("Mike"));
        System.out.println(TestMethod.reverse("John"));
        System.out.println(TestMethod.reverse("Hello"));
        System.out.println();
        System.out.println(TestMethod.checkForCommonPart("Hello bob", "Hello helen"));
        System.out.println(TestMethod.checkForCommonPart("H3llo bob", "Hello helen"));
        System.out.println(TestMethod.checkForCommonPart("ioilo bob", "Hello helen"));
    }
}
