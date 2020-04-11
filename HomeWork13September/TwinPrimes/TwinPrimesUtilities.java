package TekwillCourses.HomeWork13September.TwinPrimes;

public class TwinPrimesUtilities {
    public void primeNumbers(int numberPrime) {
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

    public boolean isTwinPrime(int number) {
        return isPrime(number) && isPrime(number + 2);
    }

    public void result() {
        System.out.println();
        for (int i = 2; i < 1000; i++) {
            if (isTwinPrime(i))
                System.out.println("(" + i + ", " + (i + 2) + ")");
        }
    }
}
