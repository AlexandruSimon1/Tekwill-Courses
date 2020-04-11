package TekwillCourses.HomeWork12August;

public class ProductOfOddIntegers {
    public static void main (String args[]){
        Integer number = 1;
        for (int x = 3; x <= 15; x+=2)
            number *=x;
        System.out.println("Result is " + number);
    }
}
