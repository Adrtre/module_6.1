package com.kodilla.good.patterns.challenges.Flight;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Flight> flights = new ArrayList<>();
        flights.add(new Flight("Gdańsk", "Wrocław"));
        flights.add(new Flight("Gdańsk", "Kraków"));
        flights.add(new Flight("Kraków", "Wrocław"));
        flights.add(new Flight("Warszawa", "Kraków"));

        FlightService flightService = new FlightService(flights);

        FlightFilter flightFromFilter = new FlightFromFilter();
        FlightFilter flightToFilter = new FlightToFilter();
        FlightFilter flightViaFilter = new FlightViaFilter();

        System.out.println("Flights from Gdańsk: " + flightService.filterFlights(flightFromFilter, "Gdańsk"));
        System.out.println("Flights to Wrocław: " + flightService.filterFlights(flightToFilter, "Wrocław"));
        System.out.println("Flights via Kraków: " + flightService.filterFlights(flightViaFilter, "Kraków"));
    }
}