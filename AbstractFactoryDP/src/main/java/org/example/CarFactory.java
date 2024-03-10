package org.example;

public class CarFactory implements VehicleFactory {
    @Override
    public Vehicle create(){
        return new Car();
    }
}
