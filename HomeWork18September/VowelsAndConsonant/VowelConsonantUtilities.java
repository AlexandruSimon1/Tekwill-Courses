package TekwillCourses.HomeWork18September.VowelsAndConsonant;

import java.util.Scanner;

public class VowelConsonantUtilities {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the words");
        String word = in.nextLine();
        StringWapper wrapperString = new StringWapper(word);
        boolean isRunning = true;

        while (isRunning) {
            showMenu();
            System.out.println("Choice");
            String choice = in.nextLine();
            switch (choice) {
                case "a":
                    System.out.println("Number of vowels " + wrapperString.getNumberOfVowel());
                    break;
                case "b":
                    System.out.println("Number of consonants " + wrapperString.getNumberofCOnsanants());
                    break;
                case "c":
                    System.out.println("Number of vowel and consonants is " + wrapperString.getNumberOfVowel() + wrapperString.getNumberofCOnsanants());
                    break;
                case "d":
                    System.out.println("Please enter another string");
                    word=in.nextLine();
                    wrapperString = new StringWapper(word);
                    break;
                case"e":
                    isRunning=false;
                    break;
                default:
                    System.out.println("Wrong value please try again");
            }
        }
    }

    public static void showMenu() {
        System.out.println("<< Menu >>");
        System.out.println("a. Count the number of vowels in the string");
        System.out.println("b. Count the number of consonants in the string");
        System.out.println("c. Count both number of consonants and vowels in the string");
        System.out.println("d. Enter another string");
        System.out.println("e. Exit program");
    }
}
