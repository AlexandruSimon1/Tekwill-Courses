package TekwillCourses.HomeWork16September.AnalyzeScore;

import java.util.Scanner;

public class AnalyzeUtilities {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int[] scores = new int[100];
        System.out.println("Please input the numbers");
        int nextInt = in.nextInt();
        while (nextInt>=0){
            scores= ArrayUtils.addElementToIntegerArray(scores,nextInt);
            nextInt=in.nextInt();
        }
        int average=ScoresUtils.computeAverageScore(scores);
        int [] valuesAboveAverage = ScoresUtils.computeValueAboveAverage(scores,average);
        int [] valuesBelowAverage = ScoresUtils.computeValueBelowAverage(scores,average);
        System.out.println(average);
        System.out.println(valuesAboveAverage.length);
        System.out.println(valuesBelowAverage.length);
    }
}
