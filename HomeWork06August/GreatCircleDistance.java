package TekwillCourses.HomeWork06August;

import java.util.Scanner;

public class GreatCircleDistance {
    public static void main (String args[]){
        Scanner in = new Scanner(System.in);
        System.out.println("Enter three points for a triangle : ");
        Double x1 = in.nextDouble();
        Double y1 = in.nextDouble();
        Double x2 = in.nextDouble();
        Double y2 = in.nextDouble();
        Double x3 = in.nextDouble();
        Double y3 = in.nextDouble();
        Double side1 =  Math.pow(Math.pow(x2 - x1, 2) + Math.pow(y2 - y1, 2),0.5);
        Double side2 = Math.pow(Math.pow(x3-x2,2) + Math.pow(y3-y2,2),0.5);
        Double side3 = Math.pow(Math.pow(x1-x3,2) + Math.pow(y1-y3,2),0.5);
        Double s = (side1+side2+side3)/2;
        Double area = Math.sqrt(s * (s-side1) * (s-side2) * (s-side3));
        System.out.println("The area of the triangle is " + area);
    }
}
