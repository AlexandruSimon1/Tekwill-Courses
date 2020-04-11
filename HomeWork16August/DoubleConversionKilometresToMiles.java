package TekwillCourses.HomeWork16August;

public class DoubleConversionKilometresToMiles {
    public static final double Conversion_Kilometres = 1.609;
    public static void main (String args[]){
        System.out.println("Miles    "+"  Kilometres " + "   |  " + "     Kilometres   "  + "      Miles  ");
        for(int mile = 1,kilometres = 20;mile <= 10 && kilometres <= 65 ; mile++, kilometres +=5){
            System.out.printf("%-12d%7.3f",mile ,(mile*Conversion_Kilometres));
            System.out.print("      |        ");
            System.out.printf("%-9d%12.3f\n" , kilometres ,(kilometres/Conversion_Kilometres));
        }
    }
}
