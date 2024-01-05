package com.kodilla.exception.test;

public class ExceptionTestRunner {
    public static void main(String[] args) {
        FlightFinder flightFinder = new FlightFinder();
        Flight validFlight = new Flight("Warsaw", "Berlin");
        Flight invalidFlight = new Flight("Warsaw", "London");


        try {
            flightFinder.findFlight(validFlight);
            flightFinder.findFlight(invalidFlight);
        } catch (RouteNotFoundException e) {
            System.out.println("Exception: " + e.getMessage());
        }
    }
}