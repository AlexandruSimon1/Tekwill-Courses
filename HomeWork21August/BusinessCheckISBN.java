package TekwillCourses.HomeWork21August;

import java.util.Scanner;

public class BusinessCheckISBN {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the first 12 digits of an ISBN-13 as a string :");
        String string = in.nextLine();
        int result = 0;
        if (string.length() != 12) {
            System.out.println(string + " is invalid input");
            System.exit(1);
        }
        for (int i = 0; i < string.length(); i++) {
            result += i % 2 == 0 ? 3 * Integer.parseInt(string.charAt(i) + "") : Integer.parseInt(string.charAt(i) + "");
        }
        result = 10 - result % 10;
        System.out.println("The ISBN-13 number is " + string + (result == 10 ? 0 : result));
    }
}
