package com.kodilla.testing.weather.mock;

import com.kodilla.testing.weather.stub.Temperatures;
import com.kodilla.testing.weather.stub.WeatherForecast;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;

import java.util.HashMap;
import java.util.Map;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.when;

class WeatherForecastTestSuite {

    @Mock
    private Temperatures temperaturesMock;

    @InjectMocks
    private WeatherForecast weatherForecast;

    @BeforeEach
    void setUp() {
        MockitoAnnotations.openMocks(this);

        Map<String, Double> temperaturesMap = new HashMap<>();
        temperaturesMap.put("Rzeszow", 25.5);
        temperaturesMap.put("Krakow", 26.2);
        temperaturesMap.put("Wroclaw", 24.8);
        temperaturesMap.put("Warszawa", 25.2);
        temperaturesMap.put("Gdansk", 26.1);

        when(temperaturesMock.getTemperatures()).thenReturn(temperaturesMap);
    }

    @Test
    @DisplayName("Should calculate forecast with mock temperatures")
    void testCalculateForecastWithMock() {
        // When
        int quantityOfSensors = weatherForecast.calculateForecast().size();

        // Then
        assertEquals(5, quantityOfSensors);
    }

    @Test
    @DisplayName("Should calculate average temperature with mock temperatures")
    void testCalculateAverageTemperatureWithMock() {
        // When
        double averageTemperature = weatherForecast.calculateAverageTemperature();

        // Then
        assertEquals(25.56, averageTemperature, 0.01);
    }

    @Test
    @DisplayName("Should calculate median temperature with mock temperatures")
    void testCalculateMedianTemperatureWithMock() {
        // When
        double medianTemperature = weatherForecast.calculateMedianTemperature();

        // Then
        assertEquals(25.5, medianTemperature, 0.01);
    }
}
