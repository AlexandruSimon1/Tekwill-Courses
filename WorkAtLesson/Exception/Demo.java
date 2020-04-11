package TekwillCourses.WorkAtLesson.Exception;

public class Demo {
    public static void main(String[] args) {
        NetworkConnector n = new NetworkConnector();
        //HANDLE
        try {
            String connect = n.getStatusConnection("h");
            System.out.println(connect);
        } catch (BusinessConnectionExceptions e){
            System.out.println(e);
        }

        System.out.println(1 + 2);
    }
}
