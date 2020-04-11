package TekwillCourses.HomeWork02September.PentagonalNumbers;

public class PentagonalUtilities {
    private static final int NUMBER_PENTAGON = 100;
    private static final int NUMBER_PER_LINE = 10;

    public static void checkThePentagonalNumber() {
        System.out.println("The first 100 pentagol, ten per line: ");
        for (int i = 1; i <= NUMBER_PENTAGON; i++) {
            if (i % NUMBER_PER_LINE == 0)
                System.out.printf("%7d\n", getPentagonalNumber(i));
            else
                System.out.printf("%7d", getPentagonalNumber(i));
        }
    }

    public static int getPentagonalNumber(int n) {
        return (n * (3 * n - 1)) / 2;
    }
}
