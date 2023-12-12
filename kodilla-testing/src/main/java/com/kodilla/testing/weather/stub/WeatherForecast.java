package com.kodilla.testing.weather.stub;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class WeatherForecast {
    private Temperatures temperatures;

    public WeatherForecast(Temperatures temperatures) {
        this.temperatures = temperatures;
    }

    public Map<String, Double> calculateForecast() {
        Map<String, Double> resultMap = new HashMap<>();

        for (Map.Entry<String, Double> temperature :
                temperatures.getTemperatures().entrySet()) {

            // adding 1 celsius degree to current value
            // as a temporary weather forecast
            resultMap.put(temperature.getKey(), temperature.getValue() + 1.0); // [1]
        }
        return resultMap;
    }
    public double calculateAverageTemperature() {
        List<Double> temperatureValues = temperatures.getTemperatures().values().stream().collect(Collectors.toList());

        double sum = temperatureValues.stream().mapToDouble(Double::doubleValue).sum();
        return sum / temperatureValues.size();
    }

    public double calculateMedianTemperature() {
        List<Double> temperatureValues = temperatures.getTemperatures().values().stream().sorted().collect(Collectors.toList());
        int size = temperatureValues.size();

        if (size % 2 == 0) {
            double mid1 = temperatureValues.get(size / 2 - 1);
            double mid2 = temperatureValues.get(size / 2);
            return (mid1 + mid2) / 2.0;
        } else {
            return temperatureValues.get(size / 2);
        }
    }
}