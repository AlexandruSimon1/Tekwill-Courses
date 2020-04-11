package TekwillCourses.HomeWork18September.BackWord;

import java.util.Scanner;

public class BackWordUtilities {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String word;
        System.out.println("Enter the words");
        word=in.nextLine();
        reverse(word);
    }

    public static void reverse(String word) {
        System.out.println("Reversed word: ");
        for (int i = 0; i < word.length(); i++)
            System.out.print(word.charAt(word.length() - 1 - i));

        System.out.println();
    }
}
