package TekwillCourses.HomeWork19August;

public class PatternD {
    public static void main(String[] args) {
        System.out.println("Pattern D");
        for (int rows = 0 ; rows < 6; rows++) {
            for (int s = 0; s < rows; s++) {
                System.out.print("  ");
            }
            for (int columns = 0; columns < 6- rows; columns++) {
                System.out.print((columns + 1) + " ");
            }
            System.out.println();
        }
    }
}
