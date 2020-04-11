package TekwillCourses.WorkAtLesson.DemoMethods;

public class DemoLocalVariables {
    public static void main(String[] args) {
        MethodVariables e = new MethodVariables();
        e.setName("Mike");
        MethodVariables e2= new MethodVariables();
        e2.setName("Bob");
        foo();
        System.out.println(e.getName()+" and "+e2.getName() + " work at " + MethodVariables.company);
        e.company = "Google";
        System.out.println("After a year ....");
        System.out.println(e.getName() + " and " + e2.getName() + " work at " + e.company);
        MethodVariables.party();
    }
    public static void foo(){
        MethodVariables e = new MethodVariables();
        e.setName("Hector");
        System.out.println(e.getName() + " works at Google ");
    }
}
