package com.kodilla.patterns.singleton;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class LoggerTestSuite {

    @Test
    void testGetLastLoad(){
        //Given
        Logger logger = Logger.INSTANCE;
        String logMessage = "This is a massage for test ";
        //When
        logger.log(logMessage);
        String lastlog = logger.getLastLog();
        //Given
        Assertions.assertEquals(logMessage , lastlog);


    }

}




//    Utwórz w katalogu src/test/java w pakiecie com.kodilla.patterns.singleton nowy zestaw testów
//    o nazwie LoggerTestSuite,a w nim testy sprawdzające działanie metody getLastLog() klasy Logger.
//    Aby to przetestować, zapisz coś wcześniej do logów przy pomocy metody log(String log).
//        Zmodyfikuj kod klasy Logger tak, aby była zgodna ze wzorcem "Singleton".
//        Zmodyfikuj napisane przed chwilą testy tak, aby uwzględniały zmiany w klasie Logger.
//        Utworzony kod prześlij do repozytorium GitHub.