package TekwillCourses.HomeWork16September.AnalyzeScore;

import java.util.Scanner;

public class AnalyzeScoreUtilities {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Please enter number of digits");
        int[] score = new int[100];
        int number;
        int numberOfScores = 0;
        int average = 0;
        for (int i = 0; i < 100; i++) {
            number = in.nextInt();
            if (number < 0)
                break;
            score[i] = number;
            average += number;
            numberOfScores++;
        }

        average /= numberOfScores;
        int aboveOrEqual = 0;
        int below = 0;
        for (int i = 0; i < numberOfScores; i++) {
            if (score[i] >= average)
                aboveOrEqual++;
            else
                below++;
        }
        System.out.println("The average score is " + average);
        System.out.println("Number of scores above or equal to average" + aboveOrEqual);
        System.out.println("Number of scores below" + below);
    }
}
