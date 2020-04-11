package TekwillCourses.HomeWork02August;

import java.util.Scanner;

public class NumberValues {
    public static void main(String args[]){
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the number that you want to be verified");
        Integer number = in.nextInt();
        in.close();
        if (number >0){
            System.out.println(number + " is positive number");
        }
        else if( number < 0){
            System.out.println(number + " is negative number");
        }
        else {
            System.out.println(number + " is zero number");
        }
    }
}
