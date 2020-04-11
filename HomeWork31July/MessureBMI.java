package TekwillCourses.HomeWork31July;

import java.util.Scanner;

public class MessureBMI{
    public static final int FEET_CONVERSION = 12;
    public static final double POUNDS = 2.2;
    public static final double METERS_CONVERSION = 0.0254;
    public static void main(String args[]){
        int inches;
        int feet;
        int pounds;
        int remaininginches;
        double meters;
        double kilograms;
        double bmi;
        Scanner scanner = new Scanner(System.in);
        System.out.println("What is the height? ");
        inches = scanner.nextInt();

        feet = inches / FEET_CONVERSION;
        remaininginches = inches%12;
        System.out.println(feet +" height " + remaininginches + " inches ");

        meters = (double) inches * METERS_CONVERSION;
        System.out.println(meters + " meters");

        System.out.println("What is the weight? ");
        pounds = scanner.nextInt();
        kilograms = pounds / POUNDS;
        System.out.println(kilograms + " kilograms ");

        System.out.println("What is your BMI? ");
        bmi = (kilograms) / (meters * meters);
        System.out.println(bmi);
    }
}