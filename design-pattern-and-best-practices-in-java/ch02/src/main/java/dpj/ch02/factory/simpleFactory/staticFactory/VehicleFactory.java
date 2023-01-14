package dpj.ch02.factory.simpleFactory.staticFactory;

/**
 * 简单工厂模式：1. 静态工厂模式
 */
// 静态工厂（调用者使用静态工厂来获取所需要的对象实例，而不是自己去new）
public class VehicleFactory {
    public enum VehicleType {
        Bike, Car, Truck
    }

    public static Vehicle create(VehicleType type) {
        if (type.equals(VehicleType.Bike)) {
            return new Bike();
        }
        if (type.equals(VehicleType.Car)) {
            return new Car();
        }
        if (type.equals(VehicleType.Truck)) {
            return new Truck();
        }
        return null;
    }
}

abstract class Vehicle {
    //abstract Vehicle class
}

class Bike extends Vehicle {
    //Bike implementation of vehicle
}

class Car extends Vehicle {
    //Car implementation of vehicle
}

class Truck extends Vehicle {
    //Bike implementation of vehicle
}
