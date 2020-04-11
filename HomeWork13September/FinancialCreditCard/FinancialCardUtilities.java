package TekwillCourses.HomeWork13September.FinancialCreditCard;


import java.util.Scanner;

public class FinancialCardUtilities {
    public void enterNumber() {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter a credit card number");
        long number = in.nextLong();
        System.out.println(number + " is " + (isValid(number) ? "valid" : "invalid"));
    }

    public boolean isValid(long number) {
        boolean valid =
                (getSize(number) >= 13 && getSize(number) <= 16) &&
                        (prefixMatched(number, 4) || prefixMatched(number, 5) ||
                                prefixMatched(number, 37) || prefixMatched(number, 6)) &&
                        ((sumOfDoubleEvenPlace(number) + sumOfOddPlace(number)) % 10 == 0);

        return valid;
    }

    public int sumOfDoubleEvenPlace(long number) {
        int sum = 0;
        String num = number + "";
        for (int i = getSize(number) - 2; i >= 0; i -= 2) {
            sum += getDigit(Integer.parseInt(num.charAt(i) + "") * 2);
        }
        return sum;
    }

    public int getDigit(int number) {
        if (number < 9)
            return number;
        else
            return number / 10 + number % 10;
    }

    public int sumOfOddPlace(long number) {
        int sum = 0;
        String num = number + "";
        for (int i = getSize(number) - 1; i >= 0; i -= 2) {
            sum += Integer.parseInt(num.charAt(i) + "");
        }
        return sum;
    }

    public boolean prefixMatched(long number, int d) {
        return getPrefix(number, getSize(d)) == d;
    }

    public int getSize(long d) {
        String num = d + "";
        return num.length();
    }

    public long getPrefix(long number, int k) {
        if (getSize(number) > k) {
            String num = number + "";
            return Long.parseLong(num.substring(0, k));
        }
        return number;
    }
}
