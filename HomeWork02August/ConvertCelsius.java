package TekwillCourses.HomeWork02August;

import java.util.Scanner;

public class ConvertCelsius {
    public static void main (String args[]){
        Scanner in=new Scanner(System.in);
        System.out.println("Enter a degree in Celsius : ");
        Double celsius = in.nextDouble();
        Double fahrenheit = ((9.0 / 5) *celsius) +32;
        System.out.println(celsius + " Celsius is "+ fahrenheit + " Fahrenheit");
    }
}
