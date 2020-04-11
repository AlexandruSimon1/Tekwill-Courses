package TekwillCourses.HomeWork19August;

public class PatternA {
    public static void main(String[] args) {
        System.out.println("Pattern A");
        for (int rows = 1; rows <= 6; rows++) {
            for (int columns = 1; columns <= rows ; columns++) {
                System.out.print(columns + " ");
            }
            System.out.println();
        }
    }
}
