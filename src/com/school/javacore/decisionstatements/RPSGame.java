package com.school.javacore.decisionstatements;

import java.util.Random;
import java.util.Scanner;

public class RPSGame {

    public static void main(String[] args) {
        Scanner userInput = new Scanner(System.in);

        System.out.println("Hello there, plese use (P)aper, (R)ock, (S)issor");

        String usersGuess = userInput.next();

        Random random = new Random();
        int computerGuessNumber = random.nextInt(3);

        String computerGuessText = "";

        switch (computerGuessNumber) {
            case 0:
                computerGuessText = "P";
                break;
            case 1:
                computerGuessText = "R";
                break;
            case 2:
                computerGuessText = "S";
                break;
        }
        System.out.println("Computer guesses " + computerGuessText);
        switch (usersGuess) {
            case "P":
                if (computerGuessText.equals("P")) {
                    System.out.println("Tie");
                } else if (computerGuessText.equals("R")) {
                    System.out.println("User wins ha ha!");
                } else {
                    System.out.println("Computer wins! See you next time!");
                }
                break;
            case "S":
                if (computerGuessText.equals("S")) {
                    System.out.println("Tie");
                } else if (computerGuessText.equals("R")) {
                    System.out.println("User wins ha ha!");
                } else {
                    System.out.println("Compter wins! See you next time!");
                }
                break;
            case "R":
                if (computerGuessText.equals("R")) {
                    System.out.println("Tie");
                } else if (computerGuessText.equals("S")) {
                    System.out.println("User wins ha ha!");
                } else {
                    System.out.println("Compter wins! See you next time!");
                }
                break;
            default:
                System.out.println("Sorry, you can use only P, R or S!");
                break;
        }
    }
}
