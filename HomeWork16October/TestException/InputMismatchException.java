package TekwillCourses.HomeWork16October.TestException;

import java.util.Scanner;

public class InputMismatchException {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        boolean checkInput = true;
        System.out.println("Please enter the digits");
        do {
            try {
                int num1 = in.nextInt();
                int num2 = in.nextInt();
                System.out.println("The sum is " + (num1 + num2));
                checkInput = false;
            } catch (java.util.InputMismatchException ex) {
                System.out.println("Try again incorrect input was done");
                in.nextLine();
            }
        } while (checkInput);
    }
}
