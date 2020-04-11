package TekwillCourses.HomeWork28August.CheckPassword;

import java.util.Scanner;

public class CheckPassword {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        CheckPasswordMethod enterPassword = new CheckPasswordMethod();
        enterPassword.enterPassword();
        enterPassword.password = in.nextLine();
        enterPassword.checkPassword();
    }
}
