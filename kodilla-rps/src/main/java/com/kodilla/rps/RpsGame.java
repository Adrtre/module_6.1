package com.kodilla.rps;

public class RpsGame {

    public Player player;
    public int roundsToWin;
    public static int playerScore;
    public static int  computerScore;

    char playerMove;
    public RpsGame(Player player, int roundsToWin ) {
        this.player = player;
        this.roundsToWin = roundsToWin;



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