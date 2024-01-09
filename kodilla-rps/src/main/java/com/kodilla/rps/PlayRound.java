package com.kodilla.rps;

import java.util.Random;

public class PlayRound {

    public static void playRound(String playerName , int playerScore, int computerScore , char playerMove) {

        Random random = new Random();
        int computerMove = random.nextInt(3) + 1;
        System.out.println("Gracz "+ playerName + " wybrał " +  RpsGame.printRps(playerMove));
        System.out.println("komputer wybrał "+ RpsGame.printRps(computerMove));
        int[][] rules = {
                {0, -1, 1},
                {1, 0, -1},
                {-1, 1, 0}
        };
        int roundResul = rules[playerMove - 1][computerMove - 1]; // <---- Zapytaj oco biega czemu tutaj jest - 1 zjechane z neta


        if (roundResul == 1) {
            RpsGame.playerScore++;
            System.out.println("Wygrywa " + playerName);

        } else if (roundResul == -1) {
            RpsGame.computerScore++;
            System.out.println("Wygrywa komputer \n");

        } else {
            System.out.println("Remis \n");
        }


        System.out.println(playerName+": "+  playerScore);
        System.out.println("Computer: "+  computerScore);
    }
}
