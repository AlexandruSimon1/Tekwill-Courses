package TekwillCourses.HomeWork02September.SpecifiedCharacter;

import java.util.Scanner;

public class SpecifiedUtilities {
    private static int number = 0;
    private static char ch;
    private static String str = " ";
    private static String string = " ";

    public static void getNumberFromUser() {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter a string followed by character");
        string = in.nextLine();
        number = string.indexOf(", ");
        str = string.substring(0, number);
        ch = string.charAt(number + 2);
        System.out.println("Display the number of characters " + ch + " / " + str + " / " + count(str, ch));
    }


    public static int count(String str, char a) {
        int count = 0;
        for (int i = 0; i < str.length(); i++) {
            if (a == str.charAt(i))
                count++;
        }
        return count;
    }
}
