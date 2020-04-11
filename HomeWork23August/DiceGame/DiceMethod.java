package TekwillCourses.HomeWork23August.DiceGame;

import java.util.Random;

public class DiceMethod {
    Random r = new Random();
    private int numberOfComputerWins = 0;
    private int numberOfUserWins = 0;
    private int numberOfTiedGame = 0;

    public void startPlaying(int numberOFThrows) {

        for (int i = 0; i < numberOFThrows; i++) {
            checkAndIncrement();
        }
    }

    private void checkAndIncrement() {
        int computerThrowResult = r.nextInt(6) + 1;
        int userThrowResult = r.nextInt(6) + 1;
        if (computerThrowResult == userThrowResult)
            numberOfTiedGame++;
        else {
            if (computerThrowResult > userThrowResult)
                numberOfComputerWins++;
            else
                numberOfUserWins++;
        }
    }

    public void printResults() {
        printScores();
        if (numberOfComputerWins + numberOfUserWins + numberOfTiedGame > 0)
            if (numberOfComputerWins != numberOfUserWins)
                System.out.println("Grand winner : " + ((numberOfComputerWins > numberOfUserWins) ? "Computer : " + numberOfComputerWins : "User : " + numberOfUserWins) + " wins");
            else
                System.out.println("There is a tie " + numberOfTiedGame);
        else
            System.out.println("Please play firts!");
    }

    public void printScores() {
        System.out.println("User : " + numberOfUserWins);
        System.out.println("Computer : " + numberOfComputerWins);
        System.out.println("Ties : " + numberOfTiedGame);
    }
}
