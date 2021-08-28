package com.heller.dpj.ch02.factoryMethod;

public abstract class VehicleFactory {

    protected abstract Vehicle createVehicle(String size);

    public Vehicle orderVehicle(String size, String color) {
        Vehicle vehicle = createVehicle(size);

        vehicle.testVehicle();
        vehicle.setColor(color);

        return vehicle;
    }

}
