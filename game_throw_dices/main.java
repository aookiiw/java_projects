package game_throw_dices;

import java.util.Scanner;
import java.util.Random;

public class main {
    public static Scanner input = new Scanner(System.in);
    public static Random rand = new Random();
    public static boolean win = false, lose = false;

    static int showMenu() {
        System.out.println("- - - - - - - - - - - -");
        System.out.println("1. Play game");
        System.out.println("2. Simulate game");
        System.out.println("3. Help");
        System.out.println("0. Quit");
        System.out.println("- - - - - - - - - - - -");
        int option = input.nextInt();
        return option;
    }

    static void menuAction(int option) {
        while (option != 0) {
            switch (option) {
                case 1:
                    playGame(true);
                    break;
                case 2:
                    simulateGame();
                    break;
                case 3:
                    break;
            }
            option = showMenu();
        }
    }
    static void simulateGame(){
        int wins = 0, loses = 0;
        for (int i = 0; i < 100; i++) {
            playGame(false);
            if (win){
                wins++;
            } else if (lose){
                loses++;
            }
        }
        double winProbability = (double) wins / 100 * 100;
        double loseProbability = (double) loses / 100 * 100;
        showResultsSimulations(wins, loses, winProbability, loseProbability);
    }

    static void showResultsSimulations(int wins, int loses, double winProb, double loseProb){
        System.out.println("- - - - - - - - ");
        System.out.println("Simulation Results:");
        System.out.println("Wins: " + wins);
        System.out.println("Loses: " + loses);
        System.out.println("Win Probability: " + winProb + "%");
        System.out.println("Lose Probability: " + loseProb + "%");
        System.out.println("- - - - - - - - ");
    }
    static void playGame(boolean manual) {
        int diceOne, diceTwo, result, point = 0;
        int iteration = 0;
        win = false;
        lose = false;


        while (!win && !lose) {
            if (manual) {
                System.out.println("Press ENTER to throw the dices...");
                input.nextLine();
            }

            diceOne = rand.nextInt(6) + 1;
            diceTwo = rand.nextInt(6) + 1;
            result = diceOne + diceTwo;

            if (iteration == 0) {point = result;}

            showResults(diceOne, diceTwo, result, point);

            if (iteration == 0) {
                win = checkWinOrLose(1, point);
                lose = checkWinOrLose(2, point);
            } else {
                if (point == result) {
                    win = true;
                } else if (result == 7) {
                    lose = true;
                }
            }
            iteration++;
        }
        if (win){
            System.out.println("YOU WON!");
        } else {
            System.out.println("YOU LOST :с");
        }
    }

    static void showResults(int diceOne, int diceTwo, int result, int point) {
        System.out.println("- - - - - - - - - - - - - -");
        System.out.println("Dice one: " + (diceOne));
        System.out.println("Dice two: " + (diceTwo));
        System.out.println("Result: " + result);
        System.out.println("Point: " + point);
    }

    static boolean checkWinOrLose(int num, int point) {
        if (num == 1) {
            return point == 7 || point == 11;
        } else {
            return point == 2 || point == 3 || point == 12;
        }
    }

    public static void main(String[] args) {
        int option = showMenu();
        menuAction(option);
    }
}