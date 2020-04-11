package TekwillCourses.HomeWork26August.DisplayCharacters;

public class DisplayMethod {
    public static void printChars(char ch1, char ch2, int numberPerLine) {
        for (char c = ch1, count = 1; c <= ch2; c++, count++) {
            if (count % numberPerLine == 0)
                System.out.println(c);
            else
                System.out.print(c + " ");
        }
    }
}
