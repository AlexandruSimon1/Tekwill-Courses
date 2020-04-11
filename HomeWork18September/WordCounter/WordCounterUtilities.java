package TekwillCourses.HomeWork18September.WordCounter;

import java.util.Scanner;

public class WordCounterUtilities {
    public void word(String[] sentence) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the words");
        for (int i = 0; i <sentence.length; i++) {
            sentence[i]=in.nextLine();
        }
        System.out.println(sentence.length);
    }
}
