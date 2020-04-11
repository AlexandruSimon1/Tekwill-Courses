package TekwillCourses.HomeWork14August;

import java.util.Scanner;

public class SmallestValue {
    public static void main(String args[]){
        Scanner in = new Scanner(System.in);
        System.out.println("Enter some numbers that you want to be compared ");
        Integer value = in.nextInt();
        Integer number2 = in.nextInt();
        for (int i =1 ; i <= value;i++){
            System.out.println("Enter a number");
            Integer number1 = in.nextInt();
            if (i==1)
                number2 = number1;
            else if (number1<number2)
                number2 = number1;
        }
        System.out.println("Smallest number is " + number2);
    }
}
