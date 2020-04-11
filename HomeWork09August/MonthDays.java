package TekwillCourses.HomeWork09August;

import java.util.Scanner;

public class MonthDays {
    public static void main (String args []){
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the month number ");
        Integer month = in.nextInt();
        switch (month){
            case (1):
                System.out.println("Total number of days = 31");
                break;
            case (2):
                System.out.println("Total number of days = 28");
                break;
            case (3):
                System.out.println("Total number of days = 31");
                break;
            case (4):
                System.out.println("Total number of days = 30");
                break;
            case (5):
                System.out.println("Total number of days = 31");
                break;
            case (6):
                System.out.println("Total number of days = 30");
                break;
            case (7):
                System.out.println("Total number of days = 31");
                break;
            case (8):
                System.out.println("Total number of days = 31");
                break;
            case (9):
                System.out.println("Total number of days = 30");
                break;
            case (10):
                System.out.println("Total number of days = 31");
                break;
            case (11):
                System.out.println("Total number of days = 30");
                break;
            case (12):
                System.out.println("Total number of days = 31");
                break;
                default:
                    System.out.println("Not a month!");
                    break;
        }
    }
}
