package TekwillCourses.HomeWork13September.Emirp;

public class EmirpUtilities {
    public void empirNumbers(int numberPrime) {
        final int PRIME_NUMBERS = 10;
        int count = 0;
        int number = 2;
        while (count < numberPrime) {
            if (isPrime(number)) {
                count++;
                if (count % PRIME_NUMBERS == 0)
                    System.out.printf("%-5s\n", number);
                else
                    System.out.printf("%-5s", number);
            }
            number++;
        }
    }

    public boolean isPrime(int number) {
        for (int i = 2; i <= number / 2; i++) {
            if (number % i == 0)
                return false;
        }
        return true;
    }

    public boolean isPalindrome(int number) {
        return number == reverse(number) ? true : false;
    }

    public int reverse(int number) {
        String reverse = "";
        String n = number + "";
        for (int i = n.length() - 1; i >= 0; i--) {
            reverse += n.charAt(i);
        }
        return Integer.parseInt(reverse);
    }


    public boolean isEmpir(int number) {
        return isPrime(number) && !isPalindrome(number) && isPrime(reverse(number));
    }

    public void result() {
        final int NUMBER_OF_EMPIRS = 100;
        final int EMPIRS_PER_LINE = 10;
        int count = 0;
        int num = 2;
        while (count < NUMBER_OF_EMPIRS) {
            if (isEmpir(num)) {
                count++;
                System.out.println(count % EMPIRS_PER_LINE == 0 ? num + "\n" : num + " ");
            }
            num++;
        }
    }

}
