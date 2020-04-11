package TekwillCourses.HomeWork16August;

import java.util.Scanner;

public class CountNumbers {
    public static void main(String args[]){
        Scanner in = new Scanner(System.in);
        int positivesNumbers = 0;
        int negativeNumbers = 0;
        int count = 0;
        double result = 0;
        System.out.println("Enter an integer, the input ends if it is 0 : ");
        int number = in.nextInt();
        if (number == 0){
            System.out.println("Entered number is 0");
        }
        while ( number != 0){
            if (number > 0)
                positivesNumbers++;
            else
                negativeNumbers++;
            result +=number;
            count++;
            number = in.nextInt();
        }
        double average = result/count;
        System.out.println("The number of positives is " + positivesNumbers);
        System.out.println("The number of negatives is " + negativeNumbers);
        System.out.println("The total is " + result);
        System.out.println("The average is " + average);
    }
}
