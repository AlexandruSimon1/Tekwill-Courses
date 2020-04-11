package TekwillCourses.HomeWork02September.SumDigits;

public class SumUtilities {
    private static int sum = 0;

    public static long sumDigits(long n) {
        while (n > 0) {
            sum += n % 10;
            n /= 10;
        }
        return sum;
    }
}
