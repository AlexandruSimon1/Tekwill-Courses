package TekwillCourses.HomeWork31July;

import java.util.Scanner;

public class TaxAdded {
    public static final int TAX = 5;
    public static void main(String args[]){
        double amount;
        double results;
        double tax;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter an amount ");
        amount = scanner.nextDouble();

        tax = (amount * TAX) /100;
        results = amount + tax;
        System.out.println(results + " Amount with the taxes");
    }
}
