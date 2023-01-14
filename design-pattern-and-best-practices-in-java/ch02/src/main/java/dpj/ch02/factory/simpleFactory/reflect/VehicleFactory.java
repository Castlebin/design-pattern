package dpj.ch02.factory.simpleFactory.reflect;

import java.util.HashMap;
import java.util.Map;

/**
 * 使用反射机制进行类注册的简单工厂模式（这个实现还有一点点问题没有补全，没有说什么地方去调用 registerVehicle）
 */
public class VehicleFactory {
    private static Map<String, Class<? extends Vehicle>> registeredProducts = new HashMap<>();

    public static Vehicle create(String type) throws InstantiationException, IllegalAccessException {
        return registeredProducts.get(type).newInstance();
    }

    public static void registerVehicle(String type, Class<? extends Vehicle> vehicleClass) {
        registeredProducts.put(type, vehicleClass);
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
