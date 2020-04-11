package TekwillCourses.WorkAtLesson;

import java.util.Scanner;

public class DoWhile {
    public static void main(String args[]){
        Scanner in = new Scanner(System.in);
        boolean exitSelected = false;
        String phrase ="";
        System.out.println("Do While Example");
        do{
            System.out.println("Enter a phrase > ");
            phrase=in.nextLine();
            if (phrase.toLowerCase().equals("exit")){
                exitSelected=true;
            }
            else  {
                System.out.println("Entered [ " + phrase + " ]");
            }
        }
        while (exitSelected == false);
        System.out.println("While Example");
        exitSelected = false;
        while (exitSelected == false){
            System.out.println("Enter a phrase > ");
            phrase=in.nextLine();
            if (phrase.toLowerCase().equals("exit")){
                exitSelected=true;
            }
            else  {
                System.out.println("Entered [ " + phrase + " ]");
            }
        }
    }
}
