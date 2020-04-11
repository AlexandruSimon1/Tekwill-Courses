package TekwillCourses.HomeWork13September.FormatOfInteger;

import java.util.Scanner;

public class FormatIntegerUtilities {
    public void insert() {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter a number and a width");
        int number = in.nextInt();
        int width = in.nextInt();
        System.out.println(number + " formatted to width " + width + " " + format(number, width));
    }

    public String format(int number, int width) {
        String num = number + "";
        if (num.length() < width) {
            for (int i = width - num.length(); i > 0; i--) {
                num = 0 + num;
            }
        }
        return num;
    }
}
