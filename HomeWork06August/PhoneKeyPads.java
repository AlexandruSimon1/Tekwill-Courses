package TekwillCourses.HomeWork06August;

import java.util.Scanner;

public class PhoneKeyPads {
    public static void main(String args[]) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter a letter ");
        Integer number;
        Character ch = in.next().charAt(0);
        ch = Character.toUpperCase(ch);
        if (ch == 'A' || ch == 'B' || ch == 'C') {
            number = 2;
            System.out.println("The corresponding number is " + number);
        } else if (ch == 'D' || ch == 'E' || ch == 'F') {
            number = 3;
            System.out.println("The corresponding number is " + number);
        } else if (ch == 'G' || ch == 'H' || ch == 'I') {
            number = 4;
            System.out.println("The corresponding number is " + number);
        }
        else if (ch == 'J'||ch=='K'||ch =='L'){
            number = 5;
            System.out.println("The corresponding number is " + number);
        }
        else if (ch == 'M'||ch=='N'||ch =='O'){
            number = 6;
            System.out.println("The corresponding number is " + number);
        }
        else if (ch == 'P'||ch=='Q'||ch=='R'||ch =='S'){
            number = 7;
            System.out.println("The corresponding number is " + number);
        }
        else if (ch == 'T'||ch=='U'||ch=='V'){
            number = 8;
            System.out.println("The corresponding number is " + number);
        }
        else if (ch == 'W'||ch=='X'||ch=='Y'||ch =='Z'){
            number = 9;
            System.out.println("The corresponding number is " + number);
        }
        else {
            System.out.println(ch + " is invalid input");
        }
    }
}
