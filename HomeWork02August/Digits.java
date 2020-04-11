package TekwillCourses.HomeWork02August;

import java.util.Scanner;

public class Digits {
    public static void main(String args[]){
        int number;
        int firstdigit;
        int seconddigit;
        int thirddigit;
        int fourdigit;
        int fivedigit;
        Scanner in = new Scanner(System.in);
        System.out.println("Type the number ");
        number = in.nextInt();

        firstdigit = number % 10;
        seconddigit = (number / 10) % 10;
        thirddigit = (number / 100) % 10;
        fourdigit = (number / 1000) % 10;
        fivedigit = (number / 10000) % 10;
        System.out.println(fivedigit + " " + fourdigit + " " + thirddigit + " " + seconddigit + " " + firstdigit);
    }
}
