package TekwillCourses.HomeWork28August.GameCraps;

public class CrapsMethod {
    public void printResults() {
        int breakpoint = rollDices();
        int result = getResult(breakpoint);
        if (naturalCraps(result))
            printScores(result);
        else
            rollTillWin(result);
    }

    public  int rollDice() {
        return (int) (1 + Math.random() * 6);
    }

    public  int rollDices() {
        int dice1 = rollDice();
        int dice2 = rollDice();
        int sum = dice1 + dice2;
        System.out.println("You rolled " + dice1 + " + " + dice2 + " = " + sum);
        return sum;
    }

    public  int getResult(int breakpoint) {
        switch (breakpoint) {
            case 2:
            case 3:
            case 12:
                breakpoint = 0;
                break;
            case 7:
            case 17:
                breakpoint = 1;
                break;
        }
        return breakpoint;
    }

    public  void printScores(int result) {
        if (result == 0)
            System.out.println("You lose");
        else if (result == 1)
            System.out.println("You win");
    }

    public  boolean naturalCraps(int result) {
        return result == 0 || result == 1;
    }

    public  void rollTillWin(int breakpoint) {
        int result;
        do {
            result = rollDices();
        } while (result != breakpoint && result != 7);
        if (result == 7)
            printScores(0);
        else
            printScores(1);
    }
}
