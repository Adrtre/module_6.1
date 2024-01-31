package com.kodilla.good.patterns.challenges.Flight;

import java.util.List;
import java.util.stream.Collectors;

public class FlightViaFilter implements FlightFilter {
    @Override
    public List<Flight> filter(List<Flight> flights, String via) {
        return flights.stream()
                .filter(flight -> flight.getOrigin().equals(via) || flight.getDestination().equals(via))
                .collect(Collectors.toList());
    }
}