package TekwillCourses.HomeWork02August;

import java.util.Scanner;

public class CheckType {
    public static void main(String args[]){
        Scanner in = new Scanner(System.in);
        System.out.println("Write a number > ");
        Integer a = in.nextInt();
        if (a > Byte.MIN_VALUE && a < Byte.MAX_VALUE){
            System.out.println(a + " fits in byte\n");
        }
        if (a > Short.MIN_VALUE && a < Short.MAX_VALUE){
            System.out.print(a + " fits in short\n");
        }
        if (a > Integer.MIN_VALUE && a < Integer.MAX_VALUE){
            System.out.println(a + " fits in int\n");
        }
        if (a > Long.MIN_VALUE && a < Long.MAX_VALUE ){
            System.out.println( a + " fits in long");
        }
    }
}
