package TekwillCourses.HomeWork23August.DiceGame;

public class DiceGame {
    public static void main(String[] args) {
        DiceMethod diceGame = new DiceMethod();
        diceGame.startPlaying(10);
        diceGame.printResults();
        diceGame.printScores();
    }
}