package TekwillCourses.HomeWork20September.WordSeparator;

import java.util.Scanner;

public class WordSeparatorUtilities {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the sentence that you want to separate");
        String unseparatedWord=in.nextLine();
        String separatedWord="";
        for (int i = 0; i <unseparatedWord.length()-1 ; i++) {
            char a=unseparatedWord.charAt(i);
            if (Character.isUpperCase(a)){
                separatedWord+=" "+a;
            }
        }
        System.out.println(separatedWord);
    }
}
