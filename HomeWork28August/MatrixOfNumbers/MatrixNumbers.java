package TekwillCourses.HomeWork28August.MatrixOfNumbers;

import java.util.Scanner;

public class MatrixNumbers {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        MatrixMethod select = new MatrixMethod();
        select.userEnter();
        select.n = in.nextInt();
        select.result();
    }
}
