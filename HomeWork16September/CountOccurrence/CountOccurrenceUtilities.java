package TekwillCourses.HomeWork16September.CountOccurrence;

import java.util.Scanner;

public class CountOccurrenceUtilities {
    public void enterDigits() {
        int digit[] = new int[100];
        result(digit);
        for (int i = 0; i < digit.length; i++) {
            if (digit[i] > 0)
                System.out.println((i + 1) + " occurs " + digit[i] + " time " + (digit[i] > 1 ? "s" : ""));
        }
    }

    public void result(int[] digit) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter digits between 1 to 100");
        int num;
        do {
            num = in.nextInt();
            if (num >= 1 && num <= 100)
                digit[num - 1]++;
        } while (num != 0);
    }
}
