package TekwillCourses.HomeWork19August;

public class Summation {
    public static void main(String[] args) {
        double sum = 0;
        for (double i = 1.0; i <= 624.0;i++ ){
            sum += 1/(Math.sqrt(i)+ Math.sqrt(i+1));
        }
        System.out.println("Sum is " + sum);
    }
}
