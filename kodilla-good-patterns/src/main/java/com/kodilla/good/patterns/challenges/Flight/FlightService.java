package com.kodilla.good.patterns.challenges.Flight;

import java.util.List;

public class FlightService {
    private final List<Flight> flights;

    public FlightService(List<Flight> flights) {
        this.flights = flights;
    }

    public List<Flight> filterFlights(FlightFilter flightFilter, String filterParam) {
        return flightFilter.filter(flights, filterParam);
    }
}