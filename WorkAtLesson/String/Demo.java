package TekwillCourses.WorkAtLesson.String;

public class Demo {
    public static void main(String[] args) {
        String s1 = new String("Alex");
        String s2 = new String("Alex");
        System.out.println("== " + s1 == s2);
        System.out.println("Equals " + s1.equals(s2));
        String morning2 = new String("Morning");
        System.out.println("Morning" == morning2);

        String phone = "Samsung";
        boolean startsWithS = phone.toLowerCase().startsWith("s");
        System.out.println(phone + " starts with s is :" + startsWithS);
    }
}
