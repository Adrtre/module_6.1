package com.kodilla.rps;

public class DisplayGameInfo {

    public static void displayGameInfo(int roundsToWin) {
        System.out.println("Zasady gry:");
        System.out.println("1 - kamien , 2- papier , 3- nozyce ");
        System.out.println("Kamień zgniata nożyce, \nNożyce tną papier, \nNapier przykrywa kamień");
        System.out.println("Ilość rund :" + roundsToWin);
        System.out.println("\nAby zakończyć grę, wciśnij 'x'. Aby rozpocząć nową grę, wciśnij 'n'.");
    }
}
