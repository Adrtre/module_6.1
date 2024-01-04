package com.kodilla.rps;

public class RpsGame {

    public String playerName;
    public int roundsToWin;
    public static char playerScore;
    public static char computerScore;

    int playerMove;
    public RpsGame(String playerName, int roundsToWin ) {
        this.playerName = playerName;
        this.roundsToWin = roundsToWin;
        this.playerScore = 0;
        this.computerScore = 0; //<--- czemu poprawiło mi na 0 ? i ...

    }
    public static String printRps(int playerChoice) {
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