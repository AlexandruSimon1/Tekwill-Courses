package TekwillCourses.HomeWork26August.GameRockPaperScrissors;

import java.util.Random;

public class RockPaperScrissorsMethod {
    private int computer = 0;
    Random generator = new Random();
    String computerPlay = " ";
    String userThrow = " ";

    public void ComputerSelect() {

        computer = generator.nextInt(3) + 1;
        if (computer == 1)
            computerPlay = "ROCK";
        else if (computer == 2)
            computerPlay = "PAPER";
        else if (computer == 3)
            computerPlay = "SCISSORS";
        System.out.println("Computer play is: " + computerPlay);
    }

    public void PlayerSelect() {
        System.out.println("Please choose one of the following Rock, Paper, Scissors!");
        System.out.println("Enter your play: ");
    }

    public void startPlaying() {
        if (userThrow.equals(computerPlay))
            System.out.println("It's a tie!");
        else if (userThrow.equals("ROCK"))
            if (computerPlay.equals("SCISSORS"))
                System.out.println("Rock crushes scissors. You win!");
            else if (computerPlay.equals("PAPER"))
                System.out.println("Paper eats rock. You lose!!");
            else if (userThrow.equals("PAPER"))
                if (computerPlay.equals("SCISSORS"))
                    System.out.println("Scissor cuts paper. You lose!");
                else if (computerPlay.equals("ROCK"))
                    System.out.println("Paper eats rock. You win!");
                else if (userThrow.equals("SCISSORS"))
                    if (computerPlay.equals("PAPER"))
                        System.out.println("Scissor cuts paper. You win!");
                    else if (computerPlay.equals("ROCK"))
                        System.out.println("Rock breaks scissors. You lose!");
                    else
                        System.out.println("Invalid user input.");
    }
}
