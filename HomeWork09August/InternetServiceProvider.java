package TekwillCourses.HomeWork09August;

import java.util.Scanner;

public class InternetServiceProvider {
    public final static double PackA = 9.95;
    public final static double PackB = 13.95;
    public static void main (String args []){
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the customer package and how many hours had been used ");
        Character pack = in.next().charAt(0);
        pack = Character.toUpperCase(pack);
        Double hours = in.nextDouble();
        Double result;
        switch (pack){
            case ('A'):
                if (hours <= 10)
                System.out.println("Customer bill per month is $ 9,95");
            else if(hours >= 11){
                result = ((hours - 10)* 2) + PackA;
                System.out.println("Customer bill for this month is " + result);
            }
            break;
            case ('B'):
            if (hours <= 20)
                System.out.println("Customer bill per month is $ 13,95 ");
            else if (hours >= 21){
                result = ((hours - 20 )* 1) + PackB;
                System.out.println("Customer bill for this month is " + result);
            }
            break;
            case ('C'):
            System.out.println("Customer bill for this month is $ 19,95");
            default:
                System.out.println("Invalid input !");
                break;
        }
    }
}
