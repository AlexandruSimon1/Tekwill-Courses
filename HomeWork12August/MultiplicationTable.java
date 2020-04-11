package TekwillCourses.HomeWork12August;

import java.util.Scanner;

public class MultiplicationTable {
    public static void main (String args[]){
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the number and the range ");
        Integer number = in.nextInt();
        Integer range = in.nextInt();
        for (int x = 1; x<=range;x++)
        {
            System.out.println(number +" * " + x + " = "+ number*x );
        }
    }
}
