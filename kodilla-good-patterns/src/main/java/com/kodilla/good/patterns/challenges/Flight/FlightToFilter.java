package com.kodilla.good.patterns.challenges.Flight;

import java.util.List;
import java.util.stream.Collectors;

public class FlightToFilter implements FlightFilter {
    @Override
    public List<Flight> filter(List<Flight> flights, String destination) {
        return flights.stream()
                .filter(flight -> flight.getDestination().equals(destination))
                .collect(Collectors.toList());
    }
}