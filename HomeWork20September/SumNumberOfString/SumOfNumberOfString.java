package TekwillCourses.HomeWork20September.SumNumberOfString;

import java.util.Scanner;

public class SumOfNumberOfString {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter a string of digits");
        String number = in.nextLine();
        int sum = 0;
        for (int i = 0; i < number.length(); i++) {
            char a = number.charAt(i);
            if (Character.isDigit(a)) {
                int b = Integer.parseInt(String.valueOf(a));
                sum += b;
            }
        }
        if (sum == 0)
            System.out.println(-1);
        else
            System.out.println(sum);
    }
}
