package TekwillCourses.HomeWork09August;

import java.util.Scanner;

public class AlphabetCheck {
    public static void main (String args []){
        Scanner in = new Scanner(System.in);
        System.out.println("Enter alphabet ");
        boolean vowel = false;
        Character alphabet = in.next().charAt(0);
        alphabet = Character.toUpperCase(alphabet);
        switch (alphabet){
            case ('A') :
            case ('E') :
            case ('I') :
            case ('O') :
            case ('U') :
                vowel = true;
                default:
                    System.out.println("Not an alphabet !");
                    break;
        }
        if (vowel == true){
            System.out.println(alphabet + " is a vowel");
        }
        else {
            if(alphabet >= 'A'&& alphabet <= 'Z')
                System.out.println(alphabet +" is a consonant");
            else
                System.out.println("Input is not an alphabet");
        }
    }
}

