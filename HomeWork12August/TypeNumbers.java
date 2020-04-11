package TekwillCourses.HomeWork12August;

import java.util.Scanner;

public class TypeNumbers {
    public static void main (String args[]){
        Scanner in = new Scanner(System.in);
        Boolean running = true;
        Integer result = 0;
        System.out.println("Enter the numbers ");
        for (; ; ) {
            Integer number = in.nextInt();
            number += result;
            System.out.println("Result is " + number);
        }
    }
}
