package TekwillCourses.HomeWork02September.PalindromeInteger;

import java.util.Scanner;

public class PalindromeUtilities {
    public  int number;

    public  void getPalindrome() {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter a integer");
        number = in.nextInt();
    }

    public  boolean isPalindrome(int number) {
        return number == reverse(number) ? true : false;
    }

    public  int reverse(int number) {
        String reverse = " ";
        String n = number + "";
        for (int i = n.length() - 1; i >= 0; i--) {
            reverse += n.charAt(i);
        }
        return Integer.parseInt(reverse);
    }
    public  void result(){
        reverse(number);
        System.out.println(number + (isPalindrome(number) ? " is " : " is not ") + "a palindrome.");
    }
}
