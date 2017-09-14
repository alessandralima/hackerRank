package com.exercises.logic;

public class Drone {
    private int id;
    private int flightRange;

    public Drone(int id, int flightRange) {

        this.id = id;
        this.flightRange = flightRange;
    }

    public int getId() {
        return id;
    }

    public int getFlightRange() {
        return flightRange;
    }
}