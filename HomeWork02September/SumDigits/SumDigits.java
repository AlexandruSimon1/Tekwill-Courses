package TekwillCourses.HomeWork02September.SumDigits;

import java.util.Scanner;

public class SumDigits {
    public static void main(String[] args) {
        SumUtilities sum = new SumUtilities();
        Scanner in = new Scanner(System.in);
        System.out.println("Please enter a number ");
        long number = in.nextLong();
        System.out.println("The sum of the digit is "+number+" is "+sum.sumDigits(number));
    }
}
