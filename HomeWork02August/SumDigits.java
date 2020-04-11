package TekwillCourses.HomeWork02August;

import java.util.Scanner;

public class SumDigits {
    public static void main(String args[]){
        Scanner in = new Scanner(System.in);
        System.out.println(" Insert a number from 0 to 1000 ");
        int number = in.nextInt();
        int sum = 0;
        while (number > 0 && number < 1000){
            sum = sum +(number % 10);
            number = number /10;
        }
        System.out.println("Sum of the digits is " + sum);
    }
}
