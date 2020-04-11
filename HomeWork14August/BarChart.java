package TekwillCourses.HomeWork14August;

import java.util.Scanner;

public class BarChart {
    public static void main (String args[]){
        Scanner in = new Scanner(System.in);
        Integer i;
        Integer j;
        Integer number;
        System.out.println("Enter five numbers ");
        for (i=0;i < 5;i++){
            number = in.nextInt();
            System.out.printf("%d",number);
            for (j =0; j < number ; j++){
                System.out.printf("*");
            }
            System.out.println();
        }
        return;
    }
}
