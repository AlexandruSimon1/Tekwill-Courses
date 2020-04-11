package TekwillCourses.HomeWork31July;

import java.util.Scanner;

public class DriverReport {
    public static void main(String args[]){
        double gallons;
        int miles;
        double results;
        Scanner scanner = new Scanner(System.in);
        System.out.println("How many miles did you drive? ");
        miles = scanner.nextInt();

        System.out.println("How many gallons gassoline did you use?");
        gallons = scanner.nextDouble();

        results = miles / gallons;
        System.out.println(results+ " mpg");
    }
}
