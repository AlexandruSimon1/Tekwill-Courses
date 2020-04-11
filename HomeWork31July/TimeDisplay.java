package TekwillCourses.HomeWork31July;

import java.util.Scanner;

public class TimeDisplay {
    public static final int DAYS_COFFICIENT = 86400;

    public static void main(String args[]){
        double seconds;
        double minutes;
        double hours;
        double days;
        double remainingminutes;
        double remaininghours;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a number of seconds");
        seconds = scanner.nextInt();

        days = (seconds / DAYS_COFFICIENT);
        remaininghours = days%365;

        hours = remaininghours * 24 ;
        remainingminutes = hours % 24;

        minutes = remainingminutes * 60;
        remainingminutes = minutes % 60;
        seconds = remainingminutes %60;
        System.out.println((int)days + " days "+ hours + " hours " + remainingminutes + " minutes " + seconds + " seconds ");
    }
}
