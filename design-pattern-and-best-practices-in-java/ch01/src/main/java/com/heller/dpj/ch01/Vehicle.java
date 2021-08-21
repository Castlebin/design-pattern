package com.heller.dpj.ch01;

public class Vehicle {

    protected String name;

    public Vehicle(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Vehicle: " + name;
    }

}
