package TekwillCourses.HomeWork26August.ESPGame;

import java.util.Scanner;

public class ESPGame {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        ESPMethod select = new ESPMethod();
        select.playerSelect();
        select.userPlay = in.nextLine();
        select.userPlay = select.userPlay.toUpperCase();
        select.startPlaying();
        select.computerSelect();
        select.printScores();
    }
}
