package TekwillCourses.HomeWork16August;

public class ConversionKilogramsToPounds {
    public static final double Conversion_Pounds = 2.2;
    public static void main (String args[]){
        System.out.println("Kilograms    "+"  Pounds " + "   |  " + "     Pounds   "  + "      Kilograms  ");
        for(int kilo = 1,pounds = 20;kilo<=199 && pounds <= 515 ; kilo+=2, pounds +=5){
            System.out.printf("%-12d%7.1f",kilo ,(kilo*Conversion_Pounds));
            System.out.print("      |        ");
            System.out.printf("%-9d%12.2f\n" , pounds ,(pounds/Conversion_Pounds));
        }
    }
}
