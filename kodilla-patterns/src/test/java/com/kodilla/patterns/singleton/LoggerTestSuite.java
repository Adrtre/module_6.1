package com.kodilla.patterns.singleton;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class LoggerTestSuite {

    @Test
    void testGetLastLoad(){
        //Given
        Logger logger = Logger.getInstance();
        String logMessage = "This is a massage for test ";
        //When
        logger.log(logMessage);
        String lastlog = logger.getLastLog();
        //Given
        Assertions.assertEquals(logMessage , lastlog);
    }
    @Test
    void testGetLastLogAfterMultipleLogs() {
        // Given
        Logger logger = Logger.getInstance();
        String logMessage1 = "First log ";
        String logMessage2 = "Second log ";

        // When
        logger.log(logMessage1);
        logger.log(logMessage2);
        String lastLog = logger.getLastLog();

        // Then
        Assertions.assertEquals(logMessage2, lastLog);
    }
}



//    Utwórz w katalogu src/test/java w pakiecie com.kodilla.patterns.singleton nowy zestaw testów
//    o nazwie LoggerTestSuite,a w nim testy sprawdzające działanie metody getLastLog() klasy Logger.
//    Aby to przetestować, zapisz coś wcześniej do logów przy pomocy metody log(String log).
//        Zmodyfikuj kod klasy Logger tak, aby była zgodna ze wzorcem "Singleton".
//        Zmodyfikuj napisane przed chwilą testy tak, aby uwzględniały zmiany w klasie Logger.
//        Utworzony kod prześlij do repozytorium GitHub.