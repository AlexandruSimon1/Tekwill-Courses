package TekwillCourses.HomeWork21August;

import java.util.Scanner;

public class ProcessString {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter a string :");
        String result = "";
        String string = in.nextLine();
        for (int i = 0; i <= string.length(); i += 2) {
            result += string.charAt(i);
        }
        System.out.println(result);
    }
}
