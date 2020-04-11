package TekwillCourses.HomeWork26August.ESPGame;

import java.util.Random;

public class ESPMethod {
    private int computer = 0;
    String userPlay = " ";
    String computerPlay = " ";
    Random r = new Random();
    private int numberOfTied = 0;
    private int numberOfLost = 0;

    public void startPlaying() {
        for (int i = 0; i < 10; i++) {
            startGame();
        }
    }

    public void computerSelect() {
        computer = r.nextInt(5) + 1;
        switch (computer) {
            case 1:
                computerPlay = "Red";
                break;
            case 2:
                computerPlay = "Green";
                break;
            case 3:
                computerPlay = "Blue";
                break;
            case 4:
                computerPlay = "Orange";
                break;
            case 5:
                computerPlay = "Yellow";
                break;
        }
        System.out.println("Computer choose this color " + computerPlay);
    }

    public void playerSelect() {
        System.out.println("Please choose one of the following color : Red, Green, Blue, Orange, Yellow");
        System.out.println("Enter the color that you selected :");
    }

    public void startGame() {
        if (userPlay.equals(computerPlay))
            numberOfTied++;
        else if (!userPlay.equals(computerPlay))
            numberOfLost++;
    }

    public void printScores() {
        System.out.println("You guessed the colour " + numberOfTied);
        System.out.println("You didn't guess the color " + numberOfLost);
    }
}
