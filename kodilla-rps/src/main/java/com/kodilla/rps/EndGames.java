package com.kodilla.rps;

public class EndGames {

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
}
