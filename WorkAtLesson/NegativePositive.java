package TekwillCourses.WorkAtLesson;

import java.util.Scanner;

public class NegativePositive {
    public static void main(String args[]){
        Scanner in= new Scanner(System.in);
        System.out.println("Enter five numbers");
        Integer a = in.nextInt();
        Integer b = in.nextInt();
        Integer c = in.nextInt();
        Integer countOfPositiveNumbers=0;
        Integer countOfNegativeNumbers=0;
        Integer countOfZero=0;

        if (a>0){
            countOfPositiveNumbers++;
        }
        else if (a<0){
            countOfNegativeNumbers++;
        }
        else{
            countOfZero++;
        }
        if (b>0){
            countOfPositiveNumbers++;
        }
        else if (b<0){
            countOfNegativeNumbers++;
        }
        else{
            countOfZero++;
        }
        if (c>0){
            countOfPositiveNumbers++;
        }
        else if (c<0){
            countOfNegativeNumbers++;
        }
        else{
            countOfZero++;
        }
        System.out.println(countOfPositiveNumbers);
        System.out.println(countOfNegativeNumbers);
        System.out.println(countOfZero);
    }
}
