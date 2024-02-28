package com.kodilla.testing.statistics;


import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

import java.util.ArrayList;
import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.when;

class StatisticsCalculatorTest {

    private Statistics statisticsMock;
    private StatisticsCalculator calculator;

    @BeforeEach
    void setUp() {
        statisticsMock = Mockito.mock(Statistics.class);
        calculator = new StatisticsCalculator();
    }

    @Test
    void testCalculateAdvStatistics_WhenNoPosts() {
        when(statisticsMock.postsCount()).thenReturn(0);
        calculator.calculateAdvStatistics(statisticsMock);
        assertEquals(0, calculator.getPostsCount());
        assertEquals(0, calculator.getAvgCommentsPerPost());
    }

    @Test
    void testCalculateAdvStatistics_When1000Posts() {
        when(statisticsMock.postsCount()).thenReturn(1000);
        calculator.calculateAdvStatistics(statisticsMock);
        assertEquals(1000, calculator.getPostsCount());
    }

    @Test
    void testCalculateAdvStatistics_WhenNoComments() {
        when(statisticsMock.commentsCount()).thenReturn(0);
        calculator.calculateAdvStatistics(statisticsMock);
        assertEquals(0, calculator.getCommentsCount());
        assertEquals(0, calculator.getAvgCommentsPerPost());
        assertEquals(0, calculator.getAvgCommentsPerUser());
    }

    @Test
    void testCalculateAdvStatistics_WhenCommentsLessThanPosts() {
        when(statisticsMock.postsCount()).thenReturn(10);
        when(statisticsMock.commentsCount()).thenReturn(5);
        calculator.calculateAdvStatistics(statisticsMock);
        assertEquals(10, calculator.getPostsCount());
        assertEquals(5, calculator.getCommentsCount());
        assertEquals(0.5, calculator.getAvgCommentsPerPost());
    }

    @Test
    void testCalculateAdvStatistics_WhenCommentsMoreThanPosts() {
        when(statisticsMock.postsCount()).thenReturn(5);
        when(statisticsMock.commentsCount()).thenReturn(10);
        calculator.calculateAdvStatistics(statisticsMock);
        assertEquals(5, calculator.getPostsCount());
        assertEquals(10, calculator.getCommentsCount());
        assertEquals(2, calculator.getAvgCommentsPerPost());
    }

    @Test
    void testCalculateAdvStatistics_WhenNoUsers() {
        when(statisticsMock.usersNames()).thenReturn(new ArrayList<>());
        calculator.calculateAdvStatistics(statisticsMock);
        assertEquals(0, calculator.getUserCount());
        assertEquals(0, calculator.getAvgCommentsPerUser());
        assertEquals(0, calculator.getAvgPostsPerUser());
    }

    @Test
    void testCalculateAdvStatistics_When100Users() {
        when(statisticsMock.usersNames()).thenReturn(new ArrayList<>(Arrays.asList(new String[100])));
        calculator.calculateAdvStatistics(statisticsMock);
        assertEquals(100, calculator.getUserCount());
    }
}