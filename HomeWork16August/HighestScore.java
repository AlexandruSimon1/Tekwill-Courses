package TekwillCourses.HomeWork16August;

import java.util.Scanner;

public class HighestScore {
    public static void main(String args[]){
        Scanner in = new Scanner(System.in);
        System.out.println("Enter number of students");
        int number = in.nextInt();
        int bigestScore = 0;
        String bigestScoreName = " ";
        System.out.println("Enter each names of students and the score ");
        for (int i = 0; i <= number ; i++){
            System.out.print("Student : " + (i +1) + "\n Name : ");
            String name = in.next();
            int score = in.nextInt();
            if(score > bigestScore){
                bigestScore = score;
                bigestScoreName = name;
            }
            System.out.println("Student with the bigest score : " + bigestScoreName);
        }
    }
}
