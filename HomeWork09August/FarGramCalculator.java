package TekwillCourses.HomeWork09August;

import java.util.Scanner;

public class FarGramCalculator {
    public static void main (String args[]){
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the number of calories and fat grams:");
        Integer calories = in.nextInt();
        Integer fat = in.nextInt();
        Integer results;
        results = (fat * 9)/calories;
        if (results >= 31){
            System.out.println("The food calories is "+ results + " %");
        }
        else if (results <= 30){
            System.out.println("The food calories is low " + results + " %");
        }
    }
}
