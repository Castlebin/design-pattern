package com.heller.dpj.ch01;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class VehicleTest {

    @Test
    public void testToString() {
        Vehicle vehicle1 = new Vehicle("BMW");
        Vehicle vehicle2 = new Car("Audi");

        assertEquals("Vehicle: BMW", vehicle1.toString());
        assertEquals("Car: Audi", vehicle2.toString());
    }

}