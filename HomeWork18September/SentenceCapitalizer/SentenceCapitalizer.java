package TekwillCourses.HomeWork18September.SentenceCapitalizer;

import java.util.Scanner;

public class SentenceCapitalizer {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Please input your sentence: ");
        String uncapitalizedSentence = in.nextLine();
        String capitalizedSentence = "";
        for (int i = 0; i < uncapitalizedSentence.length() - 1; i++) {
            if (i == 0) {
                capitalizedSentence += uncapitalizedSentence.substring(i, i + 1).toUpperCase();
                capitalizedSentence += uncapitalizedSentence.substring(i + 1, i + 2);
            } else if (uncapitalizedSentence.charAt(i - 1) == '.' && uncapitalizedSentence.charAt(i) == ' ') {
                capitalizedSentence += uncapitalizedSentence.substring(i + 1, i + 2).toUpperCase();
            } else {
                capitalizedSentence += uncapitalizedSentence.substring(i + 1, i + 2);
            }
        }
        System.out.println(capitalizedSentence);
    }
}
