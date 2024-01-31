package com.kodilla.good.patterns.challenges.Flight;

import java.util.List;

public interface FlightFilter {
    List<Flight> filter(List<Flight> flights, String filterParam);
}