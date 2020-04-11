package TekwillCourses.HomeWork21August;

public class SimulationRandomNumber {
    public static void main(String[] args) {
        int heads = 0;
        int tails = 0;
        int coins;
        for (int i = 0; i < 1000000; i++) {
            coins = (int) (Math.random() * 2) == 0 ? heads++ : tails++;
        }
        System.out.println("Heads " + heads + " Tails " + tails);
    }
}
