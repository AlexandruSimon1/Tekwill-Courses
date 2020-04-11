package TekwillCourses.HomeWork09August;

import java.util.Scanner;

public class InternetServiceSave {
    public final static double PackA = 9.95;
    public final static double PackB = 13.95;
    public final static double PackC = 19.95;
    public static void main (String args []){
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the package and the amount of hours used ");
        Character pack = in.next().charAt(0);
        pack = Character.toUpperCase(pack);
        Double hours = in.nextDouble();
        Double result;
        Double saved;
        switch (pack) {
            case ('A'):
                if (hours <= 10)
                    System.out.println("Customer will pay the lowest price for the package A");
                else if (hours >= 11 && hours <= 15) {
                    result = (((hours - 10) * 2) + PackA) - PackB;
                    System.out.println("Customer would save with package B $ " + result);
                    System.out.println("Customer would have unlimited internet with package C just for $ 19,95 ");
                } else if (hours >= 16) {
                    result = (((hours - 10) * 2) + PackA) - PackB;
                    saved = (((hours - 10) * 2) + PackA) - PackC;
                    System.out.println("Customer would save with package B $ " + result);
                    System.out.println("Customer would save with package C $ " + saved);
                }
                break;
            case ('B'):
                if (hours <= 26){
                    result = (((hours - 20) * 1) + PackB) - PackC;
                System.out.println("Customer would have unlimited internet with package C paying just more $ " + result);
        }
                else if (hours >= 27 ){
                    result = (((hours - 20) * 1) + PackB) - PackC;
                    System.out.println("Customer would save with package C $ " + result);
                }
                default:
                    System.out.println("Invalid input!");
                    break;
        }
    }
}
