package TekwillCourses.WorkAtLesson.CrapsGame;

import java.util.Random;

public class CrapsUtility {
    private int firstDiceRolledResult;
    private int secondDiceRolledResult;
    private int establishedPoint;
    private int sumOfRolledDices;
    private Random r = new Random();

    public void play() {
        throwAHandOfDices();
        if (isCraps()) {
            printMessageWithScores("You lose");
        } else if (isNatural()) {
            printMessageWithScores("You win");
        } else {
            establishedPoint = sumOfRolledDices;
            printMessageWithScores("You point is " + establishedPoint);
            continueThrowingUntilGameConditionIsMet();
        }
        reset();
    }

    public void reset() {
        firstDiceRolledResult = 0;
        secondDiceRolledResult = 0;
        establishedPoint = 0;
        sumOfRolledDices = 0;
    }

    private void continueThrowingUntilGameConditionIsMet() {
        boolean conditionsIsMet;
        do {
            throwAHandOfDices();
            if (isSevenOut()) {
                printMessageWithScores("You lose");
                conditionsIsMet = true;
            } else if (isTheSamePoint()) {
                printMessageWithScores("You win");
                conditionsIsMet = true;
            } else {
                conditionsIsMet = false;
            }
        } while (!conditionsIsMet);
    }

    private void throwAHandOfDices() {
        firstDiceRolledResult = rollADice();
        secondDiceRolledResult = rollADice();
        sumOfRolledDices = firstDiceRolledResult + secondDiceRolledResult;
    }

    private int rollADice() {
        return r.nextInt(6) + 1;
    }

    private boolean isCraps() {
        return sumOfRolledDices == 2 || sumOfRolledDices == 3 || sumOfRolledDices == 12;
    }

    private boolean isNatural() {
        return sumOfRolledDices == 7 || sumOfRolledDices == 11;
    }

    private boolean isTheSamePoint() {
        return establishedPoint == sumOfRolledDices;
    }

    private boolean isSevenOut() {
        return sumOfRolledDices == 7;
    }

    private void printRolledResults() {
        System.out.println("You rolled " + firstDiceRolledResult + " + " + secondDiceRolledResult + " = " + sumOfRolledDices);
    }

    private void printMessageWithScores(String message) {
        printRolledResults();
        System.out.println(message);
    }

}
