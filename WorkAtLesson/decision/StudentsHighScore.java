package TekwillCourses.WorkAtLesson.decision;

import java.util.Scanner;

public class StudentsHighScore {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("How many students ?");
        int numberOfStudents = in.nextInt();
        String topFirstStudentName = " Unknown";
        int topFirstHighestScore = 0;
        String topSecondStudentName = "Unknown";
        int topSecondStudentScore = 0;
        for (int i= 0;i< numberOfStudents; i++){
            in.nextLine();
            System.out.println("Enter student name > ");
            String studentName =in.nextLine();
            System.out.println("Enter score > ");
            int studentScore = in.nextInt();

            if (studentScore > topFirstHighestScore){
                topFirstHighestScore = studentScore;
                topFirstStudentName = studentName;
                continue;
            }
            if (studentScore > topSecondStudentScore){
                topSecondStudentScore = studentScore;
                topSecondStudentName = studentName;
            }
        }
        System.out.println(topFirstStudentName + " / " + topFirstHighestScore);
        System.out.println(topSecondStudentName + " / " + topSecondStudentScore);
    }
}
