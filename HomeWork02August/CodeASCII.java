package TekwillCourses.HomeWork02August;

import java.util.Scanner;

public class CodeASCII {
    public static void main(String args[]) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter an ASCII code : ");
        int i = in.nextInt();
        System.out.println("The character for ASCII code " + (char) i + " is " + i);
    }
}