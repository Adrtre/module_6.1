package com.kodilla.patterns.builder.bigmac;


import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class BigmacTestSuite {

    @Test
    public void testBigmacBuilder() {
        // Given
        Bigmac bigmac = new Bigmac.BigmacBuilder()
                .bun("With sesame")
                .burgers(2)
                .sauce("Barbecue")
                .ingredient("Lettuce")
                .ingredient("Onion")
                .ingredient("Bacon")
                .build();

        // When
        int ingredientsCount = bigmac.getIngredients().size();
        String sauceType = bigmac.getSauce();
        String bunType = bigmac.getBun();
        int burgersCount = bigmac.getBurgers();

        // Then
        assertEquals(3, ingredientsCount);
        assertEquals("Barbecue", sauceType);
        assertEquals("With sesame", bunType);
        assertEquals(2, burgersCount);
    }
}