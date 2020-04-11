package TekwillCourses.HomeWork16September.ReverseNumbers;

import java.util.Scanner;

public class ReverseUtilities {
    public void enterDigits(int[] digit) {
        Scanner in = new Scanner(System.in);
        for (int i = 0; i < digit.length; i++) {
            digit[i] = in.nextInt();
        }
    }

    public void result() {
        int[] digit = new int[10];
        System.out.println("Enter teen digits that need to be reversed");
        enterDigits(digit);
        for (int i = digit.length - 1; i >= 0; i--) {
            System.out.println(digit[i] + " ");
        }
    }
}
