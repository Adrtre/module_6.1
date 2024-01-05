package com.kodilla.exception.test;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class SecondChallengeTest {

    private final SecondChallenge secondChallenge = new SecondChallenge();

    @Test
    void testProbablyIWillThrowException() {

        assertAll(
                () -> assertThrows(MyException.class, () -> secondChallenge.probablyIWillThrowException(2, 1)),
                () -> assertDoesNotThrow(() -> secondChallenge.probablyIWillThrowException(1.5, 2))
        );
    }
}