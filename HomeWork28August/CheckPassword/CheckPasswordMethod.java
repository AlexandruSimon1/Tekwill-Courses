package TekwillCourses.HomeWork28August.CheckPassword;

public class CheckPasswordMethod {
    private static int numberOfDigits = 0;
    private static final int LENGTH_OF_PASSWORD = 8;
    private static final int MINIMUM_DIGITS = 2;
    String password = " ";

    public void enterPassword() {
        System.out.println("Enter a password");
    }

    public void checkPassword() {
        System.out.println((validPassword(password) ? "Valid" : "Invalid") + " Password");
    }

    public static boolean validPassword(String password) {
        boolean validPassword = lengthValid(password, LENGTH_OF_PASSWORD) && includeLettersAndDigits(password) && hasDigits(password, MINIMUM_DIGITS);
        return validPassword;
    }

    public static boolean lengthValid(String password, int validLength) {
        return password.length() >= validLength;
    }

    public static boolean includeLettersAndDigits(String password) {
        for (int i = 0; i < password.length(); i++) {
            if (!Character.isLetterOrDigit(password.charAt(i)))
                return false;
        }
        return true;
    }

    public static boolean hasDigits(String password, int n) {
        for (int i = 0; i < password.length(); i++) {
            if (Character.isDigit(password.charAt(i)))
                numberOfDigits++;
            if (numberOfDigits >= n)
                return true;
        }
        return false;
    }
}
