package TekwillCourses.HomeWork09August;

import java.util.Scanner;

public class SpeedOfSound {
    public static void main (String args []){
        Scanner in = new Scanner(System.in);
        System.out.println("Enter in what situation to calculate the speed of sound");
        String situation = in.nextLine();
        System.out.println("Enter the distance ");
        Double distance = in.nextDouble();
        Double time;
//        if (situation.equals("air")){                   // using if and else if
//            time = distance/1100;
//            System.out.println("Total time " + time);
//        }
//        else if (situation.equals("water")){
//            time = distance /4900;
//            System.out.println("Total time "+ time);
//        }
//        else if (situation.equals("steel")){
//            time = distance/16400;
//            System.out.println("Total time " + time);
//        }
        switch (situation){
            case "air":
                time = distance/1100;
                System.out.println("Total time " + time);
                break;
            case "water":
                time = distance /4900;
                System.out.println("Total time "+ time);
                break;
            case "steel":
                time = distance/16400;
                System.out.println("Total time " + time);
                break;
        }
    }
}

