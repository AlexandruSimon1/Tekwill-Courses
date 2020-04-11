package TekwillCourses.HomeWork16September.AnalyzeScore;

public class ScoresUtils {
    static int computeAverageScore(int[] ints) {
        int sum = 0;
        for (int i : ints) {
            sum += i;
        }
        return sum / ints.length;
    }

    static int[] computeValueAboveAverage(int[] array, int averageValue) {
        int[] valuesAboveAverage = new int[0];

        for (int a : array) {
            if (a > averageValue)
                valuesAboveAverage=ArrayUtils.addElementToIntegerArray(valuesAboveAverage,a);
        }
        return valuesAboveAverage;
    }
    static int []computeValueBelowAverage(int []array,int averageValue){
        int[]valuesBelowAverage=new int[0];
        for (int b:array){
            if (b<averageValue)
                valuesBelowAverage=ArrayUtils.addElementToIntegerArray(valuesBelowAverage,b);
        }
        return valuesBelowAverage;
    }
}
