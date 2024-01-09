package com.kodilla.rps;

import java.util.InputMismatchException;
import java.util.Scanner;

public class IOInterface {
        private static final Scanner scanner = new Scanner(System.in);
    public static void displayGameInfo(int roundsToWin) {
        System.out.println("Zasady gry:");
        System.out.println("1 - kamien , 2- papier , 3- nozyce ");
        System.out.println("Kamień zgniata nożyce, \nNożyce tną papier, \nNapier przykrywa kamień");
        System.out.println("Ilość rund :" + roundsToWin);
        System.out.println("\nAby zakończyć grę, wciśnij 'x'. Aby rozpocząć nową grę, wciśnij 'n'.");
    }

    public static void logo(){
        System.out.println("           __          __  _   _               _                                                                                               \n" +
                "           \\ \\        / / (_) | |             (_)                                                                                              \n" +
                "            \\ \\  /\\  / /   _  | |_    __ _     _    __      __     __ _   _ __   ____   ___                                                    \n" +
                "             \\ \\/  \\/ /   | | | __|  / _` |   | |   \\ \\ /\\ / /    / _` | | '__| |_  /  / _ \\                                                   \n" +
                "              \\  /\\  /    | | | |_  | (_| |   | |    \\ V  V /    | (_| | | |     / /  |  __/                                                   \n" +
                "               \\/  \\/     |_|  \\__|  \\__,_|   | |     \\_/\\_/      \\__, | |_|    /___|  \\___|                                                   \n" +
                "        _____                    _           _/ |    _  __         __/ |        _                    _   _                                     \n" +
                "       |  __ \\                  (_)         |__/    | |/ /        |___/        (_)                  | \\ | |                                    \n" +
                "       | |__) |   __ _   _ __    _    ___   _ __    | ' /    __ _   _ __ ___    _    ___   _ __     |  \\| |   ___    ____  _   _    ___    ___ \n" +
                "       |  ___/   / _` | | '_ \\  | |  / _ \\ | '__|   |  <    / _` | | '_ ` _ \\  | |  / _ \\ | '_ \\    | . ` |  / _ \\  |_  / | | | |  / __|  / _ \\\n" +
                "       | |      | (_| | | |_) | | | |  __/ | |      | . \\  | (_| | | | | | | | | | |  __/ | | | |   | |\\  | | (_) |  / /  | |_| | | (__  |  __/\n" +
                "       |_|       \\__,_| | .__/  |_|  \\___| |_|      |_|\\_\\  \\__,_| |_| |_| |_| |_|  \\___| |_| |_|   |_| \\_|  \\___/  /___|  \\__, |  \\___|  \\___|\n" +
                "                        | |                                                                                                 __/ |              \n" +
                "                        |_|                                                                                                |___/               \n" +
                "\n");
    }

    public static int getRoundsCount (){
        int roundsToWin = 0;
        boolean validRounds = false;
        while (!validRounds) {
            try {
                System.out.println("Podaj liczbę rund: ");
                roundsToWin = scanner.nextInt();
                if (roundsToWin <= 0) {
                    throw new InputMismatchException("Liczba rund musi być większa od zera.");
                }
                validRounds = true;
            } catch (InputMismatchException e) {
                System.out.println("Błąd! Wprowadź poprawną liczbę całkowitą.");
                scanner.nextLine();
            }
        }
        return roundsToWin;

    }

    public static char getPlayerMove(){
        boolean validMove = false;
        char playerMove =' ';
        while (!validMove) {
            try {
                playerMove = scanner.next().charAt(0);
                if (playerMove < 1 || playerMove > 3) {
                    throw new InputMismatchException("Wprowadź poprawny ruch (1-3, x, n).");
                }
                validMove = true;
            } catch (InputMismatchException e) {
                System.out.println(playerMove);
                System.out.println("Błąd! Wprowadź poprawny ruch.");
                scanner.nextLine();
            }
        }
        return playerMove;
    }
    public static void isEnd(int playerScore , int roundsToWin , String playerName , int computerScore) {

        if (playerScore == roundsToWin) {
            System.out.println("---------------------");
            System.out.println("Koniec gry ");
            System.out.println("Wygrywa gracz " + playerName);
            System.out.println("Z wynikiem :"+ playerScore+ ":" + computerScore );

        } else if  (computerScore == roundsToWin) {
            System.out.println("---------------------");
            System.out.println("Koniec gry ");
            System.out.println("Wygrywa komputer");
            System.out.println("Z wynikiem :"+ computerScore+ ":" + playerScore );
            System.out.println("---------------------");
        }
        else {
            System.out.println("Koniec gry ");
            System.out.println("Gra zakończona przez gracza.");
            System.out.println("Z wynikiem :"+ computerScore+ ":" + playerScore );
            System.out.println("---------------------");
        }
    }
    public static boolean handleSpecialMoves(RpsGame games, String playerName, int roundsToWin, Player player , char playerMove) {


        if (playerMove == 'x') {
            return true;  // Zwracamy true, aby w RpsRunner zakończyć pętlę
        } else if (playerMove == 'n') {
            games = new RpsGame(player, roundsToWin);
            displayGameInfo(roundsToWin);
            return false;  // Zwracamy false, aby kontynuować pętlę w RpsRunner
        }

        return false;  // W przypadku innych ruchów również kontynuujemy pętlę
    }
}


