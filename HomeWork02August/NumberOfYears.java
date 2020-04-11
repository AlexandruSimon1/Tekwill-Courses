package TekwillCourses.HomeWork02August;

import java.util.Scanner;

public class NumberOfYears {
    public static void main (String args[]){
        Integer min = 60 * 24;
        Integer years = min * 365;
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the number of minutes ");
        Integer minutes = in.nextInt();
        Integer year = minutes / years;
        Integer remain = minutes % years;
        Integer days = remain / min;
        System.out.println(minutes + " minutes is approximately " + year + " years and " + days + " days ");
    }
}
