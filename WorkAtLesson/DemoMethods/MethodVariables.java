package TekwillCourses.WorkAtLesson.DemoMethods;

public class MethodVariables {
    private String name;
    static String company = "Tekwill";

    public static void party(){
        System.out.println("Everybody parties at " + company);
    }
    public void setName (String n){
        name = n;
    }
    public String getName(){
        return name;
    }
}
