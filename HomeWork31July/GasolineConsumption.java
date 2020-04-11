package TekwillCourses.HomeWork31July;

import java.util.Scanner;

public class GasolineConsumption {
    public static final double KM_COFFICIENT = 1.609;
    public static final double LITERS_COFFICIENT = 3.785;
    public static final int KM = 100;
    public static void main(String args[]){
        double miles;
        double gallons;
        double liters;
        double results;
        double european;
        double kilo;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter gasoline consumption ");
        liters = scanner.nextDouble();

        System.out.println("How many kilometers did you drive?");
        kilo = scanner.nextDouble();

        european = liters / kilo;
        System.out.println(european + " km's per litre European Style");

        gallons = liters / LITERS_COFFICIENT;
        miles = kilo / KM_COFFICIENT;
        results = miles / gallons;
        System.out.println(results + " mpg");
    }
}
