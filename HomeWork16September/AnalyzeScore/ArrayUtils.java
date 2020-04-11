package TekwillCourses.HomeWork16September.AnalyzeScore;

public class ArrayUtils {
    static int[] addElementToIntegerArray(int[] array, int elementToAdd) {
        int[] tempArray = new int[array.length];
        for (int i = 0; i < array.length; i++) {
            tempArray[i] = array[i];
        }
        tempArray[array.length] = elementToAdd;
        return tempArray;
    }

    static void printValues(int[] array) {
        for (int a : array)
            System.out.println(a + " ");
    }
}
