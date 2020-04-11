package TekwillCourses.HomeWork26August.DisplayCharacters;

public class DisplayCharacter {
    public static int NUMBER_PER_LINE = 10;
    public static void main(String[] args) {
        System.out.println("Characters per 1 to Z");
        DisplayMethod.printChars('1', 'Z', NUMBER_PER_LINE);
        System.out.println();
    }
}
