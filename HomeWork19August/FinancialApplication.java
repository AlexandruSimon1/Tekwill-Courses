package TekwillCourses.HomeWork19August;

import java.util.Scanner;

public class FinancialApplication {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Loan Amount ");
        double loan = in.nextInt();
        System.out.println("Number of Years");
        int years = in.nextInt();
        System.out.println("Interest Rate   " + "          Monthly Payment " + "     Total Payment");
        for (double rate = 5 ; rate <= 8; rate +=0.125){
            System.out.printf("%-5.3f" , rate);
            System.out.print("%                          ");
            double interest = rate /1200;
            double payment = (loan * interest *(Math.pow(1+interest,years *12))/(Math.pow(1+interest,years*12)-1));
            System.out.printf("%-19.2f" , payment);
            System.out.printf("%-8.2f\n" , (payment *12) *years);
        }
    }
}
