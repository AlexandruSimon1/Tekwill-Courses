package TekwillCourses.HomeWork31July;
import java.util.Scanner;

public class MessureHeight{
    public static void main(String args[]){
        int feet;
        int inches;
        int remainingInches;
        Scanner scanner = new Scanner(System.in);
        System.out.println("How many inches? ");
        inches = scanner.nextInt();
        feet = inches/12;
        remainingInches = inches%12;
        System.out.println(feet + " feet " + remainingInches + " inches ");
    }
}