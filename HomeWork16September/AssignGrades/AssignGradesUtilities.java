package TekwillCourses.HomeWork16September.AssignGrades;

import java.util.Scanner;

public class AssignGradesUtilities {
    public void enterScore() {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter number of students");
        int[] student = new int[in.nextInt()];
        char[] score = new char[student.length];
        System.out.println("Enter " + student.length + " scores");
        for (int i = 0; i < student.length; i++) {
            student[i] = in.nextInt();
        }
        getGrade(student, score);
        for (int i = 0; i < student.length; i++) {
            System.out.println("Student " + i + " score is " + student[i] + " and grade is " + score[i]);
        }
    }

    public int max(int[] array) {
        int max = array[0];
        for (int i = 1; i < array.length; i++) {
            if (array[i] > max)
                max = array[i];
        }
        return max;
    }

    public void getGrade(int[] student, char[] score) {
        int best = max(student);
        for (int i = 0; i < student.length; i++) {
            if (student[i] >= best - 10)
                score[i] = 'A';
            else if (student[i] >= best - 20)
                score[i] = 'B';
            else if (student[i] >= best - 30)
                score[i] = 'C';
            else if (student[i] >= best - 40)
                score[i] = 'D';
            else
                score[i] = 'F';
        }
    }
}
