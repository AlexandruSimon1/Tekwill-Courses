package TekwillCourses.HomeWork18September.PasswordVerified;

import java.util.Scanner;

public class PasswordVerified {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        String word;
        System.out.println("Enter the password");
        word=in.nextLine();
        if (verified(word))
            System.out.println("Password is valid");
        else
            System.out.println("Password is invalid");
    }

    public static boolean verified(String password) {
        return ((password.length() == 6) &&
                (password.matches("[A-Z]")) &&
                (password.matches("[a-z]")) &&
                (password.matches("[0-9]"))
        );
    }
}
