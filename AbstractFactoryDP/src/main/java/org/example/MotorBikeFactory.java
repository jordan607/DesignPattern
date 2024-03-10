package org.example;

public class MotorBikeFactory implements VehicleFactory{
    @Override
    public Vehicle create(){
        return new Motorbike();
    }
}
