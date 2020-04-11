package TekwillCourses.HomeWork02August;

import java.util.Scanner;

public class VowelConsonant {
    public static void main(String args[]) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter a letter grade : ");
        Character grade = in.next().charAt(0);
        if (grade == 'a' || grade == 'e' || grade == 'i' || grade == 'o' || grade == 'u' || grade == 'A'|| grade =='E'||grade =='I'||grade=='O'||grade=='U'){
            System.out.println(grade + " is a vowel");
        }
        else if ((grade>='a'&& grade<='z')||(grade>='A'&& grade<='Z')){
            System.out.println(grade + " is a consonant");
        }
        else {
            System.out.println(grade + " is an invalid input");
        }
    }
}
