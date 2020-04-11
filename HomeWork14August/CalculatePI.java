package TekwillCourses.HomeWork14August;

public class CalculatePI {
    public static final double number = 4;
    public static void main(String args[]){
     double i;
     double series = 1;
     double pi = 0;
     for (i = 1; i <= 200_00; i +=2){
         pi =pi+series*(number / i);
         series = -series;
     }
     System.out.println("Approximated PI value is " + pi);
    }
}
