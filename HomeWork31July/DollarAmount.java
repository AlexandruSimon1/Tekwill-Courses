package TekwillCourses.HomeWork31July;

import java.util.Scanner;

public class DollarAmount {
    public static final int FIRST_BILLS = 20;
    public static final int SECOND_BILLS = 10;
    public static final int THIRD_BILLS = 5;
    public static final int FOUR_BILLS = 1;
    public static void main(String args[]){
        int amount;
        int a;
        int b;
        int c;
        int d;
        int remainingamountone;
        int remainingamounttwo;
        int remainingamountthree;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the dollars amount ");
        amount = scanner.nextInt();
        a = amount / FIRST_BILLS;
        remainingamountone = a %10;
        b = (remainingamountone * 10) %10;
        System.out.println("$20 "+ a + " bills ");
        System.out.println("$10 "+ b + " bills");
    }
}
