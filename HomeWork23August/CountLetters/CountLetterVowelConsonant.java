package TekwillCourses.HomeWork23August.CountLetters;

import java.util.Scanner;

public class CountLetterVowelConsonant {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter a string:");
        String stringToCheck = in.nextLine();


        System.out.println("The number of vowels is " + CountLetterMethod.countVowelLetters(stringToCheck));
        System.out.println("The number of consonants is " + CountLetterMethod.countConsonantLetters(stringToCheck));
        System.out.println(CountLetterMethod.isConsonant('d'));
        System.out.println(CountLetterMethod.isConsonant('e'));
    }
}
