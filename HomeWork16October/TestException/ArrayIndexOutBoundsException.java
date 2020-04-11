package TekwillCourses.HomeWork16October.TestException;

import java.util.Scanner;

public class ArrayIndexOutBoundsException {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int[] array = getArray();
        System.out.println("Enter a index of the array");
        try {
            System.out.println("The value is " + array[in.nextInt()]);
        } catch (ArrayIndexOutOfBoundsException ex) {
            System.out.println("Out of bounds");
        }
    }

    public static int[] getArray() {
        int[] array = new int[100];
        for (int i = 0; i < array.length; i++) {
            array[i] = (int) (Math.random() * 100) + 1;
        }
        return array;
    }
}
