package TekwillCourses.HomeWork28August.MatrixOfNumbers;

public class MatrixMethod {
    int n = 0;

    public void result() {
        printMatrix(n);
    }

    public void userEnter() {
        System.out.println("Enter n :");
    }

    public static void printMatrix(int n) {
        for (int rows = 0; rows < n; rows++) {
            for (int cols = 0; cols < n; cols++) {
                System.out.print((int) (Math.random() * 2));
            }
            System.out.println();
        }
    }
}
