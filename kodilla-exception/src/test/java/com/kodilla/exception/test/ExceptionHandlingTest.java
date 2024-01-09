
package com.kodilla.exception.test;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class ExceptionHandlingTest {

    private final SecondChallenge secondChallenge = new SecondChallenge();

    @Test
    void testProbablyIWillThrowException() {
        assertAll(
                () -> assertDoesNotThrow(() -> secondChallenge.probablyIWillThrowException(1.0, 2.0)),
                () -> assertThrows(Exception.class, () -> secondChallenge.probablyIWillThrowException(3, 2)),
                () -> assertThrows(Exception.class, () -> secondChallenge.probablyIWillThrowException(0.5, 1.5))
        );
    }
}
