package TekwillCourses.HomeWork31July;

import java.util.Scanner;

public class Degrees {
    public static final int MINUTES_COFFICIENT = 60;
    public static final int SECONDS_COEFFICIENT = 3600;

    public static void main(String args[]) {
        int minutes;
        int seconds;
        int degrees;
        double results;
        Scanner scanner = new Scanner(System.in);
        System.out.println("How many degrees? ");
        degrees = scanner.nextInt();

        System.out.println("How many minutes? ");
        minutes = scanner.nextInt();

        System.out.println("How many seconds? ");
        seconds = scanner.nextInt();

        System.out.println(degrees + "degrees " + minutes + "minutes " + seconds + "seconds ");
        results = degrees + (double)minutes/MINUTES_COFFICIENT + (double)seconds/SECONDS_COEFFICIENT;
        System.out.println(results);
    }
}