package TekwillCourses.HomeWork19August;

public class PatternB {
    public static void main(String[] args) {
        System.out.println("Pattern B");
        for (int rows = 6; rows >= 1 ; rows--){
            for (int columns = 1 ; columns <=rows ; columns ++){
                System.out.print(columns + " ");
            }
            System.out.println();
        }
    }
}
