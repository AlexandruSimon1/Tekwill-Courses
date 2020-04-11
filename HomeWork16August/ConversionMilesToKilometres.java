package TekwillCourses.HomeWork16August;

public class ConversionMilesToKilometres {
    public static final double Conversion_Kilometres = 1.609;
    public static void main (String args[]){
        System.out.println("Miles    " + "  Kilometres");
        for(int miles = 1;miles<= 10;miles++){
            System.out.printf("%-13d%-10.3f\n", miles ,(miles *Conversion_Kilometres));
        }
    }
}
