package com.example.timeplane;

public class Ticket {
    private String flightNumber;
    private String departure;
    private String destination;
    private String date;
    private double price;
    private String flightClass;

    public Ticket(String flightNumber, String departure, String destination, String date, double price, String flightClass) {
        this.flightNumber = flightNumber;
        this.departure = departure;
        this.destination = destination;
        this.date = date;
        this.price = price;
        this.flightClass = flightClass;
    }

    public String getFlightNumber() {
        return flightNumber;
    }

    public String getDeparture() {
        return departure;
    }

    public String getDestination() {
        return destination;
    }

    public String getDate() {
        return date;
    }

    public double getPrice() {
        return price;
    }

    public String getFlightClass() {
        return flightClass;
    }
}
