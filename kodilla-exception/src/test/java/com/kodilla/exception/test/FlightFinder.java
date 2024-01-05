package com.kodilla.exception.test;

import java.util.HashMap;
import java.util.Map;

class FlightFinder {
    private Map<String, Boolean> airports;

    public FlightFinder() {
        airports = new HashMap<>();
        airports.put("Warsaw", true);
        airports.put("Paris", true);
        airports.put("Berlin", true);
        airports.put("London", false); // Cannot fly to London
    }

    public void findFlight(Flight flight) throws RouteNotFoundException {
        String departureAirport = flight.getDepartureAirport();
        String arrivalAirport = flight.getArrivalAirport();

        if (!airports.containsKey(departureAirport) || !airports.containsKey(arrivalAirport)) {
            throw new RouteNotFoundException("Route not found: " + departureAirport + " -> " + arrivalAirport);
        }

        boolean canFly = airports.get(arrivalAirport);
        if (!canFly) {
            throw new RouteNotFoundException("Cannot fly to: " + arrivalAirport);
        }

        System.out.println("Flight found from " + departureAirport + " to " + arrivalAirport);
    }
}