package com.kodilla.rps;

import java.util.Random;

public class RpsGams {

    private String playerName;
    private int roundsToWin;
    public int playerScore;
    public int computerScore;
    private int[][] rules = new int[][]{
            {0, -1, 1},
            {1, 0, -1},
            {-1, 1, 0}
    };
    int playerMove; //<--- gdzie to najlepiej umieścić
    public RpsGams(String playerName, int roundsToWin) {
        this.playerName = playerName;
        this.roundsToWin = roundsToWin;
        this.playerScore = 0;
        this.computerScore = 0; //<--- czemu poprawiło mi na 0 ? i ...

    }
    public void displayGameInfo() {
        System.out.println("Zasady gry:");
        System.out.println("1 - kamien , 2- papier , 3- nozyce ");
        System.out.println("Kamień zgniata nożyce, \nNożyce tną papier, \nNapier przykrywa kamień");
        System.out.println("\nAby zakończyć grę, wciśnij 'x'. Aby rozpocząć nową grę, wciśnij 'n'.");
        System.out.println("\nIlość wygranych rund :" + roundsToWin);
    }
    public void playRound() {

        Random random = new Random();
        int computerMove = random.nextInt(3) + 1;
        System.out.println("Gracz "+ playerName + " wybrał " + printRps(playerMove));
        System.out.println("komputer wybrał "+ printRps(computerMove));
        int roundResul = rules[playerMove - 1][computerMove - 1]; // <---- Zapytaj oco biega czemu tutaj jest - 1 zjechane z neta


        if (roundResul == 1) {
            playerScore++;
            System.out.println("Wygrywa " + playerName);
        } else if (roundResul == -1) {
            computerScore++;
            System.out.println("Wygrywa komputer \n");
        } else {
            System.out.println("Remis \n");
        }

    }
    public void isEnd() {

        if (playerScore == roundsToWin) {
            System.out.println("Koniec gry ");
            System.out.println("Wygrywa gracz " + playerName);
            System.out.println("Z wynikiem :"+ playerScore+ ":" + computerScore );

        } else  {
            System.out.println("Koniec gry ");
            System.out.println("Wygrywa komputer");
            System.out.println("Z wynikiem :"+ computerScore+ ":" + playerScore );
        }
    }
    public String printRps(int playerChoice) {
        switch (playerChoice) {
            case 1:
                return "Kamień";
            case 2:
                return "Papier";
            case 3:
                return "Nożyce";
            default:
                return"Podano nie wyłaściwe dane. Spróbuj ponownie ";
        }

    }
}
