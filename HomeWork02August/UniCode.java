package TekwillCourses.HomeWork02August;

import java.util.Scanner;

public class UniCode {
    public static void main (String args[]){
        Scanner in = new Scanner(System.in);
        System.out.println("Enter a character : ");
        String i = in.nextLine();
        Character ch = i.charAt(0);
        System.out.println("The Unicode for the character " + i + " is " + (int)ch);
    }
}
