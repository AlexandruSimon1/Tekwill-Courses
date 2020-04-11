package TekwillCourses.HomeWork02August;

import java.util.Scanner;

public class PentagonArea {
    public static void main (String args[]){
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the length from the center to a vertex : ");
        Double length = in.nextDouble();
        Double s = (2 * length) * Math.sin(Math.PI/5);
        Double area = ( 5 * Math.pow(s,2)) / (4* Math.tan(Math.PI / 5));
        System.out.println("The area of the pentagon is " + area);
    }
}
