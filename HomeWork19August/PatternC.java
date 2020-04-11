package TekwillCourses.HomeWork19August;

public class PatternC {
    public static void main(String[] args) {
        int line = 6;
        System.out.println("Pattern C");
        for (int rows = 1; rows <= line; rows++) {
            for (int s = line - rows; s >= 1; s--) {
                System.out.print("  ");
            }
            for (int columns = rows; columns >= 1; columns--) {
                System.out.print(columns + " ");
            }
            System.out.println();
        }
    }
}
