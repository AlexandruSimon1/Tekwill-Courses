package TekwillCourses.HomeWork26August.Convertor;

public class ConvertorKilometresInFeet {
    public static final double Conversion_Metres = 0.305;
    public static void main (String args[]){
        System.out.println("Feet    "+"  Metres " + "   |  " + "     Metres   "  + "      Feet  ");
        for(int feet = 1,metres = 20;feet <= 10 && metres <= 65 ; feet++, metres +=5){
            System.out.printf("%-12d%7.3f",feet ,(feet*Conversion_Metres));
            System.out.print("      |        ");
            System.out.printf("%-9d%12.3f\n" , metres ,(metres/Conversion_Metres));
        }
    }
}
