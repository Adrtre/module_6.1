package com.kodilla.patterns.social;

import com.kodilla.patterns.strategy.social.*;
import org.junit.jupiter.api.Test;

public class UserTestSuite {

    @Test
    public void testDefaultSharingStrategies() {
        // Given
        User millenial = new Millenials("MillenialUser");
        User yGeneration = new YGeneration("YGenerationUser");
        User zGeneration = new ZGeneration("ZGenerationUser");

        // When
        millenial.sharePost();
        yGeneration.sharePost();
        zGeneration.sharePost();

    }

    @Test
    public void testIndividualSharingStrategy() {
        // Given
        User user = new User("CustomUser", new FacebookPublisher());

        User user2 = new User("CustomUser", new SnapchatPublisher());

        // When
        user.sharePost();

        user2.sharePost();


    }
}