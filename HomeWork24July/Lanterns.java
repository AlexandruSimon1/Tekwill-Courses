public class Lanterns{
    public static void main(String args[]){
        line2();
        line1();
        line3();
        line2();
        line1();
        line4();
    }
    public static void line1(){
        System.out.println("    *****    ");
        System.out.println("  *********  ");
        System.out.println("*************");
    }
    public static void line2(){
        line1();
        System.out.println();
    }
    public static void line3(){
        System.out.println("* | | | | | *");
        System.out.println("*************");
    }
    public static void line4(){
        System.out.println("    *****    ");
        System.out.println("* | | | | | *");
        System.out.println("* | | | | | *");
        System.out.println("    *****    ");
        System.out.println("    *****    ");
    }
}