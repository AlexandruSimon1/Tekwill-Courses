package TekwillCourses.HomeWork16August;

public class DifferentDivisible {
    public static final int NUMBERS_PER_LINE = 10;
    public static void main(String[] args) {
        int count = 0;
        for (int i = 100; i <= 200; i++) {
            if (i % 5 == 0 ^ i % 6 == 0) {
                count++;
                if (count % NUMBERS_PER_LINE == 0)
                    System.out.println(i);
                else
                    System.out.print(i + " ");
            }
        }
        System.out.println();
    }
}
