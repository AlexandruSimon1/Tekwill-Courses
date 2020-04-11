package TekwillCourses.HomeWork02August;

import java.util.Scanner;

public class CylinderVolume {
    public static void main(String args[]){
        Double area;
        Double volume;
        Scanner in=new Scanner(System.in);
        System.out.println("Enter the radius and length of a cylinder: ");
        Double radius = in.nextDouble();
        Double length = in.nextDouble();
        area = ((radius*radius)*Math.PI);
        volume = area * length;
        System.out.println("The area is " + area);
        System.out.println("The volume is " + volume);
    }
}
