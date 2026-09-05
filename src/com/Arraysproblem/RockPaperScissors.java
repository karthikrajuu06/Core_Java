package com.Arraysproblem;

import java.util.Random;
import java.util.Scanner;

public class RockPaperScissors {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        String[] choices = {"Rock", "Paper", "Scissors"};
        String[] symbols = {"R", "P", "S"};
        int[] scores = {0, 0, 0}; // Player Wins, Computer Wins, Ties

        boolean running = true;

        while (running) {
            System.out.println("\n=== Rock-Paper-Scissors ===");
            System.out.println("1. Play Game");
            System.out.println("2. View Score");
            System.out.println("3. Exit");
            System.out.print("Enter your choice: ");

            String menuInput = scanner.nextLine().trim();
            int menuChoice;

            try {
                menuChoice = Integer.parseInt(menuInput);
            } catch (NumberFormatException e) {
                System.out.println("Invalid input. Please enter 1, 2, or 3.");
                continue;
            }

            switch (menuChoice) {
                case 1:
                    playRound(scanner, random, choices, symbols, scores);
                    break;
                case 2:
                    displayScore(scores);
                    break;
                case 3:
                    System.out.println("Thanks for playing!");
                    running = false;
                    break;
                default:
                    System.out.println("Invalid choice. Please try again.");
                    break;
            }
        }

        scanner.close();
    }

    private static void playRound(Scanner scanner, Random random, String[] choices, String[] symbols, int[] scores) {
        int computerIndex = random.nextInt(choices.length);
        String computerChoice = choices[computerIndex];

        int playerIndex = -1;
        while (playerIndex == -1) {
            System.out.print("Enter your choice (R/P/S): ");
            String input = scanner.nextLine().trim().toUpperCase();

            switch (input) {
                case "R":
                    playerIndex = 0;
                    break;
                case "P":
                    playerIndex = 1;
                    break;
                case "S":
                    playerIndex = 2;
                    break;
                default:
                    System.out.println("Invalid input. Please enter R, P, or S.");
                    break;
            }
        }

        System.out.println("Computer chose: " + computerChoice);
        System.out.println("You chose: " + choices[playerIndex]);

        int result = (playerIndex - computerIndex + 3) % 3;

        switch (result) {
            case 0:
                System.out.println("It's a tie!");
                scores[2]++;
                break;
            case 1:
                System.out.println("You win!");
                scores[0]++;
                break;
            case 2:
                System.out.println("Computer wins!");
                scores[1]++;
                break;
        }

        displayScore(scores);
    }

    private static void displayScore(int[] scores) {
        System.out.println("\n=== Score Board ===");
        System.out.println("Player Wins: " + scores[0]);
        System.out.println("Computer Wins: " + scores[1]);
        System.out.println("Ties: " + scores[2]);
    }
}

