package TekwillCourses.HomeWork31July;

import java.util.Scanner;

public class WorldPopulation {
    public static final double PROCENT = 100;
    public static void main(String args[]){
        long world;
        long population;
        double results;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter world's population ");
        world = scanner.nextLong();

        System.out.println("Enter US population");
        population = scanner.nextLong();

        results = (population / world) * PROCENT;
        System.out.println("The population of the US is "+ results + "of the world population.");
    }
}
