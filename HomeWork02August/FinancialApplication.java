package TekwillCourses.HomeWork02August;

import java.util.Scanner;

public class FinancialApplication {
    public static void main(String args[]){
        double gratuity;
        double total;
        Scanner in= new Scanner(System.in);
        System.out.println("Enter the subtotal and a gratuity rate: ");
        double subtotal= in.nextDouble();
        double gratuityrate= in.nextDouble();
        gratuity = (gratuityrate * subtotal) / 100;
        total = subtotal + gratuity;
        System.out.println("The gratuity is " + gratuity + " and total is " + total);
    }
}
