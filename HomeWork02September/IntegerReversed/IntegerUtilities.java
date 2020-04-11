package TekwillCourses.HomeWork02September.IntegerReversed;

import java.util.Scanner;

public class IntegerUtilities {

    public static void getIntegerFromUser(int number) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter an integer");
        number = in.nextInt();
        reverse(number);
    }

    public static void reverse(int number) {
        while (number > 0) {
            System.out.print(number % 10);
            number /= 10;
        }

    }
}
