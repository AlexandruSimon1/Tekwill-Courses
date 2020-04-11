package TekwillCourses.HomeWork06August;

import java.util.Scanner;

public class ConvertLetter {
    public static void main(String args[]){
        Scanner in = new Scanner (System.in);
        System.out.println("Enter a letter grade : ");
        Integer letter1;
        Character letter = in.next().charAt(0);
        if (letter =='A'){
            letter1 =4;
            System.out.println("The numeric value for grade " + letter + " is " + letter1);
        }
        else if (letter == 'B'){
            letter1 = 3;
            System.out.println("The numeric value for grade " + letter + " is " + letter1);
        }
        else if (letter == 'C'){
            letter1 = 2;
            System.out.println("The numeric value for grade " + letter + " is " + letter1);
        }
        else if (letter == 'E'){
            letter1 = 1;
            System.out.println("The numeric value for grade " + letter + " is " + letter1);
        }
        else if (letter == 'F'){
            letter1 = 0;
            System.out.println("The numeric value for grade " + letter + " is " + letter1);
        }
        else{
            System.out.println(letter + " is an invalid grade");
        }
    }
}
