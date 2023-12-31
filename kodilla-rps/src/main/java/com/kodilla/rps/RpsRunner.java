package com.kodilla.rps;

import java.util.Scanner;

public class RpsRunner {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Witaj w grze P K N");
        System.out.println("Podaj swoj nick");
        String playerName = "Adrian";
        System.out.println("Podaj liczbę rund ");

//        try {
            int roundsToWin = scanner.nextInt();
            RpsGams games = new RpsGams(playerName, roundsToWin);
            games.displayGameInfo();

            boolean end = false;
            while (!end) {
//                try {
                    games.playerMove = scanner.nextInt();
                    if (games.playerMove == 9) {
                        end = true;
                        break;
                    } else if (games.playerMove == 8) {
                        games = new RpsGams(playerName, roundsToWin);
                        games.displayGameInfo();
                        continue;
                    }

                    games.printRps(games.playerMove);
                    games.playRound();
                    if (games.playerScore == roundsToWin || games.computerScore == roundsToWin) {
                        end = true;
                    }

//                } catch (InputMismatchException e) {
//                    System.out.println("Podano niepoprawne dane. Spróbuj ponownie.");
//                    scanner.next();
                }
        games.isEnd();
            }

//        }
//        catch (InputMismatchException e) {
//            System.out.println("Podano niepoprawne dane. Koniec gry.");
//        }
    }

