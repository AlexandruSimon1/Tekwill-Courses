package TekwillCourses.HomeWork21August.ISBN;

public class ISBNMethod {
    String computeFullLengthISBN(String isbn) {
        if (isbn.length() != 12)
            return "Invalid input";
        int result = 0;
        for (int i = 0; i < isbn.length(); i++) {
            Character.getNumericValue(isbn.charAt(i));
            if (i % 2 == 0)
                result += Character.getNumericValue(isbn.charAt(i));
            else
                result += Character.getNumericValue(isbn.charAt(i)) * 3;
        }
        result = 10 - result % 10;
        if (result == 10)
            result = 0;
        return isbn + result;
    }
}
