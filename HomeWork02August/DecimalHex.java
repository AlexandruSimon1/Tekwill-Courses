package TekwillCourses.HomeWork02August;

import java.util.Scanner;

public class DecimalHex {
    public static void main(String args[]) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter a decimal value (0 to 15) : ");
        Integer decimal = in.nextInt();
        String hex = Integer.toHexString(decimal);
        if (decimal > 0) {
            System.out.println("The hex value is " + hex);
        }
        else if (decimal > 15) {
            System.out.println(decimal + " is an invalid input");
        }
        else {
            System.out.println(decimal + " is a negative number ");
        }
    }
}