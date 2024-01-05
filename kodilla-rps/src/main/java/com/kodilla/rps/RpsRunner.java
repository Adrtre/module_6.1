package com.kodilla.rps;

import java.util.Scanner;

public class RpsRunner {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ClassLoader classLoader = RpsRunner.class.getClassLoader();
        //InputStream inputStream = classLoader.getResourceAsStream("logo.txt");
        Logo.display();
        System.out.println("Podaj swoj nick");
        String playerName = "Adrian";
        System.out.println("Podaj liczbę rund ");
        int roundsToWin = scanner.nextInt();

        RpsGame games = new RpsGame(playerName, roundsToWin);
        DisplayGameInfo.displayGameInfo(roundsToWin);

        boolean end = false;
        while (!end) {

            games.playerMove = scanner.nextInt();
            if (games.playerMove == 'x') {
                end = true;
                break;
            } else if (games.playerMove == 'n') {
                games = new RpsGame(playerName, roundsToWin);
                DisplayGameInfo.displayGameInfo(roundsToWin);
                continue;
            }

            games.printRps(games.playerMove);
            PlayRound.playRound(playerName, games.playerScore, games.computerScore, games.playerMove);
            if (games.playerScore == roundsToWin || games.computerScore == roundsToWin) {
                end = true;
            }

        }
        EndGames.isEnd(games.playerScore, roundsToWin , playerName , games.computerScore);
    }}



