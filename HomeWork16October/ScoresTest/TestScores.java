package TekwillCourses.HomeWork16October.ScoresTest;

import java.io.IOException;
import java.util.Scanner;

public class TestScores {
    public static void main(String[] args) throws IOException {
        try {
            Scanner in = new Scanner(System.in);
            System.out.println("Enter number for tests");
            int numTest = in.nextInt();
            double sumAllGrades = 0;
            for (int i = 0; i < numTest; i++) {
                System.out.println("Enter the grade " + (i + 1) + " : ");
                double grade = in.nextInt();
                sumAllGrades += grade;
            }
            double average = sumAllGrades / numTest;
            System.out.println("Average is " + average);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
