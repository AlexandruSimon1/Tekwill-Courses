package TekwillCourses.HomeWork26August.GameRockPaperScrissors;

import java.util.Scanner;

public class RockPaperScrissors {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        RockPaperScrissorsMethod select = new RockPaperScrissorsMethod();
        select.PlayerSelect();
        select.userThrow = in.next();
        select.userThrow = select.userThrow.toUpperCase();
        select.ComputerSelect();
        select.startPlaying();
    }
}
