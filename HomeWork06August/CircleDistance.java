package TekwillCourses.HomeWork06August;

import java.util.Scanner;

public class CircleDistance {
    public static final double radius = 6371.01;
    public static void main (String args[]){
        Scanner in=new Scanner(System.in);
        System.out.println("Enter point 1 (latitude and longitude) in degrees :");
        Double x1 = in.nextDouble();
        Double y1 = in.nextDouble();
        System.out.println("Enter point 2 (latitude and longitude) in degrees :");
        Double x2 = in.nextDouble();
        Double y2 = in.nextDouble();
        x1 = Math.toRadians(x1);
        x2 = Math.toRadians(x2);
        y1 = Math.toRadians(y1);
        y2 = Math.toRadians(y2);
        Double d = radius* Math.acos((Math.sin(x1)*Math.sin(x2))+((Math.cos(x1)*Math.cos(x2)* Math.cos(y1-y2))));
        System.out.println("The distance between the two points is " + d);
    }
}
