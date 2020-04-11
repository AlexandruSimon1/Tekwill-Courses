package TekwillCourses.HomeWork12August;

import java.util.Scanner;

public class DistanceTraveled {
    public static void main(String args[]){
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the speed and time for the vehicle");
        Integer speed = in.nextInt();
        Integer time = in.nextInt();
        Integer distance = speed * time;
        for ( int x = 1 ; x<= time ;x = time) {
            System.out.println(time + "   "  + distance );
        }
    }
}
