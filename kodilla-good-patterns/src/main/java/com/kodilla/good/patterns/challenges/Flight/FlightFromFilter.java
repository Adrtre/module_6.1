package com.kodilla.good.patterns.challenges.Flight;

import java.util.List;
import java.util.stream.Collectors;

public class FlightFromFilter implements FlightFilter {
    @Override
    public List<Flight> filter(List<Flight> flights, String origin) {
        return flights.stream()
                .filter(flight -> flight.getOrigin().equals(origin))
                .collect(Collectors.toList());
    }
}