package TekwillCourses.HomeWork21August;

import java.util.Scanner;

public class LongestPrefix {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the first string :");
        String firstString = in.nextLine();
        System.out.println("Enter the second string");
        String secondString = in.nextLine();
        int letter = 0;
        String prefix = "";
        while (firstString.charAt(letter) == secondString.charAt(letter)) {
            prefix += firstString.charAt(letter);
            letter++;
        }
        if (prefix.length() > 0) {
            System.out.println("The prefix is " + prefix);
        } else
            System.out.println(firstString + " and " + secondString + " have no common prefix");

    }
}
