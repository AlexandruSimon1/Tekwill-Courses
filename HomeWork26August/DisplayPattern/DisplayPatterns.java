package TekwillCourses.HomeWork26August.DisplayPattern;

import java.util.Scanner;

public class DisplayPatterns {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Please enter a number");
        int number = in.nextInt();
        DisplayPatterMethod.displayPattern(number);
    }
}
