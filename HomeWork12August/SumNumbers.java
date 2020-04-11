package TekwillCourses.HomeWork12August;

import java.util.Scanner;

public class SumNumbers {
    public static void main(String args[]){
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the number that you want to sum ");
        Integer number1 = in.nextInt();
        Integer number2 = in.nextInt();
        for ( int x=++number1; x <= number2; x++)
            number1 +=x ;
        System.out.println("Resutls is " + number1);
    }
}
