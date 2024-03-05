package com.kodilla.patterns.social;

import com.kodilla.patterns.strategy.social.*;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class UserTestSuite {

    @Test
    void testDefaultSharingStrategies() {
        // Given
        User millenial = new Millenials("John");
        User yGeneration = new YGeneration("Anna");
        User zGeneration = new ZGeneration("Mike");

        // When & Then
        assertEquals("Sharing on Facebook", millenial.sharePost());
        assertEquals("Sharing on Twitter", yGeneration.sharePost());
        assertEquals("Sharing on Snapchat", zGeneration.sharePost());
    }

    @Test
    void testIndividualSharingStrategy() {
        // Given
        User millenial = new Millenials("John");
        millenial.setSocialPublisher(new TwitterPublisher());

        // When & Then
        assertEquals("Sharing on Twitter", millenial.sharePost());
    }
}