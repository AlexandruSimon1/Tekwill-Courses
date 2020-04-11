package TekwillCourses.HomeWork16September.DistinctNumber;

import java.util.Scanner;

public class DistinctNumberUtilities {
    public static void main(String[] args) {
        int[] array = new int[0];
        Scanner in = new Scanner(System.in);
        array = ArrayUtils.addElementToIntegerArray(array, in.nextInt());
        for (int i = 0; i < 10; i++) {
            int number = in.nextInt();
            boolean isDistinct = false;
            for (int j = 0; j < array.length; j++) {
                if (array[j] != number)
                    isDistinct = true;
                else
                    isDistinct = false;
                break;
            }
            if (isDistinct)
                array = ArrayUtils.addElementToIntegerArray(array, number);
        }
        ArrayUtils.printValues(array);
    }
}
