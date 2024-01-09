package com.kodilla.rps;

import java.util.Scanner;

import static com.kodilla.rps.IOInterface.*;

public class RpsRunner {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ClassLoader classLoader = RpsRunner.class.getClassLoader();
        logo();
        System.out.println("Podaj swoj nick");
        String playerName = "Adrian";


        int roundsToWin = getRoundsCount();
        Player player = new HumanPlayer();
        player.setName(playerName);
        Player computerPlayer = new ComputerPlayer();
        RpsGame rpsgames = new RpsGame(player, roundsToWin);
        displayGameInfo(roundsToWin);

        boolean end = false;
        while (!end) {

            boolean validMove = false;
            char playerMove = player.getMove();
            scanner.nextLine();
            end = handleSpecialMoves(rpsgames, playerName, roundsToWin , player, playerMove);


            rpsgames.printRps(player.getMove());
            PlayRound.playRound(playerName, rpsgames.playerScore, rpsgames.computerScore, rpsgames.playerMove);
            if (rpsgames.playerScore == roundsToWin || rpsgames.computerScore == roundsToWin) {
                end = true;
            }

        }
        IOInterface.isEnd(rpsgames.playerScore, roundsToWin , playerName , rpsgames.computerScore);
    }}



