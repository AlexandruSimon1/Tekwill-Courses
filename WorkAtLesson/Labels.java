package TekwillCourses.WorkAtLesson;

public class Labels {
    public static void main(String args[]) {
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                System.out.println(i + " / " + j);
                if (j == 2)
                    break;
            }
            System.out.println();
        }
    }
}
